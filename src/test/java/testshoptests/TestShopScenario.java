package testshoptests;

import lib.BrowserFactory;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

public class TestShopScenario {

    protected WebDriver driver;
    protected WebDriverWait myWaitVar;

    @Before
    public void setUp() {
        // Create a new instance of the Chrome driver
        driver = BrowserFactory.createBrowser(BrowserFactory.Browser.CHROME);
        myWaitVar = new WebDriverWait(driver,20);
        driver.manage().window().maximize();

        // Open the website
        driver.get("http://192.168.168.108:8080/#/");


    }

    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}
