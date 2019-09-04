package testshoptests.linear;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import testshoptests.TestShopScenario;

public class ContactFormTest extends TestShopScenario {

    @Test
    public void completeContactFormLinear() {
        // Open the contact page
        driver.findElement(By.cssSelector("li#header_link_contact > a"))
                .click();

        // Select heading subject
        Select subject = new Select(driver.findElement(By.cssSelector("select#id_contact")));
        subject.selectByVisibleText("Webmaster");

        // Enter email address
        driver.findElement(By.cssSelector("input#email"))
                .sendKeys("test@test.com");

        // Enter reference
        driver.findElement(By.cssSelector("input#id_order"))
                .sendKeys("0987654321");

        // Enter message
        driver.findElement(By.cssSelector("textarea#message"))
                .sendKeys("Some message");

        // Click on Send
        driver.findElement(By.cssSelector("button#submitMessage"))
                .click();

        // Verify message was sent
        Assert.assertEquals("Your message has been successfully sent to our team.",
                driver.findElement(By.cssSelector("div#center_column > p")).getText());

    }

}