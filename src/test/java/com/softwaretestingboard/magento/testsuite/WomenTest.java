package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    HomePage homePage = new HomePage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();


    @Test
    //Method name verifyTheSortByProductNameFilter
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverTopsMenu();
        homePage.clickOnJacketsMenu();

        //Verify the products name display in alphabetical order
        List<WebElement> name = womenJacketsPage.getProductNameWithoutFilter();
        List<String> originalList = new ArrayList<>();
        for (WebElement element : name) {
            originalList.add(element.getText());
        }

        //Select Sort By filter “Product Name”
        womenJacketsPage.selectProductNameFilterByValue("name");
        Thread.sleep(2000);

        name = womenJacketsPage.getProductNameWithoutFilter();
        List<String> sortedList = new ArrayList<>();
        Thread.sleep(2000);
        for (WebElement element : name) {
            sortedList.add(element.getText());
        }

        // Sort the before name list into Ascending Order
        originalList.sort(String.CASE_INSENSITIVE_ORDER);// Ascending order
        Assert.assertEquals(originalList,sortedList);
        }





    @Test
    //Method Name verifyTheSortByPriceFilter
    public void verifyTheSortByPriceFilter() throws InterruptedException{
        //Mouse Hover on Women Menu
        Thread.sleep(2000);
        homePage.mouseHoverWomenMenu();
        Thread.sleep(2000);
        homePage.mouseHoverTopsMenu();
        homePage.clickOnJacketsMenu();

        // Storing jackets price in list
        List<WebElement> price = womenJacketsPage.getProductPriceWithoutFilter();
        List<Double> originalPrice = new ArrayList<>();
        for (WebElement element : price) {
            originalPrice.add(Double.valueOf(element.getText().replace("$", " ")));
        }

        // Select Sort By filter “Price”
        womenJacketsPage.selectProductPriceFilter("price");
        Thread.sleep(2000);

        // After Sorting Products by Price
        price = womenJacketsPage.getProductNameWithoutFilter();
        List<Double> sortedPrice  = new ArrayList<>();
        Thread.sleep(2000);
        for (WebElement element : price) {
            sortedPrice.add(Double.valueOf(element.getText().replace("$", "")));
        }

        // Sort the jacketPriceListBefore to Ascending Order
        Collections.sort(originalPrice);
        // Verify the products price display in Low to High
        Assert.assertEquals(sortedPrice,originalPrice);


    }
}





