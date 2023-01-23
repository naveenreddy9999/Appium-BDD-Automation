package stepDef.pages;

import com.functions.factory.MobileDriverFactory;
import com.functions.util.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import stepDef.pomPages.MobilePage;
import stepDef.utilities.screenShot;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import static com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter.addTestStepLog;

public class Mobile_Page {

    private final ConfigReader configReader = ConfigReader.getInstance();
    private final screenShot screenshot = screenShot.getInstance();
    public WebDriver driver;
    public MobilePage mobilePage;
    public MobileDriverFactory mobileDriverFactory = new MobileDriverFactory();

    @Given("launch App")
    public void launchApp() throws MalformedURLException, InterruptedException {

        //Driver launch
        driver = mobileDriverFactory.mobileDriverLaunch();

        //driver passing the MobilePage
        mobilePage = new MobilePage(driver);
        configReader.setDriver("driver", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        screenshot.takescreenshot("Home Page");

    }

    @And("click the Categories")
    public void clickTheCategories() {

        mobilePage.categories();
    }

    @And("click The MEN")
    public void clickTheMEN() {

        mobilePage.select_Men();

    }

    @Then("Select Watches")
    public void selectWatches() {
        mobilePage.select_Watches();


    }

    @And("select Budget Buys")
    public void selectBudgetBuys() {
        mobilePage.select_BudgetBuys();
    }

    @And("Select FirstWatch")
    public void selectFirstWatch() {
        mobilePage.select_First_Watch();
    }

    @And("Select AddBag")
    public void selectAddBag() {
        mobilePage.add_Bag();
    }

    @Then("Select AddBagTag")
    public void selectAddBagTag() {
        mobilePage.click_add_bag();
    }

    @Then("Select Place Order")
    public void selectPlaceOrder() {
        mobilePage.place_order();
    }
}
