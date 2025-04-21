package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_002Page;
import static org.junit.Assert.assertTrue;

public class tc_002Steps {

    tc_002Page page = new tc_002Page();

    @Given("I am logged into the application")
    public void i_am_logged_into_the_application() {
        page.ensureLoggedIn();
    }

    @When("I click on the logout button")
    public void i_click_on_the_logout_button() {
        page.clickLogoutButton();
    }

    @Then("I should be redirected to the login page")
    public void i_should_be_redirected_to_the_login_page() {
        assertTrue("User should be on login page", page.isLoginPageDisplayed());
    }
}