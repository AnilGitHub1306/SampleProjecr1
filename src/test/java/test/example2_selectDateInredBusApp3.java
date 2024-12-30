package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class example2_selectDateInredBusApp3 {
	@Test
	public static void test() throws InterruptedException {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		driver.close();
		//
		}
}
