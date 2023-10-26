package Commons;

/*
@Author: jkrolikowski
@Date: 10/17/2023
*/

import Utils.Wait;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @Before
    public void setup(){

        String browserName = System.getProperty("browserName", "FIREFOX");

        driver = BrowserProvider.createDriver(browserName);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Wait.LONG_WAIT));

    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
