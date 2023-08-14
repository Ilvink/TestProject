package helpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;
import tests.base.BasePage;

public class MainPage extends BasePage {
    @FindBy(xpath = "//select[@id='id_queue']")
    private WebElement queue;

    @FindBy(xpath = "//select[@id='id_queue']//option[@value='1']")
    private WebElement queueDjangoHelpdesk;

    @FindBy(xpath = "//select[@id='id_queue']//option[@value='2']")
    private WebElement queueSomeProduct;

    @FindBy(id = "id_title")
    private WebElement title;

    @FindBy(id = "id_body")
    private WebElement body;

    @FindBy(id = "id_priority")
    private WebElement priority;

    @FindBy(id = "id_due_date")
    private WebElement dueDate;

    @FindBy(xpath = "//table[@class = 'ui-datepicker-calendar']//a[text() = '25']")
    private WebElement dateValue;

    @FindBy(id = "id_submitter_email")
    private WebElement email;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitBtm;


    public static MainPage factory(){
        return new MainPage();
    }

   public MainPage() {
      driver.get(ConfigProvider.URL);
       PageFactory.initElements(driver, this);
   }

    public MainPage createTicket(String titleValue, String bodyValue, String emailValue){
        queue.click();
        queueDjangoHelpdesk.click();
        title.sendKeys(titleValue);
        body.sendKeys(bodyValue);
        dueDate.click();
        dateValue.click();
        email.sendKeys(emailValue);
        submitBtm.click();
        return this;
    }
}
