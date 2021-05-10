package attendance.empx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class attendance {
	
	By user = By.id("usr_1");
	By psswrd = By.id("pId");
	By cmpany = By.id("location");
	By login = By.xpath("//div[@class='login-form']/div[9]/input[@value='Login']");


	@Test
	public void MarkAttendance() throws InterruptedException {
		
		try {

			WebDriver driver = new ChromeDriver();
			//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());

			// TimeUnit.SECONDS.sleep(5);
			driver.get("https://live2.empxtrack.com");
			
			System.out.println("Opening Browser");
			WebElement usrnm = driver.findElement(user);
			usrnm.clear();
			usrnm.sendKeys("MSTPL294");
			System.out.println("Key in Username");
			WebElement pssw = driver.findElement(psswrd);
			pssw.clear();
			pssw.sendKeys("M00lya123");
			System.out.println("Key in Password");
			WebElement comp = driver.findElement(cmpany);
			comp.clear();
			comp.sendKeys("Moolya");
			System.out.println("Key in Company name");
			driver.findElement(login).click();
			System.out.println("Verified Homepage");
			//driver.quit();
			driver.manage().window().fullscreen();
			TimeUnit.SECONDS.sleep(5);
			driver.findElement(By.id("myAttendance")).click();
			TimeUnit.SECONDS.sleep(5);
			WebElement attButton = driver.findElement(By.xpath("//div[@class='col-md-7']/a"));
			System.out.println("Button name:\t"+attButton.getText());
			attButton.click();
		} catch (Exception e) {
			System.out.println("Error:\n" + e.getMessage());
		}

	}

}
