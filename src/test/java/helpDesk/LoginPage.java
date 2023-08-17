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

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public TicketsPage auth(String login, String passwordValue){
        userName.sendKeys(login);
        password.sendKeys(passwordValue, Keys.ENTER);
        return new TicketsPage();
    }





}
