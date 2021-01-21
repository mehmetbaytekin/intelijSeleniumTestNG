package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WYSIWYGPage {
    private WebDriver driver;
    private WebDriverWait wait;
    BaseFunctions bf;

    public WYSIWYGPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        this.bf = new BaseFunctions(driver);

    }

    @FindBy(xpath = "//*[@class='tox-editor-container']//following::iframe[1]")
    private WebElement iframeElement;

    @FindBy(xpath = "//*[@id='tinymce']//p[1]")
    private WebElement iframeTextArea;

    public void changeIframe(){
        driver.switchTo().frame(iframeElement);
        iframeTextArea.clear();
        iframeTextArea.sendKeys("Hello");
    }
    public String controlTextInIframe() throws InterruptedException {
        bf.waitLoad();
        return iframeTextArea.getText();
    }


}
