package classwork;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Manual {
	
	
	public static ChromeDriver driver;
	@Test
	public void sample() throws InterruptedException {
	
	
//public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://acme-test.uipath.com/account/login");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementById("email").sendKeys("anand.rr5@gmail.com");
	driver.findElementById("password").sendKeys("08V6ve");
	driver.findElementById("buttonLogin").click();
	
	Thread.sleep(3000);
	
	WebElement findElementByXPath = driver.findElementByXPath("//button[text()=' Vendors']");
	Actions A=new Actions(driver);
	
	A.moveToElement(findElementByXPath).perform();
	driver.findElementByLinkText("Search for Vendor").click();
	driver.findElementById("vendorTaxID").sendKeys("IT213456");
	driver.findElementById("buttonSearch").click();
	
	WebElement eleTable = driver.findElement(By.xpath("//table[@class='table']"));
	List<WebElement> rows = eleTable.findElements(By.tagName("tr"));
	
	 WebElement eleFirstRow = rows.get(1);
	 
	 List<WebElement> cells = eleFirstRow.findElements(By.tagName("td"));
	 String txtVendor = cells.get(0).getText();
	 
	 System.out.println("Vendor name : "+ txtVendor);
	
	
	
	
	
	
	
}

}
