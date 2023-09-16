package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Day47Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		// test case 5
		
	WebElement ele = driver.findElement(By.id("result"));
		
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
	String text = driver.switchTo().alert().getText();
	
	if(text.equals("I am a JS prompt")){
		System.out.println("test case pass");
		
	}
	else {
		System.out.println("test case fail");
	}
	
	//test case for text message
	
	driver.switchTo().alert().sendKeys("I am learning alert ");
	driver.switchTo().alert().accept();
	if(ele.getText().equals("You entered:text ")){
	System.out.println("Test case pass");
	
	}
	else {
		System.out.println("Test case fail");
	}
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
	String text1 = driver.switchTo().alert().getText();
	
	if(text1.equals("I am a JS prompt")){
		System.out.println("test case1 pass");
		
	}
	else {
		System.out.println("test case1 fail");
	}
	
	driver.switchTo().alert().sendKeys("I am learning alert ");
	driver.switchTo().alert().accept();
	if(ele.getText().equals("You entered:text ")){
	System.out.println("Test case pass");
	
	}
	else {
		System.out.println("Test case fail");

}
// test case for dismiss
	
	driver.findElement(By.cssSelector("#content > div > ul > li:nth-child(3) > button")).click();
	String text2 = driver.switchTo().alert().getText();
	
	if(text2.equals("I am a JS prompt")){
		System.out.println("test case2 pass");
		
	}
	else {
		System.out.println("test case2 fail");
	}
	
	driver.switchTo().alert().sendKeys("text 2 ");
	driver.switchTo().alert().dismiss();
	if(ele.getText().equals("You entered:null ")){
	System.out.println("Test case pass");
	
	}
	else {
		System.out.println("Test case fail");

	
	
	}
	driver.close();
	driver.quit();
	
	}}
