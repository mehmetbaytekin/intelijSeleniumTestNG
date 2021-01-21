package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Predicate;

public class EntryAdPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By modalTitle = By.className("modal-title");
    private By closeModal = By.className("modal-footer");
    private By afterCloseModal = By.xpath("//*[contains(text(),'Displays an ad on page load')]");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
        this.wait =new WebDriverWait(driver,60);
    }
    public void waitLoad() throws InterruptedException {
        Thread.sleep(1000);
        Predicate<WebDriver> pageLoaded = input -> ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
    }

    public String getModalTitleText() throws InterruptedException {
        waitLoad();
        return driver.findElement(modalTitle).getText();
    }

    public void closeModal() throws InterruptedException {
        waitLoad();
        driver.findElement(closeModal).click();
    }
    public String afterCloseModals() throws InterruptedException {
        waitLoad();
        return driver.findElement(afterCloseModal).getText();
    }

}
