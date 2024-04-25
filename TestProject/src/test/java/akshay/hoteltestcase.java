package akshay;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.LoginPage;

import io.stage.hudinielevate.cms.pages.DashboardPage;
import io.stage.hudinielevate.cms.pages.RestaurantsPage;
import io.stage.hudinielevate.cms.pages.brandpage;
import io.stage.hudinielevate.cms.pages.hotelpage;

public class hoteltestcase {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public brandpage BrandPage;
	public hotelpage Hotelpage;

	@BeforeMethod
	@Parameters("browserName")
	public void setUp(String browserName) {

		System.out.println("Browser name=" + browserName);

		baseClass = new BaseClass();
		properties = baseClass.initializeProperties();
		driver = baseClass.initializeBrowser(properties);
		System.out.println("Driver=" + driver);
		driver.get(properties.getProperty("appURL"));
		System.out.println("App URL=" + driver.getCurrentUrl());
		//System.out.println(properties.getProperty("username"));
		//System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("superadminusername"));
		System.out.println(properties.getProperty("superadminpassword"));
		loginPage = new LoginPage(driver, properties);

	}
// creation of hotel 
	@Test(enabled = true, priority = 1)
	public void Creationnewhotel() {
		loginPage.loginAsSuperAdmin();
		dashboardPage = loginPage.navigateToDashboardPage();
		Hotelpage=new hotelpage(driver);
		Hotelpage.NavigateTohotelpage();
		Hotelpage.createNewHotel();
		boolean ishotelCreated = Hotelpage.createNewHotel();
		Assert.assertTrue(ishotelCreated);		
}
}
