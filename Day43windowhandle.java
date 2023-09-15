package seleniumtutorials;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day43windowhandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.Chrome.driver",
				"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		
		driver.get("https://www.webdriveruniversity.com/");

		//String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("contact-us")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("login-portal")).click();
		driver.findElement(By.id("button-clicks")).click();
		driver.findElement(By.id("to-do-list")).click();
		driver.findElement(By.id("page-object-model")).click();
		Set <String> windows = driver.getWindowHandles();
		System.out.println(windows);
		// WebDriver | button-clicks

		Iterator <String> s = windows.iterator();
		while(s.hasNext()) {
			String windowId = s.next();
			driver.switchTo().window(windowId);
			if(driver.getTitle().equals("WebDriver | Button Clicks")) {
				System.out.println(driver.getTitle());
				System.out.println("Test case  pass");
				break;
			}

		}

		driver.quit();
		
		
	}

}
