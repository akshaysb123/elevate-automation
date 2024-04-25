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

public class brandtestcase {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public brandpage BrandPage;

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
// creation of brand 
	@Test(enabled = true, priority = 1)
	public void verifybrandCreationTest() {
		loginPage.loginAsSuperAdmin();
		dashboardPage = loginPage.navigateToDashboardPage();
		BrandPage=new brandpage(driver);
		BrandPage.NavigateTobrandpage();
		boolean isbrandCreated = BrandPage.createNewBrand();
		Assert.assertTrue(isbrandCreated);		
}
	// creation of multiple brand 
	@Test(enabled=false, priority=3)
	public void multiplebrandcreation() {
		loginPage.loginAsSuperAdmin();
		dashboardPage = loginPage.navigateToDashboardPage();
		BrandPage=new brandpage(driver);
		BrandPage.NavigateTobrandpage();
        BrandPage.multiplecreateNewBrand();
		
		
	}
	//update brand 
	@Test(enabled=true, priority=2)
	public void brandupdate() {
		loginPage.loginAsSuperAdmin();
		dashboardPage = loginPage.navigateToDashboardPage();
		BrandPage=new brandpage(driver);
		BrandPage.NavigateTobrandpage();
		BrandPage.UpdateBrand();
	}
	//delete brand 
	@Test(enabled=true, priority=3)
	public void branddelete1() {
		loginPage.loginAsSuperAdmin();
		dashboardPage = loginPage.navigateToDashboardPage();
		BrandPage=new brandpage(driver);
		BrandPage.NavigateTobrandpage();
		BrandPage.branddelete();
	
}
	
}
