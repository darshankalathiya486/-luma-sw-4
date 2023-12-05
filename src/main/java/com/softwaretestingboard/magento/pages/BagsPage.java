package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {

    /******************************** All Elements' Path on Bags page ***********************************************/

    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");

    /******************************** All Elements' Action Methods on Bags page *************************************/

    public void mouseHoverAndClickOnOvernightDuffleProduct() {
        mouseHoverToElementAndClick(overnightDuffle);
    }
}
