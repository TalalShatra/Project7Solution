package StepDefinitions;

import POM.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @And("Click to sign in menu button")
    public void clickToSignInMenuButton() {
        loginPage.findAndClick("signInMenuBtn");
    }

    @And("Fill in the email input as {string}")
    public void fillInTheEmailInputAs(String email) {
        loginPage.findAndSend("emailLogin", email);
    }

    @And("Fill in the password input as {string}")
    public void fillInThePasswordInputAs(String password) {
        loginPage.findAndSend("passwordLogin", password);
    }

    @When("Click to sign in button")
    public void clickToSignInButton() {
        loginPage.findAndClick("signInBtn");
    }

    @Then("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
        loginPage.findAndContainsText("successLogin", "Welcome");
    }
}
