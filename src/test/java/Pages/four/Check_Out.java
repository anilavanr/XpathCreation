package Pages.four;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Check_Out {

    WebDriver driver;
    public static Logger log = LogManager.getLogger();
    public  Check_Out(WebDriver driver){
        this.driver=driver;
    }

    public void check_out() throws InterruptedException {


        driver.findElement(By.id("first-name")).sendKeys("Arul");
        driver.findElement(By.id("last-name")).sendKeys("Nilavan");
        driver.findElement(By.id("postal-code")).sendKeys("56000");
        Thread.sleep(4000);
        driver.findElement(By.id("continue")).click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }

    public void finish(){
        WebElement Element=driver.findElement(By.id("finish"));
        Element.click();
        System.out.println("THANK YOU FOR YOUR ORDER");

    }
}
