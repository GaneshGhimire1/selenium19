package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day45Alert {
	public static void main(String[] args) {
	System.setProperty("webdriver.Chrome.driver",
			"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	
	WebElement ele = driver.findElement(By.id("result"));
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
	String text = driver.switchTo().alert().getText();
	if (text.equals("I am a JS Confirm")) {
		System.out.println("test case  for text is pass");
	}
	// test case  2for ok
	driver.switchTo().alert().accept();
	System.out.println(ele.getText());
	if(ele.getText().equals("You clicked ok")) {
	
		System.out.println("Test case for element text is pass");
	}
	
	
	// Test case 2 for cancel
	
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(2) > button")).click();
	 String text1 = driver.switchTo().alert().getText();
		if (text1.equals("I am a JS Confirm")) {
			System.out.println("test case  for text is pass");
		}
		driver.switchTo().alert().dismiss();
		System.out.println(ele.getText());
		if(ele.getText().equals("You clicked cancel")) {
		
			System.out.println("");	
	
	
	}
}}	
	
		
	
	
	

