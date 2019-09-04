package testshoptests.structured;

        import org.junit.*;
        import pages.AdminPageLogin;
        import pages.BookingManagment;
        import pages.ContactFormPage;
        import pages.HomePage;
        import testshoptests.TestShopScenario;

public class AdminLoginTest extends TestShopScenario {

    @Test
    public void completeContactFormStructured() throws InterruptedException {

        // Goto contact us page
        HomePage homePage = new HomePage(driver);
        AdminPageLogin adminlogin = new AdminPageLogin(driver);
        BookingManagment bookingman = new BookingManagment(driver);

        driver.get("http://192.168.168.108:8080/#/admin");
        adminlogin.fillUserAdmin("admin");
        adminlogin.fillPasswordAdmin("password");

adminlogin.setLoginButton();
Thread.sleep(1000);
bookingman.setkamerNummer("123");
bookingman.setkamerprijs("300");
bookingman.setradioCheckbox();
bookingman.setrefreshCheckbox();
bookingman.settvCheckbox();
bookingman.setsafeCheckbox();
bookingman.setwifiCheckbox();
bookingman.setviewsCheckbox();
bookingman.setCreateRoom();
        Thread.sleep(1000);
        bookingman.setkamerNummer("123");
        bookingman.setkamerprijs("300");
        bookingman.setradioCheckbox();
        bookingman.setrefreshCheckbox();
        bookingman.settvCheckbox();
        bookingman.setsafeCheckbox();
        bookingman.setwifiCheckbox();
        bookingman.setviewsCheckbox();
        bookingman.setCreateRoom();

//
//        ToDO check text Logout
//

    }

}
