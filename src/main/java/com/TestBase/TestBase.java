package com.TestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/"
                    + "/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void initialization() {
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            
            ChromeOptions options = new ChromeOptions();
			options.addArguments("headless");
			options.addArguments("disable-gpu");
			
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			driver = new ChromeDriver(options);
           
        } else if (browserName.equals("FF")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\vinay\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new FirefoxDriver();
        }

        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //Wait
/*      driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);*/


    }
}
