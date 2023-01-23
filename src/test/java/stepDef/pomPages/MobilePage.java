package stepDef.pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepDef.utilities.screenShot;

import java.time.Duration;

public class MobilePage {

    private final screenShot screenshot = screenShot.getInstance();
    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(xpath = "//*[@text='7']")
    WebElement SevenBTN;
    @FindBy(xpath = "//*[@text='x']")
    WebElement XBTN;
    @FindBy(xpath = "//*[@text='3']")
    WebElement ThreeBTN;
    @FindBy(xpath = "//*[@text='=']")
    WebElement eBTN;
    @FindBy(xpath = "//*[@text='Categories']")
    WebElement categories;
    @FindBy(xpath = "//*[@text='MEN']")
    WebElement men;
    @FindBy(xpath = "//*[@text='Watches']")
    WebElement watches;
    @FindBy(xpath = "(//*[@text='Watches'])[2]")
    WebElement watchesDrop;
    @FindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"BANNER_0\"])[1]/android.widget.ImageView")
    WebElement BudgetBuys;

    @FindBy(xpath = "(//android.widget.TextView[@content-desc=\"text_brand\"])[1]")
    WebElement firstWatch;

    @FindBy(xpath = "//*[@text='ADD TO BAG']")
    WebElement addBag;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"bag\"]/android.view.ViewGroup")
    WebElement addBagPage;

    @FindBy(xpath = "(//*[@class='android.view.View'])[2]")
    WebElement placeorder;


    public MobilePage(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofMinutes(5));

    }

    public void click_button() {
        SevenBTN.click();
        screenshot.takescreenshot("7 Button clicked");
        screenshot.fieldname("7 Button clicked");

        XBTN.click();
        screenshot.takescreenshot("* Button clicked");
        screenshot.fieldname("* Button clicked");

        ThreeBTN.click();
        screenshot.takescreenshot("3 Button clicked");
        screenshot.fieldname("3 Button clicked");

        eBTN.click();
        screenshot.takescreenshot("= Button clicked");
        screenshot.fieldname("= Button clicked");

    }

    public void categories() {
        categories.click();
        screenshot.takescreenshot("categories");
    }

    public void select_Men() {
        men.click();
        screenshot.takescreenshot("men");
    }

    public void select_Watches() {
        watches.click();
        watchesDrop.click();
        screenshot.takescreenshot("watches");
    }

    public void select_BudgetBuys() {
        BudgetBuys.click();
        screenshot.takescreenshot("Budget Watches");

    }

    public void select_First_Watch() {
        firstWatch.click();
        screenshot.takescreenshot("select watch");

    }

    public void add_Bag() {
        addBag.click();
        screenshot.takescreenshot("add Bag");
    }

    public void click_add_bag() {
        addBagPage.click();
        screenshot.takescreenshot("bag added");
    }

    public void place_order() {
        placeorder.click();
        screenshot.takescreenshot("Place the order");
    }

}
