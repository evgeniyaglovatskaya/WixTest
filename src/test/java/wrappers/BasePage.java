package wrappers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

    private WebDriverWait wait;
    private WebDriver driver;

    protected BasePage() {
        this.driver = BaseTest.driver;
        this.wait = new WebDriverWait(this.driver, 10);
    }

    protected void openURL(String url) {
        this.driver.get(url);
    }

    protected void type(By locator, String text) {
        WebElement input = this.wait.until(ExpectedConditions.elementToBeClickable(locator));
        input.sendKeys(text);
    }

    protected void click(By locator) {
        WebElement button = this.wait.until(ExpectedConditions.elementToBeClickable(locator));
        button.click();
    }

    protected void checkIfElementDisplayed(By locator) {
        WebElement element = this.wait.until(ExpectedConditions.elementToBeClickable(locator));
        Assert.assertTrue(element.isDisplayed());
    }

    protected void submit(By locator){
        WebElement button = this.wait.until(ExpectedConditions.elementToBeClickable(locator));
        button.submit();
    }
}
