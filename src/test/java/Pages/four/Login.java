package Pages.four;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;


public class Login {

    WebDriver driver;
    public static Logger log = LogManager.getLogger();

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void login() throws IOException, InterruptedException {

        String excelfile = "C:\\Users\\anilavanr\\Documents\\MiniAssignment-4.xlsx";
        log.info("XLSX file is being read.");
        FileInputStream fis = new FileInputStream(excelfile);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = xssfWorkbook.getSheetAt(0);

        XSSFRow row = null;
        XSSFCell cell = null;
        String usename = null;
        String password = null;

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            row = sheet.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                cell = row.getCell(j);
                if (j == 0) {
                    usename = cell.getStringCellValue();
                }
                if (j == 1) {
                    password = cell.getStringCellValue();
                }
            }

            driver.findElement(By.id("user-name")).sendKeys(usename);
            driver.findElement(By.id("password")).sendKeys(password);
            Thread.sleep(2000);
            driver.findElement(By.id("login-button")).click();
            log.info("Login Button Pressed");
            String actualurl = driver.getCurrentUrl();
            boolean isloggedin = actualurl.equals("https://www.saucedemo.com/inventory.html");
            String result = null;

            if (isloggedin) {
                result = "Login Successfull";
                System.out.println(result);
            } else {
                result = "Login Unsuccessful";
                System.out.println(result);
            }
        }
        fis.close();
    }


}
