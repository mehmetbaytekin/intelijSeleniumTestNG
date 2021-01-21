package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ContextTests extends BaseTests {

    @Test
    public void ContextTests() throws InterruptedException {
        var EntryPage = homePage.clickContextMenuPage();
        EntryPage.rightClickContextArea();
        EntryPage.okContextAlert();
    }

    @Test
    public void getTextContextTests() throws InterruptedException {
        var EntryPage = homePage.clickContextMenuPage();
        EntryPage.rightClickContextArea();
        assertEquals(EntryPage.okContextAlertGetText(),"You selected a context menu","contextAlert messeage not show");
    }

}
