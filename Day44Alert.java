package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day44Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		
		WebElement ele = driver.findElement(By.id("result"));
		driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(1) > button")).click();
		String alertString = driver.switchTo().alert().getText();
		if (alertString.equals("I am a JS Alert")) {
			System.out.println("test case pass");
		}
		driver.switchTo().alert().accept();
		if(ele.getText().equals("You  succesfully clicked an alert")) {
		
			System.out.println("Test case pass");
		}
	}}	
		
		
		
		
		
		
		
	


