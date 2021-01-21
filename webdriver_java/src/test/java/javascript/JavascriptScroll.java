package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavascriptScroll extends BaseTests {

    @Test
    public void ScrollTest() throws Exception {
        homePage.clickLargeAndDeepDomPage().scrollTable();
    }

    @Test
    public void testScrollToParagraph() throws InterruptedException {
        homePage.clickInfiniteScroll().scrollDownByIndex(5);
    }
}
