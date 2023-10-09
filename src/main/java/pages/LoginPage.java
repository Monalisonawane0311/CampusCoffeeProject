package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import utility.DriverUtility;

public class LoginPage extends WebTestBase {

    @FindBy(id = "username")
    WebElement userNameTextBox;

    @FindBy(id = "password")
    WebElement passwordTextBox;

    @FindBy(name = "login")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public void login(String userName, String password){
        userNameTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        DriverUtility.waitUntilElementToBeClickable(loginBtn);

    }

}
