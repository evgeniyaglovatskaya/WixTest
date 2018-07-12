package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class GoogleSearchPage extends BasePage {

    private By searchField = By.id("lst-ib");
    private By searchButton = By.name("btnK");
    private By firstResult = By.xpath("(//*[@id=\"ires\"]//*[@class=\"r\"])[1]");

    public GoogleSearchPage() {
    }

    public void openGoogle() {
        this.openURL("https://www.google.com.ua/");
    }

    public void searchForText(String text) {
        this.type(searchField, "Wix");
        this.click(searchButton);
    }

    public void clickOnFirstResult() {
        this.click(firstResult);
    }
}
