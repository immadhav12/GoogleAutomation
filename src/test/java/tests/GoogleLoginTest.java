package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.BrowserManager;
public class GoogleLoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserManager.getDriver();
        driver.get("https://accounts.google.com/");
    }

    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithEmail("your_email@gmail.com"); // Replace with a test email
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
