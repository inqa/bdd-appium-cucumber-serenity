package Steps.Facebook;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import net.thucydides.core.annotations.Steps;

/**
 * Created by Andrew on 31/03/2017.
 */
public class MyStepdefs {


    MyUserSteps user;

    private static final Logger LOGGER = LoggerFactory.getLogger(MyStepdefs.class);

    @Before
    public void setupTest(Scenario scenario) throws Throwable {
        user = new MyUserSteps(ThucydidesWebDriverSupport.getDriver());
        Thread.sleep(10000);
    }

    @After
    public void tearDown() {
        ThucydidesWebDriverSupport.closeAllDrivers();
    }

    @Given("^the app is running$")
    public void theAppIsRunning(){
        LOGGER.info("Starting running tests");
    }

    @When("^searching for Sara$")
    public void searchingForSara() {
        user.searchFor("sara");
    }

    @Then("^Sara Alston is returned$")
    public void saraAlstonIsReturned() {
        LOGGER.info("Output is: " + user.getResult());
        Assert.assertThat(user.getResult(), CoreMatchers.containsString("Sara Alston"));

    }

    @Given("^blah$")
    public void blah() {
        LOGGER.info("SOMETHING 1");
    }

    @When("^blahblah$")
    public void blahblah() {
        LOGGER.info("SOMETHING 2");
    }

    @Then("^blahblahblah$")
    public void blahblahblah() {
        LOGGER.info("SOMETHING 3");
    }
}
