package Commons;

/*
@Author: jkrolikowski
@Date: 10/17/2023
*/

import Utils.Wait;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    void setup(){

        String browserName = System.getProperty("browserName");

        driver = BrowserProvider.createDriver(browserName);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Wait.SHORT_WAIT));

    }

    @AfterTest
    void tearDown(){
        driver.quit();
    }

}
