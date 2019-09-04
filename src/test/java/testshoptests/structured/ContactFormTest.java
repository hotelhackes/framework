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



//
//        // Fill contact form and send it
//        ContactFormPage contactFormPage = new ContactFormPage(driver);
//        contactFormPage.sendFilledInContactForm(
//                ContactFormPage.SubjectHeadings.WEBMASTER,
//                "test@test.com",
//                "0987654321",
//                "Some message");
//
//        // Verify message was sent
//        Assert.assertEquals("Your message has been successfully sent to our team.",
//                contactFormPage.getAlertMessage());

    }

}
