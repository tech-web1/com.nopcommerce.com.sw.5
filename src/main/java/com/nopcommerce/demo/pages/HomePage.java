package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
        @CacheLookup
        @FindBy(linkText = "Log in")
        WebElement loginText;

        @CacheLookup
        @FindBy(linkText="Register")
         WebElement registerLink;
        

        public void clickOnLoginLink() {

            clickOnElement(loginText);
        }

        public void clickOnRegisterLink() {
            clickOnElement(registerLink);
        }

    }

