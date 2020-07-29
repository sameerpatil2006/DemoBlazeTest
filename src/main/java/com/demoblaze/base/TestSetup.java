package com.demoblaze.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestSetup {

    public static WebDriver driver;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @BeforeClass
    public void setupClass() throws MalformedURLException {
        setDriver();
    }

    private void setDriver() throws MalformedURLException {
        String browser = System.getProperty("browser");
        String ip = System.getProperty("ip");

        if(ip != null) {
            /*if (browser == "firefox") {
                capabilities.setBrowserName(BrowserType.FIREFOX);
                System.out.println("Using remote firefox browser with IP: " + ip);
            }
            else {*/
                capabilities.setBrowserName(BrowserType.CHROME);
                System.out.println("Using remote chrome browser with IP: " + ip);
            //}
            driver = new RemoteWebDriver(new URL("http://" + ip + ":4444/wd/hub"), capabilities);
        }
        else {
           /* if (browser.equalsIgnoreCase("firefox")) {
                System.out.println("Using local firefox browser");
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");
                driver = new FirefoxDriver();
            }
            else {*/
                System.out.println("Using local chrome browser");
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
                driver = new ChromeDriver();
            //}
        }
        driver.get("https://www.demoblaze.com/");
        //driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
