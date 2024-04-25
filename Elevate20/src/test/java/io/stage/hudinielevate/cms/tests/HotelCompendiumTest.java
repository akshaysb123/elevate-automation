package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.DashboardPage;
import io.stage.hudinielevate.cms.pages.HotelCompendiumPage;
import io.stage.hudinielevate.cms.pages.RestaurantsPage;

public class HotelCompendiumTest {
	
	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public RestaurantsPage restaurantsPage;
	public HotelCompendiumPage hotelCompendiumPage;
	
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
		System.out.println(properties.getProperty("username"));
		System.out.println(properties.getProperty("password"));
		System.out.println(properties.getProperty("superadminusername"));
		System.out.println(properties.getProperty("superadminpassword"));
		loginPage = new LoginPage(driver, properties);

	}

	@Test(enabled = false, priority = 1)
	public void createCategoryTest()
	{
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();
		hotelCompendiumPage = dashboardPage.navigateToHotelCompendiumPage();
		hotelCompendiumPage.createCategory();
	}
	
	@Test(enabled = false, priority = 2)
	public void editCategoryTest()
	{
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();
		hotelCompendiumPage = dashboardPage.navigateToHotelCompendiumPage();
		hotelCompendiumPage.editCategory();
	}
	
	@Test(enabled = false, priority = 3)
	public void deleteCategoryTest()
	{
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();
		hotelCompendiumPage = dashboardPage.navigateToHotelCompendiumPage();
		boolean isCategoryDeleted = hotelCompendiumPage.deleteCategory();
		Assert.assertTrue(isCategoryDeleted);
	}
	
	@Test(enabled = true, priority = 1)
	public void createHotelCompendiumTest()
	{
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();
		hotelCompendiumPage = dashboardPage.navigateToHotelCompendiumPage();
		boolean isCompendiumCreated = hotelCompendiumPage.createHotelCompendium();
		Assert.assertTrue(isCompendiumCreated);
	
	}
	@Test(enabled = false)
	public void activateHotelCompendiumTest()
	{
		
	}
	
	@Test(enabled = true, priority = 2)
	public void editHotelCompendiumTest()
	{
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();
		hotelCompendiumPage = dashboardPage.navigateToHotelCompendiumPage();
		boolean isCompendiumUpdated = hotelCompendiumPage.editHotelCompendium();
		Assert.assertTrue(isCompendiumUpdated);
	}
	
	@Test(enabled = true, priority = 3)
	public void deleteHotelCompendiumTest()
	{
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();
		hotelCompendiumPage = dashboardPage.navigateToHotelCompendiumPage();
		boolean isCompendiumDeleted = hotelCompendiumPage.deleteHotelCompendium();
		Assert.assertTrue(isCompendiumDeleted);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	
	
	

}
