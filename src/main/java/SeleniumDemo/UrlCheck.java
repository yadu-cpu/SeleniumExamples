package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlCheck {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Program1\\SeleniumBasics\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.cs-cart.com/");
		Thread.sleep(1000);
		String chURL="https://demo.cs-cart.com/";
		String actualUrl=driver.getCurrentUrl();
		if(chURL.equalsIgnoreCase(actualUrl))
		{
			System.out.println("URL is matching");
		}
		else
			System.out.println("URL is not matching");
		driver.quit();
		
	}

}
