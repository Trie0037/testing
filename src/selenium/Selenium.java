package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {
	@Test
	private void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://checklisted.herokuapp.com/");
		System.out.println("Yay, it works!");
		Thread.sleep(5000);
		driver.close();
	}

}
