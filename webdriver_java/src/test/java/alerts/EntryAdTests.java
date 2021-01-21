package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EntryAdTests extends BaseTests {

    @Test
    public void TestEntryAdPage() throws InterruptedException {
        var EntryAdPage= homePage.clickEntryAdPage();
        assertEquals(EntryAdPage.getModalTitleText(),"THIS IS A MODAL WINDOW","modal title incorrect");

    }

    @Test
    public void TestCloseModal() throws InterruptedException {
        var EntryAdPage = homePage.clickEntryAdPage();
        EntryAdPage.closeModal();
        assertEquals(EntryAdPage.afterCloseModals(),"Displays an ad on page load.","modal not closed");

    }
}
