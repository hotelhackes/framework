package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AdminPageLogin extends BasePage {

    public AdminPageLogin(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "username")
    private WebElement searchField;

    public void fillUserAdmin(String username) {
        searchField.sendKeys(username);
    }

    @FindBy(id = "password")
    private WebElement searchField2;

    public void fillPasswordAdmin(String password) {
        searchField2.sendKeys(password);
    }

}