package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import utils.BrowserManager;

public class GoogleSearchTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserManager.getDriver();
        driver.get("https://www.google.com");
    }

    @Test
    public void testSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.search("Selenium WebDriver tutorial");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
