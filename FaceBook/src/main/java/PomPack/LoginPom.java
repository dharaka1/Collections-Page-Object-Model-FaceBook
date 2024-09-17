package PomPack;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import BasePack.BaseClass;

public class LoginPom extends BaseClass {

    private static final Map<String, By> locators = new HashMap<>();

    static {
        locators.put("UserName", By.xpath("//input[@aria-label='Email address or phone number']"));
        locators.put("Password", By.xpath("//input[@placeholder='Password']"));
        locators.put("Login", By.xpath("//button[@name='login']"));
    }

    // Method to retrieve locators from the HashMap
    private static By getLocator(String key) {
        return locators.get(key);
    }

    public static void enterUserName() throws IOException {
        driver.findElement(getLocator("UserName")).sendKeys("Dharakasundar99@gmail.com");
        TakeScreenShort(driver, "Screen1");
    }

    public static void enterPassword() throws IOException {
        driver.findElement(getLocator("Password")).sendKeys("GSHSHNSHS");
    }

    public static void clickLogin() throws IOException {
        driver.findElement(getLocator("Login")).click();
        TakeScreenShort(driver, "Screen2");
        quit();
    }
}
