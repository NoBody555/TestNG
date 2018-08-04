package testNGPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestNGFile {
	public String baseUrl = "http://demo.guru99.com/selenium/newtours/";
    String driverPath = "C://Users//ccomp//Desktop//chromedriver.exe";
    public WebDriver driver ; 
	@Test
	  public void verifyHomepageTitle() {
	System.out.println("launching firefox browser"); 
    //System.setProperty("webdriver.firefox.marionette", driverPath);
    //driver = new FirefoxDriver();
    System.setProperty("webdriver.chrome.driver",driverPath);
    driver = new ChromeDriver();
    driver.get(baseUrl);
    String expectedTitle = "Welcome: Mercury Tours";
    String actualTitle = driver.getTitle();
    Assert.assertEquals(actualTitle, expectedTitle);
    driver.close();
}
}