package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EbayMainPage {

    public EbayMainPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="gh-as-a")
    public WebElement advanceButton;

    @FindBy(xpath="//input[@class='gh-tb ui-autocomplete-input']")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@class='btn btn-prim gh-spr']")
    public WebElement searchButton;







}
