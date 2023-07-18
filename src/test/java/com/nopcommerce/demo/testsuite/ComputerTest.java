package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ComputerTest extends BaseTest {

    ComputerPage computerTest=new ComputerPage();


    @Test(groups = {"sanity", "regression"})
    public void verifyProductArrangeInAlphaBaticalOrder(){
        computerTest.clickOnComputer();
        computerTest.clickOnMenu();
        computerTest.clickOnDeskTop();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyProductAddedToShoppingCartSuccessFully(){
       computerTest.clickOnCart();
       computerTest.selectPentiumDual();
       computerTest.select8GbClass();
       computerTest.selectOsRadio();
       computerTest.clickOnCheckOut();
    }
}
