package tests.search;

import tests.base.BaseTest;

public class SearchApartTest extends BaseTest {

    public void CheckRedirectToList(){
        basePage.open("https://realt.by/");
        realtHomePage.enterCountRooms();
    }
}
