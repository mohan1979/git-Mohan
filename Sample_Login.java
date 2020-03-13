package MavenPkg.Project;
comment 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StudentLogin1303 
{
	public static void main(String args[]) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D:\\MOHAN\\MOHAN\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://karankitrainings.epizy.com/");
		driver.findElement(By.id("id")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='submit']")).click();
		Thread.sleep(3000);
		if (driver.getTitle().equals("add course1"))
		{System.out.println("Login Succesfull");
		driver.findElement(By.id("cshort")).sendKeys("MCA");
		driver.findElement(By.name("course-full")).sendKeys("Masters in Computer Adminstation");
		driver.findElement(By.name("submit")).click();
		
		}
		else
		{System.out.println("Failed Login");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//A[@href='#'])[2]")).click();
		driver.findElement(By.xpath("//A[@href='add-subject.php'][text()='Add Subject']")).click();
		
		}
		Thread.sleep(3000);
		driver.quit();
	}
	

}
