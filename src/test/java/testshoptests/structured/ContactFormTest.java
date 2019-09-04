package testshoptests.structured;

import org.junit.*;
import pages.ContactFormPage;
import pages.HomePage;
import testshoptests.TestShopScenario;

public class ContactFormTest extends TestShopScenario {

    @Test
    public void completeContactFormStructured() {

        // Goto contact us page
        HomePage homePage = new HomePage(driver);

        homePage.setNextButton();
        homePage.setNextButton();
        homePage.setNextButton();
        homePage.setNextButton();
//        homePage.setNextButton();
        homePage.setCloseButton();


// Fill contact form and submit it
        homePage.sendFilledInContactForm(

                "hotelhacker",
                "test@test.com",
                "0987654321",
                "a test",
                "Some message");

        // Verify message was sent
        // TODO
        //Assert.assertEquals("Your message has been successfully sent to our team.",
//                contactFormPage.getAlertMessage());

    }

}
