package Commons;

/*
@Author: jkrolikowski
@Date: 10/17/2023
*/

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import io.github.bonigarcia.wdm.managers.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserProvider {

    public static WebDriver createDriver(String browser){

        WebDriver driver = null;

        switch(browser){
            case "FIREFOX":
                FirefoxDriverManager.getInstance().setup();
                driver = new FirefoxDriver();
                break;
            case "CHROME":
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
            case "IE":
                InternetExplorerDriverManager.getInstance().setup();
                driver = new InternetExplorerDriver();
                break;
            default:
                ChromeDriverManager.getInstance().setup();
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }

}
