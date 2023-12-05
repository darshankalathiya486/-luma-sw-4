package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.BagsPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.OvernightDufflePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    /********************** All Related Pages Object *****************************************************/

    HomePage homePage = new HomePage();
    BagsPage bagsPage = new BagsPage();
    OvernightDufflePage overnightDufflePage = new OvernightDufflePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    //Method name userShouldAddProductSuccessFullyToShoppingCart

    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        //Mouse Hover on Gear Menu
        Thread.sleep(2000);
        homePage.mouseHoverOnGearMenu();

        //Click on Bags
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnBagsSubMenuOfGear();

        //Click on Product Name ‘Overnight Duffle’
        bagsPage.mouseHoverAndClickOnOvernightDuffleProduct();

        //* Verify the text ‘Overnight Duffle’
        String expectedMessage = "Overnight Duffle";
        String actualMessage = overnightDufflePage.getWelcomeText().substring(0, expectedMessage.length());
        Assert.assertEquals(actualMessage, expectedMessage);

        //Change Qty 3
        overnightDufflePage.sendDataToQuantityField(Keys.CONTROL + "a");
        overnightDufflePage.sendDataToQuantityField("3");
        Thread.sleep(2000);
        overnightDufflePage.clickOnAddToCartButton();

        //Verify the text ‘You added Overnight Duffle to your shopping cart.’
        String expectedCartSuccessMessage = "You added Overnight Duffle to your shopping cart.";
        String actualCartSuccessMessage = overnightDufflePage.getTextFromProductAddedToCartSuccessMessage().substring(0, expectedCartSuccessMessage.length());
        Assert.assertEquals(actualCartSuccessMessage, expectedCartSuccessMessage);

        overnightDufflePage.clickOnShoppingCartLinkInSuccessMessage();

        String expectedShoppingCartWelcomeMessage = "Shopping Cart";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);


        //Verify the product name ‘Cronus Yoga Pant’
        String expectedProductName = "Overnight Duffle";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);

        //Verify the Qty is ‘3’
        String expectedQuantity = "3";
        String actualQuantity = shoppingCartPage.getQuantity().substring(0, expectedQuantity.length());
        Assert.assertEquals(actualQuantity, expectedQuantity);

        // Verify the product price ‘$135.00’
        String expectedSubTotal = "$135.00";
        String actualSubTotal = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal.length());
        Assert.assertEquals(actualSubTotal, expectedSubTotal);

        //Change Qty to ‘5’
        shoppingCartPage.sendDataToQuantityField(Keys.CONTROL + "a");
        shoppingCartPage.sendDataToQuantityField("5");
        shoppingCartPage.clickOnUpdateShoppingCart();

        //Verify the product price ‘$225.00'
        String expectedSubTotal1 = "$225.00";
        String actualSubTotal1 = shoppingCartPage.getSubTotal().substring(0, expectedSubTotal1.length());
        Assert.assertEquals(actualSubTotal1, expectedSubTotal1);


    }


}
