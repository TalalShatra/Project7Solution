package POM;


import Utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class BasePOM {

    static WebDriverWait wait;

    public BasePOM() {
        wait = new WebDriverWait(Driver.getDriver(),15);
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);

        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public static void delay(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void listSelectOption(WebElement element, String value) {

        clickFunction(element);
        Select asd = new Select(element);
        asd.selectByValue(value);
    }

    public int randomIndexForLists(List<WebElement> list) {
        return (int) (Math.random() * list.size());
    }

    public void clickRandomlyFromAList(List<WebElement> list) {
        list.get(randomIndexForLists(list)).click();
    }

}
