import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Xpath {
    public WebDriver driver;
    String driverPath = "C:\\Users\\anilavanr\\Chrome driver\\chromedriver.exe";

    By logo_image = By.xpath("//div[contains(@class,'logo')]//img");
    By hotels = By.xpath("//a[contains(@class,'active_hotels waves-effect')]");
    By Flight = By.xpath("//a[contains(@class,'active_flights waves-effect')]");
    By tour = By.xpath("//a[contains(@class,'active_tours waves-effect')]");
    By Company = By.xpath("//a[contains(text(),'Company')]");
    By Signup = By.xpath("//a[contains(text(),'Customer Signup')]");
    By login = By.xpath("//a[contains(text(),'Customer Login')]");
    By agent = By.xpath("//a[contains(text(),'Agents Login')]");
    @Test
    public void Xpathexample() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/hotels");
        driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        logo_display();
        hotels_display();
        Flight_display();
        tour_display();
        Company_display();
        Signup_display();
        login_display();
        agent_display();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        calender_check();
        //travelers();

    }
    private void calender_check() {
        if (driver.findElement(agent).isDisplayed())
            System.out.println("agent present");
        else {
            System.out.println("agent not present");
        }
    }


    private void agent_display() {
        if (driver.findElement(agent).isDisplayed())
            System.out.println("agent present");
        else {
            System.out.println("agent not present");
        }
    }

    private void login_display() {
        if (driver.findElement(login).isDisplayed())
            System.out.println("Login present");
        else {
            System.out.println("Login not present");
        }

    }

    private void Signup_display()
    {
        if (driver.findElement(Signup).isDisplayed())
            System.out.println("Signup present");
        else {
            System.out.println("Signup not present");
        }

    }

    private void Company_display() {
        if (driver.findElement(Company).isDisplayed())
            System.out.println("Company present");
        else {
            System.out.println("Company not present");
        }
        driver.findElement(By.xpath("//button[@id='ACCOUNT']")).click();
    }

    private void tour_display() {
        if (driver.findElement(tour).isDisplayed())
            System.out.println("Tour present");
        else {
            System.out.println("Tour not present");
        }

    }

    private void Flight_display() {
        if (driver.findElement(Flight).isDisplayed())
            System.out.println("Flights present");
        else {
            System.out.println("Flights not present");
        }

    }

    private void hotels_display() {
        if (driver.findElement(hotels).isDisplayed())
            System.out.println("Hotels present");
        else {
            System.out.println("Hotels not present");
        }

    }

    private void logo_display() {
        if (driver.findElement(logo_image).isDisplayed())
            System.out.println("Logo present");
        else {
            System.out.println("Logo not present");
        }

    }
}