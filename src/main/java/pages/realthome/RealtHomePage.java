package pages.realthome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class RealtHomePage extends BasePage {
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(xpath = "//select[@id='rooms']")
    private WebElement rooms;

    @FindBy(xpath = "//select[@id='rooms']/options[@value = '2']")
    private WebElement options2rooms;

    @FindBy(xpath = "//div[@id='residentialInputs']//a[text() = 'Найти']")
    private WebElement findBtn;


    public RealtHomePage enterCountRooms(){
        rooms.click();
        options2rooms.click();
        findBtn.click();
        return this;
    }
}
