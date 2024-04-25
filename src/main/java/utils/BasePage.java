package utils;
 
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
 
public class BasePage {

    protected WebDriver driver;
    
    
    public BasePage() {

        // Construct the path to Chromedriver executable

        String chromeDriverPath = System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe";
 
        // Set Chromedriver path

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
 
        // Initialize ChromeDriver

       this.driver = new ChromeDriver();
        

    }
 
    public WebDriver getDriver() {

        return driver;

    }

}
