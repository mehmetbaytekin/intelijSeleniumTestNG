package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Predicate;

public class ContextMenuPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By contextArea = By.xpath("//*[contains(text(),'Right-cl')]/following::div[1]");

    public ContextMenuPage(WebDriver driver){
        this.driver= driver;
        this.wait = new WebDriverWait(driver,60);
    }
    public void waitLoad() throws InterruptedException {
        Thread.sleep(1000);
        Predicate<WebDriver> pageLoaded = input -> ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
    }

    public void rightClickContextArea() throws InterruptedException {
        waitLoad();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(contextArea)).contextClick().build().perform();

    }
    public String okContextAlertGetText() throws InterruptedException {
        waitLoad();
        return driver.switchTo().alert().getText();
    }

    public void okContextAlert() throws InterruptedException {
        waitLoad();
        driver.switchTo().alert().accept();
    }
}
