package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactFormPage extends BasePage {

    //region - locators
    @FindBy(css = "li#header_link_contact > a")
    private WebElement contactButton;

    @FindBy(css = "select#id_contact")
    private WebElement subjectHeadingField;

    @FindBy(css = "input#email")
    private WebElement emailAddressField;

    @FindBy(css = "input#id_order")
    private WebElement referenceField;

    @FindBy(css = "textarea#message")
    private WebElement messageField;

    @FindBy(css = "button#submitMessage")
    private WebElement sendButton;

    @FindBy(css = "div#center_column > p")
    private WebElement alertMessageField;
    //endregion

    //region - constructor(s)
    public ContactFormPage(WebDriver driver) {
        super(driver);
    }
    //endregion

    //region - enums
    public enum SubjectHeadings {
        WEBMASTER("Webmaster"),
        CUSTOMER_SERVICE("Customer service");

        private String subjectHeadingText;

        SubjectHeadings(String subjectHeadingText) {
            this.subjectHeadingText = subjectHeadingText;
        }

        public String getSubjectHeadingText() {
            return subjectHeadingText;
        }
    }
    //endregion

    //region - public page methods
    public void sendFilledInContactForm(SubjectHeadings subjectHeading,
                                        String emailAddress,
                                        String reference,
                                        String message) {
        selectSubjectHeading(subjectHeading);
        fillEmailAddress(emailAddress);
        fillReference(reference);
        fillMessage(message);
        clickSend();
    }

    public void sendFilledInContactForm(String subjectHeading,
                                        String emailAddress,
                                        String reference,
                                        String message) {
        selectSubjectHeading(subjectHeading);
        fillEmailAddress(emailAddress);
        fillReference(reference);
        fillMessage(message);
        clickSend();
    }

    public void selectSubjectHeading(String subjectHeading) {
        Select selectSubject = new Select(this.subjectHeadingField);
        selectSubject.selectByVisibleText(subjectHeading);
    }

    public void selectSubjectHeading(SubjectHeadings subjectHeading) {
        selectSubjectHeading(subjectHeading.getSubjectHeadingText());
    }

    public void fillEmailAddress(String emailAddress) {
        fillField(emailAddressField, emailAddress);
    }

    public void fillReference(String reference) {
        fillField(referenceField, reference);
    }

    public void fillMessage(String message) {
        fillField(messageField, message);
    }

    public void clickSend() {
        sendButton.click();
    }

    public String getAlertMessage() {
        return alertMessageField.getText();
    }
    //endregion

}
