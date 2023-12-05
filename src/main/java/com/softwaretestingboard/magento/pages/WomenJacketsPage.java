package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenJacketsPage extends Utility {

    //Select Sort By filter “Product Name”
    By productNameFilter = By.id("sorter");

    //Verify the products name display in alphabetical order
    By allProductName = By.xpath("//strong[@class='product name product-item-name']//a");

    //Select Sort By filter “Product Price list”
    By productPriceFilter = By.id("sorter");

    // Storing jackets price in list
    By allProductPrice = By.xpath("//span[@class='price-wrapper ']//span");






    //Select Sort By filter “Product Name”
    public void selectProductNameFilterByValue(String value){
        selectByValueFromDropDown(productNameFilter,value);
    }

    //Verify the products name display in alphabetical order
    public List<WebElement> getProductNameWithoutFilter () {
        List<WebElement> getProductName = driver.findElements(allProductName);
        return getProductName;
    }

    //Select Sort By filter “Product Price list”
    public void selectProductPriceFilter (String value){
        selectByValueFromDropDown(productPriceFilter,value);
    }

    //Storing jackets price in list
    public List<WebElement> getProductPriceWithoutFilter(){
        List<WebElement> getProductPrice = driver.findElements(allProductPrice);
        return getProductPrice;
    }








}
