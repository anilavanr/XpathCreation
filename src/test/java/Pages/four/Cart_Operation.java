package Pages.four;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Cart_Operation {

    WebDriver driver;
    public Cart_Operation(WebDriver driver){
        this.driver=driver;
    }

    public void cart_count(int count){


        int n= Integer.parseInt(driver.findElement(By.className("shopping_cart_badge")).getText());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        if(n==1){
            driver.navigate().refresh();
        }
        else if (n==count)
        {
            System.out.println("Product number:"+n);
            driver.findElement(By.className("shopping_cart_link")).click();
        }
    }

    public void product_count(int count) throws InterruptedException {

        int n=driver.findElements(By.className("cart_quantity")).size();
        if(n==count){
            System.out.println("Quantity matches with the number of items shown on the CART in previous page");
        }
        Thread.sleep(4000);
        WebElement Element = driver.findElement(By.id("checkout"));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Element.click();


    }
}
