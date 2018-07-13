package test;

import org.testng.annotations.Test;
import pages.GoogleSearchPage;
import pages.WixPage;
import wrappers.BaseTest;

public class WixTest extends BaseTest {

    @Test
    public void openWixPage() {
        GoogleSearchPage google = new GoogleSearchPage();
        google.open();
        google.searchText("Wix");
        google.clickOnFirstResult();

        WixPage wix = new WixPage();
        wix.checkWixPageIsLoaded();

    }
}
