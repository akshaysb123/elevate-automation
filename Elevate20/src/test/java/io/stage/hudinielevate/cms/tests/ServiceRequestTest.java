package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.DashboardPage;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.RestaurantsPage;
import io.stage.hudinielevate.cms.pages.ServiceRequestsPage;

public class ServiceRequestTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public RestaurantsPage restaurantsPage;
	public ServiceRequestsPage serviceRequestsPage;

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

	@Test(enabled = true, priority = 1)
	public void verifyServiceRequestCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		serviceRequestsPage = dashboardPage.navigateToServiceRequestsPage();
		boolean isHousekeepingCreated = serviceRequestsPage.createHousekeeping();
		Assert.assertTrue(isHousekeepingCreated);
	}

	@Test(enabled = true, priority = 2)
	public void verifyServiceRequestUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		serviceRequestsPage = dashboardPage.navigateToServiceRequestsPage();
		boolean isHousekeepingUpdated = serviceRequestsPage.editHouskeeping();
		Assert.assertTrue(isHousekeepingUpdated);
	}

	@Test(enabled = true, priority = 3)
	public void verifyServiceRequestDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		serviceRequestsPage = dashboardPage.navigateToServiceRequestsPage();
		boolean isHousekeepingDeleted = serviceRequestsPage.deleteHousekeepingService();
		Assert.assertTrue(isHousekeepingDeleted);

	}

	@Test(enabled = true, priority = 4)
	public void verifyConciergeCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		serviceRequestsPage = dashboardPage.navigateToServiceRequestsPage();
		boolean isConciergeCreated = serviceRequestsPage.createConcierge();
		Assert.assertTrue(isConciergeCreated);
	}

	@Test(enabled = true, priority = 5)
	public void verifyConciergeUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		serviceRequestsPage = dashboardPage.navigateToServiceRequestsPage();
		boolean isConciergeUpdated = serviceRequestsPage.editConcierge();
		Assert.assertTrue(isConciergeUpdated);
	}

	@Test(enabled = true, priority = 6)
	public void verifyConciergeDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		serviceRequestsPage = dashboardPage.navigateToServiceRequestsPage();
		boolean isConciergeDeleted = serviceRequestsPage.deleteConcierge();
		Assert.assertTrue(isConciergeDeleted);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
