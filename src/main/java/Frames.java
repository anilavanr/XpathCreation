import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

    public static void main(String[] args) throws Exception{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(20000);
        WebElement frames = driver.findElement(By.xpath("//a[@href='/frames']"));
        frames.click();
        Thread.sleep(2000);
        WebElement nested_frames = driver.findElement(By.xpath("//a[@href='/nested_frames']"));
        nested_frames.click();

        Thread.sleep(3000);
        driver.navigate().refresh();
        driver.close();
        System.exit(0);

    }
}