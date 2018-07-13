package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class GoogleSearchPage extends BasePage {

    private By searchField = By.id("lst-ib");
    private By firstResult = By.xpath("(//*[@id=\"ires\"]//*[@class=\"r\"])[1]");

    public GoogleSearchPage() {
    }

    public void open() {
        this.openURL("https://www.google.com.ua/");
    }

    public void searchText(String text) {
        this.type(searchField, text);
        this.submit(searchField);
    }

    public void clickOnFirstResult() {
        this.click(firstResult);
    }
}
