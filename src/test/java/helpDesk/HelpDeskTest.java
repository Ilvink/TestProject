package helpDesk;

import org.testng.Assert;
import org.testng.annotations.Test;
import readProperties.ConfigProvider;
import tests.base.BaseTest;

import static helpers.StringModifire.getUniqueString;

public class HelpDeskTest extends BaseTest {

    @Test
    public void CheckTicket(){
        String title = getUniqueString("Ильвина");
        String body = "Тестовое заполнение форм селениум";
        String email = "testTest@fake.com";
        TicketPage ticketPage = MainPage.factory()
                                        .createTicket(title, body, email)
                                        .openLoginPage()
                                        .auth(ConfigProvider.adminLog, ConfigProvider.adminPass)
                                        .findTicket(title);
        Assert.assertTrue(ticketPage.getTitle().contains(title));
        Assert.assertEquals(ticketPage.getEmail(), email);
        Assert.assertEquals(ticketPage.getDescription(), body);
    }


}
