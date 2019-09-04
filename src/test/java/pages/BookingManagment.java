package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingManagment extends BasePage {


    @FindBy (id = "roomNumber"  )
    private WebElement kamerNummer;

    public BookingManagment(Object o) {
        super(o);
    }

    public void setkamerNummer(String roomnummer) {
        kamerNummer.sendKeys(roomnummer);
    }

    @FindBy(id="type")
    private WebElement typeKamer;

    public void settypeKamer() {

    }
    @FindBy(id="accessible")
    private WebElement beschikbaarheid;

    public void setbeschikbaarheid() {
        beschikbaarheid.click();
    }
    @FindBy(id="roomPrice")
    private WebElement kamerprijs;

    public void setkamerprijs(String Kamerprijs) {
        kamerprijs.sendKeys(Kamerprijs);
    }

    @FindBy(id="wifiCheckbox")
    private WebElement wifiCheckbox;

    public void setwifiCheckbox() {
        wifiCheckbox.click();
    }

    @FindBy(id="refreshCheckbox")
    private WebElement refreshCheckbox;

    public void setrefreshCheckbox() {
        refreshCheckbox.click();
    }

    @FindBy(id="tvCheckbox")
    private WebElement tvCheckbox;

    public void settvCheckbox() {
        tvCheckbox.click();
    }

    @FindBy(id="safeCheckbox")
    private WebElement safeCheckbox;

    public void setsafeCheckbox() {
        safeCheckbox.click();
    }

    @FindBy(id="radioCheckbox")
    private WebElement radioCheckbox;

    public void setradioCheckbox() {
        radioCheckbox.click();
    }

    @FindBy(id="viewsCheckbox")
    private WebElement viewsCheckbox;

    public void setviewsCheckbox() {
        viewsCheckbox.click();
    }

    @FindBy(id="createRoom")
    private WebElement createRoom;

    public void setCreateRoom() {
        createRoom.click();
    }









}
