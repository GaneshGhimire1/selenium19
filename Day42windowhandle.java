package seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day42windowhandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
		
		driver.get("https://www.webdriveruniversity.com/");
		driver.findElement(By.cssSelector("#contact-us")).click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		Iterator <String> s = windows.iterator();
		String parentWindowA = s.next();
		System.out.println(parentWindowA);
		String childWindow = s.next();
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		
		WebElement ele = driver.findElement(By.cssSelector("#contact_me > div > div:nth-child(1) > div > h2"));
	
		if(ele.isDisplayed()){
			System.out.println("test case pass");
			
		}
		if(driver.getTitle().equals("WebDriver | Contact Us")) {
		
			System.out.println();
	}
	driver.switchTo().window(parentWindow);
	driver.getCurrentUrl();
	driver.quit();

}}
