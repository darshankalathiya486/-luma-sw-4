package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {


    // Mouse Hover on Women Menu
    By womenMenu = By.xpath("//span[normalize-space()='Women']");

    // Mouse Hover on Tops
    By topsMenu = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");

    // Click on Jackets
    By jacketsTab = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    // Mouse Hover on Men Menu
    By menMenu = By.xpath("//span[normalize-space()='Men']");

    //Mouse hover on Bottoms
    By bottomsTab = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");

    // click On pants
    By pantsTab = By.xpath("//a[@id='ui-id-23']");

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");

    By bagsSubMenuOfGear = By.xpath("//span[normalize-space()='Bags']");




    //Mouse Hover on Women Menu
    public void mouseHoverWomenMenu (){
        mouseHoverToElement(womenMenu);
    }

    // Mouse Hover on Tops
    public void mouseHoverTopsMenu (){
        mouseHoverToElement(topsMenu);
    }

    // Click on Jackets
    public void clickOnJacketsMenu (){
        clickOnElement(jacketsTab);
    }

    // Mouse Hover on Men Menu
    public void mouseHoverMenMenu (){
        mouseHoverToElement(menMenu);
    }

    //Mouse hover on Bottoms
    public void mouseHoverBottomsMenu (){
        mouseHoverToElement(bottomsTab);
    }

    // click On pants
    public void clickOnPantsMenu (){
        clickOnElement(pantsTab);
    }

    public void mouseHoverOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }

    public void mouseHoverAndClickOnBagsSubMenuOfGear() {
        mouseHoverToElementAndClick(bagsSubMenuOfGear);
    }







}
