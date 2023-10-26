package Tests;/*
@Author: jkrolikowski
@Date: 10/17/2023
*/

import Commons.BaseTest;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.junit.Assert;
import org.junit.Test;


public class LoginTest extends BaseTest {


    private final String username = System.getProperty("username", "tomsmith");

    private final String password = System.getProperty("password", "SuperSecretPassword!");

    @Test
    public void test(){

        LoginPage loginPage = new LoginPage(driver);

        loginPage.loadLoginPage();

        loginPage.fillInLoginCredentials(username, password);

        loginPage.submitLogin();

        SecureAreaPage secureAreaPage = new SecureAreaPage(driver);

        Assert.assertEquals("Secure Area", secureAreaPage.getHeaderText());

    }

}
