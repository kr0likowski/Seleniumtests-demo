package Pages;

/*
@Author: jkrolikowski
@Date: 10/17/2023
*/

import Commons.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class LoginPage extends Page {

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement usernameBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordBox;

    @FindBy(xpath = "//button")
    private WebElement submitButton;

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);

        Objects.requireNonNull(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void loadLoginPage(){
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void fillInLoginCredentials(String username, String password){

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);

    }

    public void submitLogin(){

        submitButton.click();
    }
}
