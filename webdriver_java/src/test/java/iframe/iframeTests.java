package iframe;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class iframeTests extends BaseTests {
    @Test
    public void iframeTests() throws InterruptedException {
        var WYSIWYGPage = homePage.clickWYSIWYGPage();
        WYSIWYGPage.changeIframe();
        assertEquals(WYSIWYGPage.controlTextInIframe(),"Hello","text didnt write");

    }
}
