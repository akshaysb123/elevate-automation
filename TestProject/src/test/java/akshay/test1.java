package akshay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test1 {
	@Test
	public void Ak() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("browser launched");
		driver.get("https://cms.hudinielevate-stage.io/");
		driver.findElement(By.xpath(
				"//input[@id='email' and @ class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd']"))
				.sendKeys("superadmin@hudini.io");
		driver.findElement(By.xpath(
				"//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd' and @id='password']"))
				.sendKeys("Hudini@12#$");
		driver.findElement(By.xpath("//span[contains(.,'LOGIN')]")).click();
		Thread.sleep(2000);
		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.xpath("//img[@alt='btn']")).click();
			Thread.sleep(5000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(.,'Brands')]")).click();
		Thread.sleep(2000);
		// for single brand creation
		/*
		 * driver.findElement(By.
		 * xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']")).click(
		 * ); //Thread.sleep(2000);
		 * driver.findElement(By.id("select_hotel_group_select")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.xpath("//li[contains(.,'AutomationGroup')]")).click();
		 * driver.findElement(By.
		 * xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd' and @id=\"brand_name_input\"]"
		 * )).sendKeys("testautomation");
		 * driver.findElement(By.id("brand_code_input")).sendKeys("brand");
		 * driver.findElement(By.id("description_input")).sendKeys("test description");
		 * driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
		 * driver.findElement(By.xpath(
		 * "/html/body/div[8]/div[3]/form/div/div[3]/div/button[1]/span[1]")).click();
		 */
		// for multiple brand creation
		for (int i = 1; i <= 3; i++) {
			driver.findElement(By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']")).click();
			// Thread.sleep(2000);
			driver.findElement(By.id("select_hotel_group_select")).click();
			// Thread.sleep(2000);
			driver.findElement(By.xpath("//li[contains(.,'Automation')]")).click();
			// Thread.sleep(5000);
			driver.findElement(By.xpath(
					"//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd' and @id=\"brand_name_input\"]"))
					.sendKeys("testautomation" + (i + 200));
			// Thread.sleep(5000);
			driver.findElement(By.id("brand_code_input")).sendKeys("bttrand1" + (i + 200));
			// Thread.sleep(5000);
			driver.findElement(By.id("description_input")).sendKeys("test description" + (i + 200));
			driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
			// Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[8]/div[3]/form/div/div[3]/div/button[1]/span[1]")).click();
			Thread.sleep(5000);
			System.out.println(" testautomation" + (i + 200) + " brand created");
		}

	}

}
