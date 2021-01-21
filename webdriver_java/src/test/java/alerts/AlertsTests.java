package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert() throws InterruptedException {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You successfuly clicked an alert","Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert() throws InterruptedException {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDissmis();
        assertEquals(text,"I am a JS Confirm","Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert() throws InterruptedException {
        var alertsPage=homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();

        String text="Deneme";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }
}
