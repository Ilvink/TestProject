package helpDesk;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.base.BasePage;

import java.util.TooManyListenersException;

public class TicketsPage extends BasePage {
    @FindBy(id = "search_query")
    private WebElement search;

    @FindBy(xpath = "//div[@class='tickettitle']")
    private WebElement ticket;


    public TicketsPage(){
        PageFactory.initElements(driver, this);
    }

    public TicketPage findTicket(String str){
        search.sendKeys(str, Keys.ENTER);
        ticket.click();
        return new TicketPage();
    }
}
