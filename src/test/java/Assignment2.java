import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

class Assignment2 {
    public static WebDriver driver;
    String driverPath = "C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe";
    @Test
    public void website() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://phptravels.com/demo");
        /*Parent Window*/
        String pw=driver.getWindowHandle();
        String title =driver.getTitle();
        System.out.println(title);
        title_status(title);
        login(title,pw);
        String Url=driver.getCurrentUrl();
        System.out.println(Url);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='jfHeader-menuListLink jfHeader-dynamicLink js-tracking js-myforms']")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.quit();
    }
    public void login(String t,String pw) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[text()='Login' and @class='jfHeader-menuListLink jfHeader-dynamicLink jfHeader-login-action']")).click();
        String title1=driver.getTitle();
        if(title1.equals(t))
        {
            System.out.println("Pass");
        }else
        {
            System.out.println("Fail");
        }
        Thread.sleep(5000);
        driver.switchTo().window(pw);
    }

    private void title_status(String title) {
        if(title.equals("PHPTRAVELS")){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
    }


}