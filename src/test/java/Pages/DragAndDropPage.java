package Pages;

import Commons.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Objects;

public class DragAndDropPage extends Page {

    @FindBy(xpath = "//*[@id=\"column-a\"]")
    public WebElement boxA;

    @FindBy(xpath = "//*[@id=\"column-b\"]")
    public WebElement boxB;

    @FindBy(xpath = "//*[@id=\"column-a\"]/header")
    public WebElement boxAHeader;


    WebDriver driver;
    public DragAndDropPage(WebDriver driver) {
        super(driver);
        Objects.requireNonNull(driver);
        PageFactory.initElements(driver,this);
        this.driver = driver;

    }

    public void loadDragAndDropPage(){

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
    }

    public void dragAndDrop(){

        Actions builder = new Actions(driver);

        Action dragAndDrop = builder.clickAndHold(boxA)
                .moveToElement(boxB)
                .release(boxB)
                .build();

        dragAndDrop.perform();
    }

    public String getBoxAText(){
        return boxAHeader.getText();
    }
}
