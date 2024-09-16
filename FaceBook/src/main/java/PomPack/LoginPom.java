package PomPack;

import java.io.IOException;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class LoginPom extends BaseClass {

	public static By UserName = By.xpath("//input[@aria-label=\"Email address or phone number\"]");

	public static void UserName() throws IOException {

		driver.findElement(UserName).sendKeys("Dharakasundar99@gmail.com");

		TakeScreenShort(driver, "Screen1");

	}

	public static By password = By.xpath("//input[@placeholder=\"Password\"]");

	public static void password() throws IOException {

		driver.findElement(password).sendKeys("GSHSHNSHS");

	}

	public static By Login = By.xpath("//button[@name=\"login\"]");

	public static void Login() throws IOException {

		driver.findElement(Login).click();

		TakeScreenShort(driver, "Screen2");

		quit();
	}

}
