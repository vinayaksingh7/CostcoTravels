package com.costcotravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.TestBase.TestBase;

public class CostcoTravelsHomePage extends TestBase {

    public CostcoTravelsHomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="vacation-packages-tab-id")
    WebElement widgetpackages;

    public WebElement getPackages() {
        return widgetpackages;
    }

    public String validateHomePageTitle() {
        return driver.getTitle();
    }

}
