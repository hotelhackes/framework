package testshoptests.structured;

        import org.junit.*;
        import pages.ContactFormPage;
        import pages.HomePage;
        import testshoptests.TestShopScenario;

public class AdminLoginTest extends TestShopScenario {

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
//        // fill in username and password
//

    }

}
