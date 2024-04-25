package io.stage.hudinielevate.cms.pages;
	import java.awt.AWTException;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.StaleElementReferenceException;

	import io.stage.hudinielevate.cms.base.BaseClass;
	import io.stage.hudinielevate.cms.util.ElementActions;
	import io.stage.hudinielevate.cms.util.ExcelUtil;

	public class brandpage extends BaseClass {

		public static WebDriver driver;
		public static Properties properties;
		ElementActions elementActions;

		public brandpage(WebDriver driver) {
			this.driver = driver;
			elementActions = new ElementActions(driver);

		}

		private By brandInfoTab = By.xpath("//span[contains(.,'Brands')]");
		private By addbrandBtn = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']");
		private By selecthotelgroupdropdown = By.id("select_hotel_group_select");
		private By selectgroup = By.xpath("//li[contains(.,'Automation')]");
		private By brandnametextfield = By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd' and @id=\"brand_name_input\"]");
		private By brandcodetextfield = By.id("brand_code_input");
		private By branddescriptiontextfield = By.id("description_input");
		private By nextbutton = By.xpath("//span[contains(.,'Next')]");
		private By savebutton = By.xpath("/html/body/div[8]/div[3]/form/div/div[3]/div/button[1]/span[1]");
		
		public By brandInfoTab() {
			return brandInfoTab;
		}
		public By addbrandBtn() {
			return addbrandBtn;
		}
		public By selecthotelgroupdropdown() {
			return selecthotelgroupdropdown;
		}
		public By selectgroup() {
			return selectgroup;
		}
		public By brandnametextfield() {
			return brandnametextfield;
		}
		public By brandcodetextfield() {
			return brandcodetextfield;
		}
		public By branddescriptiontextfield() {
			return branddescriptiontextfield;
		}
		public By nextbutton() {
			return nextbutton;
		}
		public By savebutton() {
			return savebutton;
		}
		
		//create brand
		public void createbrand() 
		{
			
			elementActions.clickOnElement(brandInfoTab());
			elementActions.clickOnElement(addbrandBtn());
			elementActions.clickOnElement(selecthotelgroupdropdown());
			elementActions.clickOnElement(selectgroup());
			elementActions.sendKeysElement(brandnametextfield(), ExcelUtil.fetchData("Group", 1, 0));
			elementActions.sendKeysElement(brandcodetextfield(), ExcelUtil.fetchData("Group", 1, 1));
			elementActions.sendKeysElement(branddescriptiontextfield(), ExcelUtil.fetchData("Group", 1, 2));
			elementActions.clickOnElement(nextbutton());
			elementActions.clickOnElement(savebutton());

		}
	

}
