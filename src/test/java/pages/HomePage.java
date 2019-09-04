package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {


    //region - locators contact form
    @FindBy(css = "[id='name']")
    private WebElement contactNameField;

    @FindBy(css = "[id='email']")
    private WebElement contactEmailField;

    @FindBy(css = "[id='phone']")
    private WebElement contactPhoneField;

    @FindBy(css = "[id='subject']")
    private WebElement contactSubjectField;

    @FindBy(css = "[id='description']")
    private WebElement contactDescriptionField;

    @FindBy(css = "[id='submitContact']")
    private WebElement contactSubmitButton;
    //endregion

    @FindBy(id = "next")
    private WebElement nextButton;

    public void setNextButton() {

       nextButton.click();

    }

    @FindBy(id= "closeModal")
    private WebElement closeButton;

    public void setCloseButton() {
        closeButton.click();
    }

    //region - public page methods contactform
    public void sendFilledInContactForm(String name,
                                        String emailAddress,
                                        String phone,
                                        String subject,
                                        String description) {
        fillContactName(name);
        fillContactEmailAddress(emailAddress);
        fillContactPhone(phone);
        fillSubject(subject);
        fillDescription(description);
        clickSubmit();
    }

    public void fillContactName(String name) {
        fillField(contactNameField, name);
    }

    public void fillContactEmailAddress(String emailAddress) {
        fillField(contactEmailField, emailAddress);
    }

    public void fillContactPhone(String phone) {
        fillField(contactPhoneField, phone);
    }

    public void fillSubject(String subject) {
        fillField(contactSubjectField, subject);
    }

    public void fillDescription(String description) {
        fillField(contactDescriptionField, description);
    }

    public void clickSubmit() {
        contactSubmitButton.click();
    }
    //endregion

    //region - constructor(s)
    public HomePage(WebDriver driver) {
        super(driver);
    }
    //endregion

}
