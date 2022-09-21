package StepDefinitions;

import POM.AccountPage;
import Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AccountSteps {

    AccountPage accountPage = new AccountPage();

    @Given("Navigate to Luma Website")
    public void navigateToLumaWebsite() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    @And("Click to Create Account Menu button")
    public void clickToCreateAccountMenuButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) {
            accountPage.findAndClick(s);
        }
    }

    @And("Fill in the First Name, Last Name, Email, Password, Confirm Password inputs")
    public void fillInTheFirstNameLastNameEmailPasswordConfirmPasswordInputs(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            accountPage.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @When("Click to Create Account button")
    public void clickToCreateAccountButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (String s : listElement) {
            accountPage.findAndClick(s);
        }
    }

    @Then("Successfully message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        accountPage.findAndContainsText("successMessage", "Thank you");
    }

    @And("Click to sign out button")
    public void clickToSignOutButton(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            accountPage.findAndClick(listElement.get(i));
        }
    }

    @And("Click to drapdown button")
    public void clickToDrapdownButton() {
        accountPage.findAndClick("dropdownBtn");
    }
}