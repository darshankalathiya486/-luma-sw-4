package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    /******************************** All Elements' Path on ShoppingCart page ***********************************************/

    By welcomeText = By.xpath("//span[@class='base']");
    By productName = By.xpath("(//td[@class='col item']//a)[2]");
    By productSize = By.xpath("//dd[contains(text(),'32')]");
    By productColour = By.xpath("//dd[contains(text(),'Black')]");
    By quantityField = By.xpath("//div[@class = 'control qty']/label/input");
    By subTotalField = By.xpath("(//span[@class = 'cart-price'])[2]");
    By updateShoppingCartButton = By.xpath("//span[normalize-space()='Update Shopping Cart']");

    /******************************** All Elements' Action Methods on ShoppingCart page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getProductName() {
        return getTextFromElement(productName);
    }

    public String getProductSize() {
        return getTextFromElement(productSize);
    }

    public String getProductColour() {
        return getTextFromElement(productColour);
    }

    public String getQuantity() {
        return getAttributeFromElement(quantityField, "value");
    }

    public void sendDataToQuantityField(String quantity) {
        sendTextToElement(quantityField, quantity);
    }

    public String getSubTotal() {
        return getTextFromElement(subTotalField);
    }

    public void clickOnUpdateShoppingCart() {
        clickOnElement(updateShoppingCartButton);
    }
}
