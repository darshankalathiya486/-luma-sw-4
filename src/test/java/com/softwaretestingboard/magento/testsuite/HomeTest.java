package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    HomePage homePage = new HomePage();



    @Test
    //Method name verifyTheSortByProductNameFilter
    public void verifyTheSortByProductNameFilter() throws InterruptedException{

        //Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverTopsMenu();
        homePage.clickOnJacketsMenu();
    }

}
