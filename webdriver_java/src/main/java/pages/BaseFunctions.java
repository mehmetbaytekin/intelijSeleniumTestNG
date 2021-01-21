package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.function.Predicate;

public class BaseFunctions {
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunctions(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void waitLoad() throws InterruptedException {
        Thread.sleep(1000);
        Predicate<WebDriver> pageLoaded = input -> ((JavascriptExecutor) input).executeScript("return document.readyState").equals("complete");
    }

    public void clickLink(String text) throws InterruptedException {
        waitLoad();
        driver.findElement(By.linkText(text)).click();
    }

    public void clicke(WebElement element) throws InterruptedException {
        Thread.sleep(1000);
        waitLoad();
        wait.until(ExpectedConditions.visibilityOf(element));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void writee(WebElement element, String text) throws InterruptedException {
        Thread.sleep(1000);
        waitLoad();
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);

    }
    public void sendKeyss(WebElement element) throws InterruptedException {
        Thread.sleep(1000);
        waitLoad();
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(Keys.RETURN);
    }
    public String getTexte(WebElement element) throws InterruptedException {
        waitLoad();
        return element.getText();

    }

    public void scrollUp() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

    }
    public void scrollDown() {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public void scrollDownByPixel(String pixel) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0," + pixel + ")");
    }

    public void ScrolElemakaydir(WebElement element, WebDriver driver) throws Exception {

        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", element);

    }

}
