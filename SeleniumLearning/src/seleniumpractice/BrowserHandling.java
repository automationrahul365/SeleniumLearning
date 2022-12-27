package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul_sharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("qa.rahul365@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	}

}
