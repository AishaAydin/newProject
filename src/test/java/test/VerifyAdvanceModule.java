package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EbayMainPage;
import utilities.Driver;

public class VerifyAdvanceModule {

    EbayMainPage mainPage= new EbayMainPage();

    @BeforeMethod
    public void setUp(){

        Driver.getDriver().get("https://www.ebay.com");
    }

    @Test
    public void ebayMainPage(){

        String expectedTitle="Electronics, Cars, Fashion, Collectibles & More | eBay";

        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle,"Verification Failed!! Actual and expected title is not matching.");

    }
    @Test
    public void advanceModule() throws InterruptedException {

        Thread.sleep(3000);
        Assert.assertTrue(mainPage.advanceButton.isDisplayed(),"Advance button is not displayed!");


    }
   // public void tearDown(){
      //  Driver.getDriver().quit();
   // }

    @Test
    public void ebayMainPages() {

        mainPage.searchBox.sendKeys("shoes");
        mainPage.searchButton.click();

        String expectedResult="shoes | eBay";
        String actualResult=Driver.getDriver().getTitle();

        Assert.assertEquals(expectedResult,actualResult,"Verification Failed!!!");
    }


}
