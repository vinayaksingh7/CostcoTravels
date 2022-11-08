package com.costocotravel.testcases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.TestBase.TestBase;
import com.costcotravels.CostcoTravelsHomePage;

public class HomepageTest extends TestBase {

    CostcoTravelsHomePage homePage;

    @Before
    public void setUp(){
        initialization();
        homePage = new CostcoTravelsHomePage();
    }

    @Test
    public void clickOnWidgetPackage() {
        homePage.getPackages().click();
    }

    @Test
    public void validateHomePageTitleTest() {
        String title = homePage.validateHomePageTitle();
        Assert.assertEquals("Home | Costco Travel", title);
        System.out.println("Title is -" + title);
        System.out.println("Testing webHook - 1");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
