package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EbayMainPage;
import utilities.Driver;

public class SearchItem {
    EbayMainPage mainPage= new EbayMainPage();

    @BeforeMethod()
    public void setup() {
        Driver.getDriver().get("https://www.ebay.com");

    }

    @Test
    public void ebayMainPage() {

        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";

        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle, "Verification Failed!! Actual and expected title is not matching.");

        mainPage.searchBox.sendKeys("shoes");







    }
}