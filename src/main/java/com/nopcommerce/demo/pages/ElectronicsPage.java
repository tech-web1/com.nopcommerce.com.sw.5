package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElectronicsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[2]/a")
    WebElement Electronics;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement CellPhone;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement View;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Nokia Lumia 1020')]")
     WebElement Nokia;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'$349.00')]")
    WebElement Cart;
   @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement CheckBox;
   @CacheLookup
   @FindBy(xpath = "//button[@id='checkout']")
    By CheckOut=By.xpath("//button[@id='checkout']");












    public void hoverOneElectronics(){
        mouseHoverToElement(Electronics);
    }
    public void clickOnCellPhone(){
        clickOnElement(CellPhone);
    }
    public void clickOnView(){
        clickOnElement(View);
    }
    public void clickOnNokia(){
        clickOnElement(Nokia);
    }
    public void clickOnCart(){
        clickOnElement(Cart);
    }
    public void clickOnCheckBox(){
        clickOnElement(CheckBox);
    }
    public void clickOnCheckOutBox(){
        clickOnElement(CheckOut);
    }
}
