package pages;

import org.openqa.selenium.By;
import wrappers.BasePage;

public class WixPage extends BasePage {

    private By wixLogo = By.id("wm-logo");

    public WixPage() {

    }

    public void checkWixPageIsLoaded() {
        checkIfElementDisplayed(wixLogo);
    }
}
