package Pages.four;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Sort_Cart {

    WebDriver driver;
    public static Logger log = LogManager.getLogger();

    public Sort_Cart(WebDriver driver) {
        this.driver = driver;
    }

    public void cart_click() throws InterruptedException {

        Thread.sleep(4000);
        driver.findElement(By.className("shopping_cart_link")).click();
        log.info("Cart Icon Clicked");
        Thread.sleep(4000);
        driver.findElement(By.id("continue-shopping")).click();
    }

    public void Lowest() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.className("product_sort_container")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//option[@value='lohi']")).click();
        float price = Float.parseFloat(driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText().replace("$", ""));
        System.out.println("Lowest price of the List is:$" + price);
        Thread.sleep(4000);
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();


    }


}
