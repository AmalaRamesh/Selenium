package demosite1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testsite1 {
//demo test:
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.setProperty("webdriver.driver.chrome",
				"C:\\Users\\amala\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver page = new ChromeDriver();

		page.manage().window().maximize();
		page.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		page.get("https://magento.softwaretestingboard.com/");
		WebElement findElement = page.findElement(By.partialLinkText("Sign In"));
		findElement.click();
		page.findElement(By.xpath("//input[@name=\"login[username]\"]")).sendKeys("amalaramesh08@gmail.com");
		page.findElement(By.xpath("//input[@name=\"login[password]\"]")).sendKeys("Ramesh@123");
		System.out.println("login success");
		page.findElement(By.xpath("//button[@class=\"action login primary\"]")).click();
		page.findElement(By.xpath("//span[text()=\"Women\"]")).click();
		page.findElement(By.xpath("//img[@class=\"product-image-photo\"]")).click();
		page.findElement(By.xpath("//div[@class=\"swatch-option text\"][1]")).click();
		page.findElement(By.id("option-label-color-93-item-50")).click();
		page.findElement(By.xpath("//span[text()=\"Add to Cart\"]")).click();
		Thread.sleep(3000);
		page.findElement(By.xpath("//a[@class=\"action showcart\"]")).click();
		page.findElement(By.id("top-cart-btn-checkout")).click();
		Thread.sleep(1000);
		page.findElement(By.xpath("//input[@class=\"radio\"]")).click();
		page.findElement(By.xpath("//button[@class=\"button action continue primary\"]")).click();
		Thread.sleep(1000);
		page.findElement(By.xpath("//input[@name=\"billing-address-same-as-shipping\"]")).click();
		page.findElement(By.xpath("//button[@class=\"action action-update\"]")).click();
		page.findElement(By.xpath("//button[@title=\"Place Order\"][1]")).click();
		System.out.println("Thank you for your purchase!");
		Thread.sleep(5000);
//		page.close();
		WebElement printout = page.findElement(By.xpath("//p[text()='Your order number is: ']"));
		//System.out.println(printout.getText());
		String getOrderNo=printout.getText();
		System.out.println(getOrderNo);
		page.quit();

		
		
		
		

}}
