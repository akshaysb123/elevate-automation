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
import io.stage.hudinielevate.cms.pages.NotificationsPage;
import io.stage.hudinielevate.cms.pages.RestaurantsPage;
import io.stage.hudinielevate.cms.pages.ServiceRequestsPage;

public class NotificationsTest {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public RestaurantsPage restaurantsPage;
	public ServiceRequestsPage serviceRequestsPage;
	public NotificationsPage notificationsPage;

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
	public void verifyNotificationCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		notificationsPage = dashboardPage.navigateToNotificationsPage();
		boolean isNotificationCreated = notificationsPage.createNotification();
		Assert.assertTrue(isNotificationCreated);
	}

	@Test(enabled = true, priority = 2)
	public void verifyNotificationUpdationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		notificationsPage = dashboardPage.navigateToNotificationsPage();
		boolean isNotificationUpdated = notificationsPage.editNotification();
		Assert.assertTrue(isNotificationUpdated);
	}

	@Test(enabled = true, priority = 3)
	public void verifyNotificationDeletionTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		notificationsPage = dashboardPage.navigateToNotificationsPage();
		boolean isNotificationDeleted = notificationsPage.deleteNotification();
		Assert.assertTrue(isNotificationDeleted);
	}

}
