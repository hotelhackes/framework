package testshoptests.structured;

        import org.junit.*;
        import pages.AdminPageLogin;
        import pages.ContactFormPage;
        import pages.HomePage;
        import testshoptests.TestShopScenario;

public class AdminLoginTest extends TestShopScenario {

    @Test
    public void completeContactFormStructured() {

        // Goto contact us page
        HomePage homePage = new HomePage(driver);
        AdminPageLogin adminlogin = new AdminPageLogin(driver);

        homePage.setNextButton();
        homePage.setNextButton();
        homePage.setNextButton();
        homePage.setNextButton();
//        homePage.setNextButton();
        homePage.setCloseButton();
        driver.get("http://192.168.168.108:8080/#/admin");
        adminlogin.fillUserAdmin("admin");
        adminlogin.fillPasswordAdmin("password");

adminlogin.setLoginButton();

//
//        ToDO check text Logout
//

    }

}
