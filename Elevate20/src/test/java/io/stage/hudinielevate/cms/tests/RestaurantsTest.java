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
import io.stage.hudinielevate.cms.pages.RestaurantsPage;

public class RestaurantsTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public RestaurantsPage restaurantsPage;

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
	public void verifyChefCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		restaurantsPage = dashboardPage.navigateToRestaurantPage();
		boolean isChefCreated = restaurantsPage.createChef();
		Assert.assertTrue(isChefCreated);
	}

	@Test(enabled = false, priority = 2)
	public void verifyChefUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		restaurantsPage = dashboardPage.navigateToRestaurantPage();
		boolean isChefUpdated = restaurantsPage.editChef();
		Assert.assertTrue(isChefUpdated);
	}

	@Test(enabled = false, priority = 3)
	public void verifyChefDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		restaurantsPage = dashboardPage.navigateToRestaurantPage();
		boolean isChefDeleted = restaurantsPage.deleteChef();
		Assert.assertTrue(isChefDeleted);
	}
	
	
	@Test(enabled = true, priority = 1)
	public void verifyRestaurantCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		restaurantsPage = dashboardPage.navigateToRestaurantPage();
		boolean isRestaurantCreated = restaurantsPage.createRestaurant();
		Assert.assertTrue(isRestaurantCreated);
	}
	
	@Test(enabled = true, priority = 2)
	public void verifyRestaurantUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		restaurantsPage = dashboardPage.navigateToRestaurantPage();
		boolean isRestaurantCreated = restaurantsPage.editRestaurant();
		Assert.assertTrue(isRestaurantCreated);
	}
	
	@Test(enabled = true, priority = 3)
	public void verifyRestaurantDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		restaurantsPage = dashboardPage.navigateToRestaurantPage();
		boolean isRestaurantDeleted = restaurantsPage.deleteRestaurant();
		Assert.assertTrue(isRestaurantDeleted);
	}
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}