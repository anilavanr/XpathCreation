
package test.four;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.four.*;

import java.io.IOException;
public class SauceDemo_Test {

    public WebDriver driver;
    Login lg;
    Home_Page home_page;
    Sort_Cart sc;
    Cart_Operation Cp;
    Check_Out check_out;
    public static Logger log = LogManager.getLogger();


    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        log.info("Opening Website");
    }

    @Test
    public void Login() throws IOException, InterruptedException {
        log.info("Test1 Running");
        lg = new Login(driver);
        lg.login();


    }

    @Test(priority = 1)
    public void Home_page() throws InterruptedException {
        log.info("Test2 Running");
        home_page = new Home_Page(driver);
        home_page.home();
        home_page.price();
        home_page.Cart_Enabled();
        Assert.assertTrue(true);

    }

    @Test(priority = 2)
    public void Sort_Cart() throws InterruptedException {
        log.info("Test3 Running");
        sc = new Sort_Cart(driver);
        sc.cart_click();
        sc.Lowest();
        Assert.assertTrue(true);


    }

    @Test(priority = 4)
    public void cart_operation() throws InterruptedException {
        log.info("Test4 Running");
        Cp = new Cart_Operation(driver);
        Cp.cart_count(2);
        Cp.product_count(2);
        Assert.assertTrue(true);

    }

    @Test(priority = 5)
    public void Check_out() throws InterruptedException {
        log.info("Test6 Running");
        check_out = new Check_Out(driver);
        check_out.check_out();
        check_out.finish();

    }

    @AfterTest
    public void Chrome_CLosing() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();


    }
}


