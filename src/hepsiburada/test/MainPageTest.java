package hepsiburada.test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.BeforeClass;


public class MainPageTest {
	
	@BeforeClass
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.hepsiburada.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Türkiye'nin En Büyük Online Alýþveriþ Sitesi Hepsiburada.com"));
		System.out.println("The title of the website is true");
		
		driver.get("https://www.hepsiburada.com/ayagina-gelsin/giris?ReturnUrl=%2f");
        driver.findElement(By.id("email")).sendKeys("rey619_berkay@hotmail.com");
        driver.findElement(By.id("password")).sendKeys("palmiye11");
        driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[4]/button")).click();
        
        Thread.sleep(3000);
        
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"productSearch\"]"));
		searchElement.sendKeys("iphone7");
		searchElement.submit();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("ul.product-list.results-container.do-flex.grid > li:nth-of-type(1) > div.box.product > a")).click();
					
		try {
		Assert.assertTrue(driver.getTitle().contains("Apple iPhone 7 32 GB (Apple Türkiye Garantili) Fiyatý"));
		System.out.println("The content is the same!");
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\screenshot.png"));
		}
		catch(Error e) {
		System.out.println("The content is different from each other!");
		File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D:\\screenshot.png"));
		}
		
		driver.findElement(By.id("myAccount")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"myAccount\"]/div[2]/div/ul/li[7]/a")).click();
						
	}
}
