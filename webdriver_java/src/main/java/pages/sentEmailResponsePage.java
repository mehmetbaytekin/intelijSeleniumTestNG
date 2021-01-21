package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class sentEmailResponsePage {
    private WebDriver driver;
    private By emailResponseText = By.id("content");

    public sentEmailResponsePage(WebDriver driver){
        this.driver=driver;
    }
    public String getTextEmailResponsePage(){
        return driver.findElement(emailResponseText).getText();
    }
}
