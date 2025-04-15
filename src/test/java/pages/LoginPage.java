package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Replace these with actual XPaths
    By emailField = By.xpath("your_xpath_here");
    By nextButton = By.xpath("your_xpath_here");

    public void loginWithEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(nextButton).click();
    }
}
