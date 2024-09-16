package BasePack;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static WebDriver driver;
	public static void LaunchBrowsers(String Browser) {
		if (Browser.equalsIgnoreCase("Chrome")) {

			driver = new ChromeDriver();

		} else if (Browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else if (Browser.equalsIgnoreCase("Firefox")) {

			driver = new FirefoxDriver();

		} else {
			System.out.println("No browsers were found");
		}

		Max(Browser);
	}
	
	public static void LaunchUrl(String url) {

		driver.get(url);

	}
	
	public static void jsScroll( WebElement scroll) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", scroll);
	}

	public static void Max(String Maximize) {
     
		driver.manage().window().maximize();
}
	public static void navigateForward() {

		driver.navigate().forward();

	}
	public static void navigateback() {

		driver.navigate().back();

	}
	public static void WindowsHandling() {

		Set<String> windowHandle = driver.getWindowHandles();
		List<String> win = new ArrayList<String>(windowHandle);
		driver.switchTo().window(win.get(0));
	}

	public static void jsClick(WebElement click) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", click);
	}
	public static void TakeScreenShort(WebDriver driver2, String string) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		File path = new File(
				"C:\\Users\\welcome\\eclipse-workspace\\FaceBook\\target\\ScreenShorts"+ string + ".png");
		FileUtils.copyFile(src, path);
	}
	public static void RobotClass() throws AWTException {
		Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_ENTER);

	}
	public static void Implicit() {


	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		}

	public static void quit() {
		driver.quit();
	}

}

