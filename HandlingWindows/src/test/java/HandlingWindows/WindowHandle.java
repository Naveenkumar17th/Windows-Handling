package HandlingWindows;

import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import de.erichseifert.vectorgraphics2d.VectorHints.Key;

public class WindowHandle {
	
	
	public static RemoteWebDriver driver;
	public static Actions ac;
	
	@Test
	
	public void addn() throws InterruptedException {
		
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.navigate().to("https://letcode.in/signin");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("navveen17th@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("1513686");
		
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		
		Thread.sleep(Duration.ofSeconds(8));
		
		driver.findElement(By.id("testing")).click();
		
		driver.findElement(By.xpath("//a[text()='Tabs']")).click();
		
		driver.findElement(By.xpath("//button[text()='Muiltiple windows']")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> wi = driver.getWindowHandles();
		
		List l = new ArrayList();
		
		l.addAll(wi);
		
		for (Object ob : l) {
			
			if(ob.toString().equalsIgnoreCase(parent)) {
				
				
			}else {
				
				driver.switchTo().window(ob.toString()).close();
			}
			
		}
		
		
		
		
		
		
		
		ac = new Actions(driver);
		
	
		
		

	}

}
