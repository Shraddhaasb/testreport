package Scroll_Up_Down;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example1_ScrollUpDown {
	
	public static void main(String[]args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ggtggg")));
//		
		Thread.sleep(1000);
		
		
		// down --> 2nd parameter +ve value
		
	//	((JavascriptExecutor)driver).executeScript("window.scrollby(0,1000)");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
		
		//// up --> 2nd parameter -ve value
		
		 Thread.sleep(1000);
		 
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
		
		// right --> 1st parameter +ve value
		((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,0)");
		
	}

	
}
