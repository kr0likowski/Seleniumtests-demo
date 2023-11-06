package Commons;

/*

@Author: jkrolikowski
@Date: 10/17/2023

This class should be extended by other Page classes containing only basic page methods

*/

import org.openqa.selenium.WebDriver;

public class Page {

    private WebDriver driver;

    public Page(WebDriver driver){
        this.driver = driver;
    }

    public String getTitle(){
        return driver.getTitle();
    }

}
