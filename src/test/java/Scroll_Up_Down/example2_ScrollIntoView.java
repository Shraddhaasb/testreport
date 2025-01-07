package Scroll_Up_Down;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_ScrollIntoView {

	public static void main (String[]args) throws InterruptedException
	
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		Thread.sleep(1000);
		
		WebElement ele=driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		Thread.sleep(1000);
		
		// This will scroll the page till the element is found
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
	}
}
