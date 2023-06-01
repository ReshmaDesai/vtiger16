

package Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AntiTimeLogin {
	public static void main(String[] args) throws InterruptedException {
	
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("container_tasks")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("container_reports")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("container_users")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("logoutLink")).click();
	    
		
	}
}
