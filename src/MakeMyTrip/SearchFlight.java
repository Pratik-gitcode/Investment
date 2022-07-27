package MakeMyTrip;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchFlight {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratik\\Desktop\\SeleniumUPDATED\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		//*[@id="root"]/div/div[3]/div[2]/div[2]/div/div[3]/input
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("koyla");
		driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).click();
		
		List<WebElement> sugg = driver.findElements(By.xpath("//div[@class='sc-lnmtFM kaiLzO']"));
		System.out.println(sugg.size());
		
		
		//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Set<String> ids = driver.getWindowHandles();
//		System.out.println(ids.size());
//		for(String id:ids)
//		{
//			System.out.println(id);
//		}
		
		//driver.findElement(By.xpath("//div[@class='login__card makeFlex hrtlCenter cursorPointer appendBottom10']")).click();
//driver.findElement(By.xpath("//ul[@class='makeFlex font12']/li[1]")).click();
		//login make my trip
//		driver.findElement(By.xpath("//div[@class='fsw_inputBox searchCity inactiveWidget ']")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.id("username")).sendKeys("xixijip577@spruzme.com");
//		
//		driver.findElement(By.xpath("//button[@data-cy='continueBtn']")).click();
//		
//		//password Pr@tik123
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pr@tik123");
//		
//		//click on login button
//		driver.findElement(By.xpath("//button[@data-cy='login']")).click();
//		Thread.sleep(3000);
	//	driver.quit();
		
		
	}

}
