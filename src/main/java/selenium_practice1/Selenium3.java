package selenium_practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class Selenium3 {
    public static void main(String[] args) {
        //F:\IntellijProject\selenium.first.project\src\main\resources\geckodriver.exe
        String path = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"resources"+File.separator+"geckodriver.exe";
        System.setProperty("webdriver.firefox.driver",path);
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.google.com/");
    }
}
