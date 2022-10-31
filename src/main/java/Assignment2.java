import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe");

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.phptravels.net/login/");
        String title = driver.getTitle();

        String newtitle = title.toUpperCase();
        if(newtitle.contains("PHPTRAVELS"))
            System.out.println("PASS");
        else
            System.out.println("FAIL");
        driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL);
        String title2 = driver.getTitle();

        if(title.equals(title2))
        {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }
        driver.navigate().back();
        String url= driver.getCurrentUrl();
        System.out.println(url);
        WebElement webElement = driver.findElement(By.xpath("//*[text()='Login' and @class='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-login-action']"));
        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();


    }
}
