package cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import io.cucumber.java.nl.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ContactFormPage;
import pages.HomePage;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class StepDefinitions {

    private WebDriver driver;
    private WebDriverWait myWaitVar;
    private HomePage homePage;

    private String response;

    @Before
    public void beforeScenario() {
        // Create driver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        response = "";
    }

    @After
    public void afterScenario() {
        driver.quit();
    }

    @Stel("^Ik ben op de Polteq WebShop$")
    @Given("^I am on the Polteq Webshop$")
    public void iAmOnThePolteqWebshop() {
        // -- @Given( "^I am on the Polteq Webshop$" )
        myWaitVar = new WebDriverWait(driver,20);
        // Open the website
        driver.get("https://techblog.polteq.com/testshop/index.php");
        driver.manage().window().maximize();
    }

    @Given("I'm on the Polteq TestShop")
    public void iMOnThePolteqTestShop() {
        iAmOnThePolteqWebshop();
    }

    @When("I send a contact form")
    public void iSendAContactForm(DataTable table) {
        // Goto contact us page
        homePage.openContactUsPage();

        // Fill contact form and send it
        List<Map<String, String>> contactFormValues = table.asMaps(String.class, String.class);
        String subjectHeading = contactFormValues.get(0).get("subject");
        String emailAddress = contactFormValues.get(0).get("email address");
        String reference = contactFormValues.get(0).get("reference");
        String message = contactFormValues.get(0).get("message");

        ContactFormPage contactFormPage = new ContactFormPage(driver);
        contactFormPage.sendFilledInContactForm(
                subjectHeading,
                emailAddress,
                reference,
                message
        );
    }

    @Then("I should get a confirmation that the contact form has been sent")
    public void iShouldGetAConfirmationThatTheContactFormHasBeenSent() {
        ContactFormPage contactFormPage = new ContactFormPage(driver);
        Assert.assertEquals("Your message has been successfully sent to our team.",
                contactFormPage.getAlertMessage());
    }

    @Given("I search for (.*) on the (.*) endpoint of the (.*) API")
    public void iSearchForOnTheDriversEndpointOfTheAPI(String query, String endpoint, String api) {
        if (!api.toLowerCase().equals("ergast")) {
            Assert.fail("Only Ergast API is implemented");
        }

        response = given().baseUri("http://ergast.com/api/f1")
                .and().basePath(endpoint)
                .when().get(query.replace(' ', '_'))
                .then().log().body()
                .and().extract().response().body().asString();
    }

    @Then("I expect a result containing (.*)")
    public void iExpectAResultContaining(String expectation) {
        Assert.assertThat(response, CoreMatchers.containsString(expectation));
    }
}
