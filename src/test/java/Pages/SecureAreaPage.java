package Pages;

import Commons.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class SecureAreaPage extends Page {

   @FindBy(xpath = "/html/body/div[2]/div/div/h2")
    WebElement headerField;

    public SecureAreaPage(WebDriver driver){
        super(driver);

        Objects.requireNonNull(driver);
        PageFactory.initElements(driver, this);
    }

    public String getHeaderText(){
        return headerField.getText();
    }
}
