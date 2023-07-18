package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsPage electronicsPage=new ElectronicsPage();

    @Test(groups = {"sanity","regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
        electronicsPage.hoverOneElectronics();
        electronicsPage.clickOnCellPhone();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void productAddedSuccessfullyAndPlaceOrderSuccessfully(){
        electronicsPage.clickOnView();
        electronicsPage.clickOnNokia();
        electronicsPage.clickOnCart();
        electronicsPage.clickOnCheckBox();
        electronicsPage.clickOnCheckOutBox();
    }
}
