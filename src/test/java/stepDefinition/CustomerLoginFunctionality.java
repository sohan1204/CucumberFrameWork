package stepDefinition;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import org.testng.Assert;
import pages.CustomerHomePage;
import pages.CustomerLoginPage;
import pages.EmployeeLoginPage;
import pages.LandingPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static Util.readFile.loadPropertiesFile;
import static org.junit.Assert.assertEquals;



public class CustomerLoginFunctionality extends Base {

    Properties properties = loadPropertiesFile("C:\\AKIB_SOHAN\\CucumberFrameWork\\src\\test\\resources\\myFile\\credentials.properties");

    @Given("I am in Landing Page")
    public void i_am_in_landing_page() throws IOException {
        navigate("http://it.microtechlimited.com");
    }

    @Then("I click on Login Menu")
    public void i_click_on_login_menu() {
        click( LandingPage.menuLogin );
    }
    @Then("I click on Customer Login Menu")
    public void i_click_on_customer_login_menu() {
        click(EmployeeLoginPage.menuCustomerLogin );
    }
    @Then("I Enter User Id")
    public void i_enter_user_id() {
        sendKeys( CustomerLoginPage.textCustomerUserId, (String) properties.get("username"));
    }
    @Then("I enter Password")
    public void i_enter_password() {
        sendKeys( CustomerLoginPage.textCustomerPassword, (String) properties.get("password"));
    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
        click( CustomerLoginPage.btnCustomerLogin );
    }

    @Then("Verify I am in Customer Home Page")
    public void verify_i_am_in_customer_home_page() {
        String welcomeMsg = getText( CustomerHomePage.labelWelcomeMsg );
        assertEquals( "Welcome David", welcomeMsg);
    }

}