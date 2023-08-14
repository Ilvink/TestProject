package helpDesk;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;
import tests.base.BasePage;

public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement rememberMe;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public LoginPage logIn(String login, String passwordValue){
        userName.sendKeys(login);
        password.sendKeys(passwordValue, Keys.ENTER);
        return this;
    }





}
