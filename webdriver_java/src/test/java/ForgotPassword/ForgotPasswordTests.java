package ForgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.sentEmailResponsePage;

import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void ForgotPasswordTests() throws InterruptedException {
        ForgotPasswordPage forgotPasswordPage= homePage.clickForgotPassword();
        forgotPasswordPage.setEmailField("mehmetbaytekin36@gmail.com");
        sentEmailResponsePage emailResponse = forgotPasswordPage.clickRetrievePasswordButton();
        assertTrue(emailResponse.getTextEmailResponsePage().contains("Your e-mail's been sent!"),"incorrect");
    }
}
