package Pages.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class Home_Page {

    WebDriver driver;


    public Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    public void home() {

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.findElement(By.className("product_sort_container")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//option[@value='hilo']")).click();
        if (driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).isEnabled()) {
            System.out.println("ADD TO CART is Enabled");

        } else {
            System.out.println("ADD TO CART is disabled");
        }
    }

    public void price() throws InterruptedException {
        Thread.sleep(2000);
        float price = Float.parseFloat(driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText().replace("$", ""));
        System.out.println("The Price of the Product is:$" + price);
        if (price <= 100.00) {
            System.out.println("Product added to Cart ");
            driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        } else {
            return;
        }
    }

    public void Cart_Enabled() throws InterruptedException {
        if (driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).isEnabled()) {
            System.out.println("Remove Option is Enabled");
        } else {
            System.out.println("Remove is not Enabled");
        }
        Thread.sleep(4000);
        driver.findElement(By.id("remove-sauce-labs-fleece-jacket")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
    }



}
