package Tests;

import Commons.BaseTest;
import Pages.AlertLoginPage;
import org.junit.Assert;
import org.junit.Test;

public class AlertLoginTest extends BaseTest {

    private final String username = System.getProperty("username", "admin");

    private final String password = System.getProperty("password", "admin");

    @Test
    public void test(){

        AlertLoginPage alertLoginPage = new AlertLoginPage(driver);

        alertLoginPage.logInToPage(username, password);

        Assert.assertEquals("Congratulations! You must have the proper credentials.", alertLoginPage.getHeaderText());
    }

}
