package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LargeAndDeepDomPage {
    private WebDriver driver;
    BaseFunctions bf;

    @FindBy(id="large-table")
    WebElement table;

    public LargeAndDeepDomPage(WebDriver driver){
        this.driver=driver;
        this.bf=new BaseFunctions(driver);
    }

    public void scrollTable() throws Exception {
        bf.ScrolElemakaydir(table,driver);
    }

}
