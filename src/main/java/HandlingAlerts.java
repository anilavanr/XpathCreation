import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://the-internet.herokuapp.com/ ");

        driver.findElement(By.xpath("//a[contains(text(),'JavaScript Alerts')]")).click();
        driver.findElement(By.xpath("button[contains(text(),'click for JS Prompt')]")).click();
        Thread.sleep(1000);

        String a = "text";

        driver.switchTo().alert();
        driver.switchTo().alert().sendKeys(a);
        driver.switchTo().alert().accept();

    }
}
