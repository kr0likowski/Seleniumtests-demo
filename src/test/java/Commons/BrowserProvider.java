package Commons;

/*
@Author: jkrolikowski
@Date: 10/17/2023

This is class used to manage and setup WebDrivers

*/

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserProvider {

    public static WebDriver createDriver(String browser){

        WebDriver driver = null;

        switch(browser){
            case "FIREFOX":
                FirefoxDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "CHROME":
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "EDGE":
                EdgeDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }

}
