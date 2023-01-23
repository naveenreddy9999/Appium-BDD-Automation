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

public class google_Page {

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
        ConfigReader.setDriver("driver", driver);
        screenshot.takescreenshot("Home Page");
        mobilePage.click_button();


        //*[@text='Categories']

        //*[@text='MEN']

        //*[@text='Watches']
//        (//*[@text='Watches'])[2]
//


        //com.android.chrome

        //com.google.android.gms.common.api.GoogleApiActivity
    }
}
