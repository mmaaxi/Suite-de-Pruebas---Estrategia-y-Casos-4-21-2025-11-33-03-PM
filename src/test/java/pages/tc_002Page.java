package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_002Page {

    WebDriver driver;
    
    By logoutButton = By.id("logoutButtonId");
    By loginPageIdentifier = By.id("loginPageId");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ensureLoggedIn() {
        // Logic to ensure the user is logged in goes here
    }

    public void clickLogoutButton() {
        WebElement button = driver.findElement(logoutButton);
        button.click();
    }

    public boolean isLoginPageDisplayed() {
        return driver.findElement(loginPageIdentifier).isDisplayed();
    }
}