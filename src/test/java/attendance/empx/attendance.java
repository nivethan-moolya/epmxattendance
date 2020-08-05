package attendance.empx;

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
			driver.manage().window().fullscreen();
			System.out.println("Opening Browser");
			WebElement usrnm = driver.findElement(user);
			usrnm.clear();
			usrnm.sendKeys("MSTPL294");
			System.out.println("Key in Username");
			WebElement pssw = driver.findElement(psswrd);
			pssw.clear();
			pssw.sendKeys("Cbe12345");
			System.out.println("Key in Password");
			WebElement comp = driver.findElement(cmpany);
			comp.clear();
			comp.sendKeys("Moolya");
			System.out.println("Key in Company name");
			driver.findElement(login).click();
			System.out.println("Verified Homepage");
			driver.quit();
		} catch (Exception e) {
			System.out.println("Error:\n" + e.getMessage());
		}

	}

}
