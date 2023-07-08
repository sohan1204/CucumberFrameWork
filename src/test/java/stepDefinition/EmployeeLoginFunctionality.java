package stepDefinition;

import base.Base;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import pages.EmployeeHomePage;
import pages.EmployeeLoginPage;
import static org.junit.Assert.assertEquals;

public class EmployeeLoginFunctionality extends Base {

    @Then("I Enter Employee User Id")
    public void i_enter_employee_user_id() {

       sendKeys(EmployeeLoginPage.textEmployeeUserId,"testpilot@gmail.com");

    }

    @Then("I enter Employee Password")
    public void i_enter_employee_password() {
        sendKeys(EmployeeLoginPage.textEmployeePassword,"1234");
    }

    @Then("Verify I am in Employee Home Page")
    public void verify_i_am_in_employee_home_page() {

     String empIdMsg = getText(EmployeeHomePage.employeeIdMsg);
     assertEquals("Welcome Test", empIdMsg);
    }
}
