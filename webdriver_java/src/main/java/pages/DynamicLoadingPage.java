package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadingPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[text()='Example 1: Element on page that is hidden']")
    WebElement example1;
    BaseFunctions bf;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
        this.bf = new BaseFunctions(driver);
    }

    public LoadedPage clickExample1() throws InterruptedException {
        bf.clicke(example1);
        return PageFactory.initElements(driver,LoadedPage.class);
    }

}
