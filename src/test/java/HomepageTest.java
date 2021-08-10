import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomepageTest {

@Test
public void Click(){

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.costcotravel.com/");
    CostcoTravelsHomePage homepage = new CostcoTravelsHomePage(driver);
    homepage.getPackages().click();
    System.out.println(homepage.driver.getTitle());
    System.out.println(homepage.driver.getCurrentUrl());

  }


}
