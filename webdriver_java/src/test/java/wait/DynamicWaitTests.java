package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.LoadedPage;

import static org.testng.Assert.assertEquals;

public class DynamicWaitTests extends BaseTests {
    @Test
    public void DynamicWaitTests() throws InterruptedException {
        DynamicLoadingPage dlp = homePage.clickDynamicLoadingPage();
        LoadedPage llp = dlp.clickExample1();
        llp.clickStartButton();
        assertEquals(llp.getTextStart(),"Hello World!","time mistake");

    }
}
