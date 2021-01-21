package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() throws InterruptedException {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\mehmet.baytekin\\IdeaProjects\\webdriver_java\\resources\\chromedriver.exe");
    }
}
