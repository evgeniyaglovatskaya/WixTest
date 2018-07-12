package test;

import org.junit.After;
import org.junit.Test;
import pages.GoogleSearchPage;
import pages.WixPage;
import wrappers.BaseTest;

public class WixTest extends BaseTest {

    public WixTest() {
    }


    @Test
    public void openWixPage() {
        GoogleSearchPage google = new GoogleSearchPage();
        WixPage wix = new WixPage();

        google.openGoogle();
        google.searchForText("Wix");
        google.clickOnFirstResult();
        wix.checkWixPageIsLoaded();

    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
