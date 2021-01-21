package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class InfiniteScroll {
    private WebDriver driver;
    BaseFunctions bf;

    By textBlocks = By.className("jscroll-added");

    @FindBy(className = "jscroll-added")
    WebElement scrollAdded;

    public  InfiniteScroll(WebDriver driver) {
        this.driver = driver;
        this.bf = new BaseFunctions(driver);
    }

    public void scrollDownByIndex(int index) {

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        while (getScrollParagraphsPresent() < index) {
            jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        }
    }

    private int getScrollParagraphsPresent() {

        return driver.findElements(textBlocks).size();
    }

}
