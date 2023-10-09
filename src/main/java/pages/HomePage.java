package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//li[@class = 'user-controls__ul__li user-controls__ul__li--account']")
    WebElement loginElement;

    @FindBy(xpath = "//button[@title ='Close']")
    WebElement closedFirstAd;

    @FindBy(xpath = "//a[@class ='newsletter__close newsletter__trigger']")
    WebElement closedSecondAd;

    public  HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void setClosedFirstAd(){
        DriverUtility.waitUntilElementToBeClickable(closedFirstAd);
    }

    public void closedSecondAd(){
        DriverUtility.waitUntilElementToBeClickable(closedSecondAd);
    }

    public void clickOnLoginButton(){
        DriverUtility.waitUntilElementToBeClickable(loginElement);
    }


}
