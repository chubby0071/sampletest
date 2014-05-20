package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test {

	
	@Test
	/**
	 * @param args
	 */
	public void verify() {
		// TODO Auto-generated method stub
 
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println("opened");
	}

}
