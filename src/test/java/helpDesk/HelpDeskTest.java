package helpDesk;

import org.junit.Test;
import tests.base.BaseTest;

public class HelpDeskTest extends BaseTest {

    @Test
    public void CheckTicket(){
        String title = "Ильвина";
        String body = "Тестовое заполнение форм селениум";
        String email = "testTest@fake.com";
        MainPage mainPage = MainPage.factory();
        mainPage.createTicket(title, body, email);
    }


}
