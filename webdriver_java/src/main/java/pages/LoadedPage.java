package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoadedPage {
    private WebDriver driver;
    BaseFunctions bf;
    @FindBy(xpath = "//*[text()='Start']")
    WebElement startButton;
    @FindBy(xpath="//*[@id='finish' and @style='']")
    WebElement startgetTextButton;

    public LoadedPage(WebDriver driver) {
        this.driver = driver;
        this.bf = new BaseFunctions(driver);
    }


    public void clickStartButton() throws InterruptedException {
        bf.clicke(startButton);
    }
    public String getTextStart() throws InterruptedException {
        return bf.getTexte(startgetTextButton);
    }
}
