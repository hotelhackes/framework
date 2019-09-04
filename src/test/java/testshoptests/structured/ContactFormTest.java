package testshoptests.structured;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.ContactFormPage;
import pages.HomePage;
import testshoptests.TestShopScenario;

public class ContactFormTest extends TestShopScenario {

    @Test
    public void completeContactFormHappyFlow() throws InterruptedException {

        String name = "hotelhacker";
        String emailAddress = "test@test.com";
        String phoneNumber ="09876543210";
        String subject = "a test";
        String message = "Some message a bit longer";

        homePage.sendFilledInContactForm(name,emailAddress, phoneNumber, subject,message);

        //wait (for now good enough.)
        Thread.sleep(1000);
        // Verify message was sent
        Assert.assertEquals("Thanks for getting in touch " + name + "!",
                (driver.findElement(By.xpath("//div[@class='row contact']//h2")).getText()));
    }
}
