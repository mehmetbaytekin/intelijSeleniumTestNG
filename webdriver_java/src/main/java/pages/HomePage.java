package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    BaseFunctions bf;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.bf = new BaseFunctions(driver);
    }

    public LoginPage clickFormAuthentication() throws InterruptedException {
        bf.clickLink("Form Authentication");
        return PageFactory.initElements(driver,LoginPage.class);
    }

    public DropDownPage clickDropDown() throws InterruptedException {
        bf.clickLink("Dropdown");
        return PageFactory.initElements(driver, DropDownPage.class);
    }

    public ForgotPasswordPage clickForgotPassword() throws InterruptedException {
        bf.clickLink("Forgot Password");
        return PageFactory.initElements(driver, ForgotPasswordPage.class);
    }

    public HoversPage clickHovers() throws InterruptedException {
        bf.clickLink("Hovers");
        return PageFactory.initElements(driver, HoversPage.class);
    }

    public KeypressessPage clickKeyPresses() throws InterruptedException {
        bf.clickLink("Key Presses");
        return PageFactory.initElements(driver, KeypressessPage.class);
    }

    public AlertsPage clickJavaScriptAlerts() throws InterruptedException {
        bf.clickLink("JavaScript Alerts");
        return PageFactory.initElements(driver, AlertsPage.class);
    }

    public FileUploadPage clickFileUpload() throws InterruptedException {
        bf.clickLink("File Upload");
        return PageFactory.initElements(driver, FileUploadPage.class);
    }

    public EntryAdPage clickEntryAdPage() throws InterruptedException {
        bf.clickLink("Entry Ad");
        return PageFactory.initElements(driver, EntryAdPage.class);
    }

    public ContextMenuPage clickContextMenuPage() throws InterruptedException {
        bf.clickLink("Context Menu");
        return PageFactory.initElements(driver, ContextMenuPage.class);
    }

    public WYSIWYGPage clickWYSIWYGPage() throws InterruptedException {
        bf.clickLink("WYSIWYG Editor");
        return PageFactory.initElements(driver, WYSIWYGPage.class);

    }

    public DynamicLoadingPage clickDynamicLoadingPage() throws InterruptedException {
        bf.clickLink("Dynamic Loading");
        return PageFactory.initElements(driver, DynamicLoadingPage.class);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDomPage() throws InterruptedException {
        bf.clickLink("Large & Deep DOM");
        return PageFactory.initElements(driver,LargeAndDeepDomPage.class);
    }

    public InfiniteScroll clickInfiniteScroll() throws InterruptedException {
        bf.clickLink("Infinite Scroll");
        return PageFactory.initElements(driver,InfiniteScroll.class);
    }
}
