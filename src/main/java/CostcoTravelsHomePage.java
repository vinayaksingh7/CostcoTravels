import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CostcoTravelsHomePage {

    WebDriver driver;
    public CostcoTravelsHomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="vacation-packages-tab-id")
    WebElement widgetpackages;

    public WebElement getPackages() {
        return widgetpackages;
    }
}
