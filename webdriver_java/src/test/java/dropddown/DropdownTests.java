package dropddown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption() throws InterruptedException {
        var dropDownPage = homePage.clickDropDown();
        String option ="Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect select");
        assertTrue(selectedOptions.contains(option),"Option no selected");

    }
}
