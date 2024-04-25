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
import io.stage.hudinielevate.cms.pages.brandpage;

public class brand {

	public BaseClass baseClass;
	public Properties properties;
	public WebDriver driver;
	public LoginPage loginPage;
	public DashboardPage dashboardPage;
	public brandpage Brandpage;

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
	public void verifybrandCreationTest() {
		loginPage.loginAsUser();
		dashboardPage = loginPage.navigateToDashboardPage();

		/*Brandpage = dashboardPage.navigateToBrandpage();
		boolean isBrandreated = Brandpage.createbrand();
		Assert.assertTrue(isBrandcreated);*/
	}
}