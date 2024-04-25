package io.stage.hudinielevate.cms.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.pages.DashboardPage;
import io.stage.hudinielevate.cms.pages.LoginPage;
import io.stage.hudinielevate.cms.pages.RestaurantsPage;
import io.stage.hudinielevate.cms.pages.ServiceRequestsPage;
import io.stage.hudinielevate.cms.pages.TelephonyPage;

public class TelephonyPageTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public RestaurantsPage restaurantsPage;
	public ServiceRequestsPage serviceRequestsPage;
	public TelephonyPage telephonyPage;

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
	public void verifyDirectoryCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		telephonyPage = dashboardPage.navigateToTelephonyPage();
		boolean isDirectoryCreated = telephonyPage.addDirectory();
		Assert.assertTrue(isDirectoryCreated);

	}

	@Test(enabled = true, priority = 2)
	public void verifyDirectoryUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		telephonyPage = dashboardPage.navigateToTelephonyPage();
		boolean isDirectoryUpdated = telephonyPage.editDirectory();
		Assert.assertTrue(isDirectoryUpdated);
	}

	@Test(enabled = true, priority = 3)
	public void verifyDirectoryDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		telephonyPage = dashboardPage.navigateToTelephonyPage();
		boolean isDirectoryDeleted = telephonyPage.deleteDirectory();
		Assert.assertTrue(isDirectoryDeleted);

	}

	@Test(enabled = false, priority = 1)
	public void verifyExtensionCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		telephonyPage = dashboardPage.navigateToTelephonyPage();
		boolean isExtensionCreated = telephonyPage.addExtension();
		Assert.assertTrue(isExtensionCreated);
	}

	@Test(enabled = false, priority = 2)
	public void verifyExtensionUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		telephonyPage = dashboardPage.navigateToTelephonyPage();
		boolean isExtensionUpdated = telephonyPage.editExtension();
		Assert.assertTrue(isExtensionUpdated);
	}

	@Test(enabled = false, priority = 3)
	public void verifyExtensionDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		telephonyPage = dashboardPage.navigateToTelephonyPage();
		boolean isExtensionDeleted = telephonyPage.deleteExtension();
		Assert.assertTrue(isExtensionDeleted);

	}

}