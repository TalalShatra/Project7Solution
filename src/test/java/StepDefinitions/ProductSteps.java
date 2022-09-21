package StepDefinitions;

import POM.ProductPage;
import io.cucumber.java.en.*;

public class ProductSteps {

    ProductPage productPage = new ProductPage();

    @And("Click to Men Menu button")
    public void clickToMenMenuButton() {
        productPage.findAndClick("menMenuBtn");
    }

    @And("Click to jackets button")
    public void clickToJacketsButton() {
        productPage.findAndClick("jacketsBtn");
    }

    @And("Click to random product")
    public void clickToRandomProduct() {
        productPage.chooseAndClick("productList");
    }

    @And("Click to random size")
    public void clickToRandomSize() {
        productPage.chooseAndClick("sizeList");
    }

    @And("Click to random color")
    public void clickToRandomColor() throws InterruptedException {
        productPage.chooseAndClick("colorList");
        Thread.sleep(3000);
    }

    @And("Click to Add To Cart button")
    public void clickToAddToCartButton() throws InterruptedException {
        productPage.findAndClick("addToCart");

        Thread.sleep(3000);
    }

    @And("Click to shopping Cart")
    public void clickToShoppingCart() throws InterruptedException {
        productPage.findAndClick("shoppingCart");
        Thread.sleep(3000);
    }

    @And("Click to proceed to Checkout button")
    public void clickToProceedToCheckoutButton() throws InterruptedException {
        productPage.findAndClick("proceedToCheckout");
        Thread.sleep(3000);
    }

    @And("Click to random shipping method")
    public void clickToRandomShippingMethod() throws InterruptedException {
        productPage.chooseAndClick("radioBtnList");
        Thread.sleep(3000);
    }

    @And("Click to next button")
    public void clickToNextButton() throws InterruptedException {
        productPage.findAndClick("nextBtn");
        Thread.sleep(3000);
    }

    @When("Click to  place order button")
    public void clickToPlaceOrderButton() throws InterruptedException {
        productPage.findAndClick("placeOrderBtn");
        Thread.sleep(3000);
    }

    @Then("Prchase message should be displayed")
    public void prchaseMessageShouldBeDisplayed() {
        productPage.findAndContainsText("purchaseMessage", "Thank you");
    }

    @And("Fill in the CheckOut Company input as {string}")
    public void fillInTheCheckOutCompanyInputAs(String company) {
        productPage.findAndSend("checkOutCompany", company);
    }

    @And("Fill in the CheckOut Phone Number input as {string}")
    public void fillInTheCheckOutPhoneNumberInputAs(String phone) {
        productPage.findAndSend("checkOutPhone", phone);
    }

    @And("Fill in the CheckOut Street addres first input as {string}")
    public void fillInTheCheckOutStreetAddresFirstInputAs(String address) {
        productPage.findAndSend("checkOutStreet", address);
    }

    @And("Fill in the CheckOut city input as {string}")
    public void fillInTheCheckOutCityInputAs(String city) {
        productPage.findAndSend("checkOutCity", city);
    }

    @And("Fill in the CheckOut Zip Code input as {string}")
    public void fillInTheCheckOutZipCodeInputAs(String zipcode) {
        productPage.findAndSend("checkOutZipcode", zipcode);
    }

    @And("Select a state for CheckOut page")
    public void selectAStateForCheckOutPage() {
        productPage.chooseElement("checkOutState", "12");
    }

    @And("Select a country for CheckOut page")
    public void selectACountryForCheckOutPage() {
        productPage.chooseElement("checkOutCountry", "AR");
    }
}
