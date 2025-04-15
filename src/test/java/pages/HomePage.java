package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("q"); // Google search box
    By searchBtn = By.name("btnK"); // Search button

    public void search(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchBtn).submit(); // Press Enter or click Search
    }
}
