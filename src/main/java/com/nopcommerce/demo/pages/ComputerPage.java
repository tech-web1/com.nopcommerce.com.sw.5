package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement Computer;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1])")
    WebElement Menu;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement DeskTop;
   @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
   WebElement cart;

   @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
     WebElement PentiumDual;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
     WebElement Class;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Vista Premium [+$60.00]")
    WebElement VistaPremium;
    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
     WebElement Checkout;







    public void clickOnComputer(){
        clickOnElement(Computer);
    }
    public void clickOnMenu(){
        clickOnElement(Menu);
    }
    public void clickOnDeskTop(){
        clickOnElement(DeskTop);
    }

    public void clickOnCart(){
        clickOnElement(cart);

    }
    public void selectPentiumDual(){
        selectByValueFromDropDown(PentiumDual,"");
    }
    public void select8GbClass(){

        selectByVisibleTextFromDropDown(Class,"");
    }

    public void selectOsRadio(){
        selectByVisibleTextFromDropDown(VistaPremium,"");
    }
    public void clickOnCheckOut(){
        clickOnElement(Checkout);
    }










}
