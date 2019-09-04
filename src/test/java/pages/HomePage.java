package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(css = "li#header_link_contact > a")
    private WebElement contactButton;

    @FindBy(css = "[class='login']")
    private WebElement logInButton;

    @FindBy(css = "[title='Home']")
    private WebElement homeButton;

    @FindBy(css = "[name='search_query']")
    private WebElement searchField;

    @FindBy(css = "[name='submit_search']")
    private WebElement submitSearch;

    @FindBy(css = "#tags_block_left > div")
    private WebElement tagContainer;

    private By accountDetailsButton = By.cssSelector("[class='account']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openContactUsPage() {
        contactButton.click();
    }

    public void clickLogIn() {
        logInButton.click();
    }

    public void goToHomePage() {
        homeButton.click();
    }

    public String getAccountName() {
        List<WebElement> el = driver.findElements(accountDetailsButton);
        if (el.size() != 0) {
            for (WebElement element : el) {
                return element.getText();
            }
        }
        return "account details button is not present on the page";
    }

    private WebElement getTagsBlock() {
        return tagContainer;
    }

    public Boolean tagPresent(String tagName) {
        List<String> tagsList = new ArrayList<>();
        List<WebElement> tagsBlock = getTagsBlock().findElements(By.cssSelector("a"));
        for (WebElement webElement : tagsBlock) {
            tagsList.add(webElement.getText());
        }
        return tagsList.contains(tagName);
    }

    public List<WebElement> getProducts() {
        WebElement productList = driver.findElement(By.cssSelector("#product_list"));
        return productList.findElements(By.cssSelector("a.product-name"));
    }

    public List<WebElement> getStocks() {
        WebElement productList = driver.findElement(By.cssSelector("#product_list"));
        return productList.findElements(By.cssSelector(".availability"));
    }

    public void searchProduct(String searchInput) {
        searchField.sendKeys(searchInput);
        submitSearch.click();
    }
}
