package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPantsPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    HomePage homePage = new HomePage();
    MenPantsPage menPantsPage = new MenPantsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();


    @Test
    //Method name userShouldAddProductSuccessFullyToShoppingCart
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {

        //Mouse Hover on Men Menu
        Thread.sleep(2000);
        homePage.mouseHoverMenMenu();

        //Mouse hover on Bottoms
        Thread.sleep(2000);
        homePage.mouseHoverBottomsMenu();
        //Click on Pants
        homePage.clickOnPantsMenu();

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        menPantsPage.mouseHoverOnCronusYodaPant();
        menPantsPage.mouseHoverAndClickOnCronusYogaPantSize32();

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        menPantsPage.mouseHoverOnCronusYodaPant();
        menPantsPage.mouseHoverAndClickCronusYogaPantColourBlack();

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        menPantsPage.mouseHoverOnCronusYodaPant();
        menPantsPage.mouseHoverAndClickOnCronusYogaPantAddToCartButton();

        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        String expectedProductAddMessage = "You added Cronus Yoga Pant to your shopping cart.";
        String actualProductAddMessage = menPantsPage.getProductAddedMessage().substring(0, expectedProductAddMessage.length());
        Assert.assertEquals(actualProductAddMessage, expectedProductAddMessage);

        //Click on ‘shopping cart’ Link into message
        menPantsPage.clickOnShoppingCartLinkInProductAddMessage();

        //Verify the text ‘Shopping Cart.’
        String expectedShoppingCartWelcomeMessage = "Shopping Cart";
        String actualShoppingCartWelcomeMessage = shoppingCartPage.getWelcomeText().substring(0, expectedShoppingCartWelcomeMessage.length());
        Assert.assertEquals(actualShoppingCartWelcomeMessage, expectedShoppingCartWelcomeMessage);

        //Verify the product name ‘Cronus Yoga Pant’
        String expectedProductName = "Cronus Yoga Pan";
        String actualProductName = shoppingCartPage.getProductName().substring(0, expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);

        //Verify the product size ‘32’
        //Verify the product colour ‘Black’
        String expectedProductSize = "32";
        String actualProductSize = shoppingCartPage.getProductSize().substring(0, expectedProductSize.length());
        Assert.assertEquals(actualProductSize, expectedProductSize);

        String expectedProductColour = "Black";
        String actualProductColour = shoppingCartPage.getProductColour().substring(0, expectedProductColour.length());
        Assert.assertEquals(actualProductColour, expectedProductColour);


    }
}
