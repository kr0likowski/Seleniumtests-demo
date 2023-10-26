package Pages;

import Commons.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class AlertLoginPage extends Page {

    @FindBy(xpath = "/html/body/div[2]/div/div/p")
    WebElement headerText;

    WebDriver driver;
    public AlertLoginPage(WebDriver driver) {
        super(driver);
        Objects.requireNonNull(driver);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void logInToPage(String username, String password){
        driver.get("https://"+ username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
    }

    public String getHeaderText(){
        return headerText.getText();
    }


}
