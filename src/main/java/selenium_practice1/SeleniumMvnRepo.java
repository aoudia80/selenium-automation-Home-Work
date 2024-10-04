package selenium_practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumMvnRepo {
    //F:\IntellijProject\selenium.first.project\src\main\resources\chromedriver.exe
    public static void main(String[] args) {
        String path=System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"
                +File.separator+"resources"+File.separator+"chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.25.0");

    }
}



