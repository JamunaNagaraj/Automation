package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "//home//jamuna//eclipse-workspace//Jar Files//geckodriver");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "logs.txt");

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com");

		System.out.println("Page Title [1] - " + driver.getTitle());

		driver.findElement(By.name("q")).sendKeys("Google");
		driver.findElement(By.name("btnK")).click();
		System.out.println("Page Title [2] - " + driver.getTitle());
		driver.quit();
	}

}
