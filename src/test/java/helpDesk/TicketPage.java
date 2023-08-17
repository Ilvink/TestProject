package helpDesk;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.base.BasePage;

public class TicketPage extends BasePage {

    @FindBy(xpath = "//th[text()='Submitter E-Mail']/following::td[1]")
    private WebElement submitterEmail;

    @FindBy(xpath = "//h3")
    private WebElement title;

    @FindBy(xpath = "//td[@id = 'ticket-description']//p")
    private WebElement description;

    public TicketPage() {
        PageFactory.initElements(driver, this);
    }

    public String getEmail(){
        return submitterEmail.getText();
    }

    public String getTitle(){
        return title.getText();
    }

    public String getDescription(){
        return description.getText();
    }

}
