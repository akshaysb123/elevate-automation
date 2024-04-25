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
		private By propartymenutab=By.xpath("//div[@title='Properties']");
        
		private By brandInfoTab = By.xpath("//span[contains(.,'Brands')]");
		private By addbrandBtn = By.xpath("//span[@class='MuiButton-startIcon MuiButton-iconSizeLarge']");
		private By selecthotelgroupdropdown = By.id("select_hotel_group_select");
		private By selectgroup = By.xpath("//li[contains(.,'Automation')]");
		private By brandnametextfield = By.xpath("//input[@class='MuiInputBase-input MuiInput-input MuiInputBase-inputAdornedEnd' and @id=\"brand_name_input\"]");
		private By brandcodetextfield = By.id("brand_code_input");
		private By branddescriptiontextfield = By.id("description_input");
		private By nextbutton = By.xpath("//span[contains(.,'Next')]");
		private By savebutton = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained me-3 MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge']");
		private By ellipsisBtn = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
		private By searchbutton1=By.xpath("//input[@type='text']") ;
		private By brandeditbtn=By.xpath("(//li[@role='menuitem'])[1]");
		private By deleteBtn = By.xpath("(//li[@role='menuitem'])[3]");
		private By confirmDeleteBtn = By.xpath("//span[text()='Delete']");
		private By brandDeletionChkTxt = By.xpath("//p[text()='0-0 of 0']");
		
		
		public By brandeditbtn() {
			return brandeditbtn;
		}
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
		public By getEllipsisBtn() {
			return ellipsisBtn;
		}
		public By searchbutton1() {
			return searchbutton1;
		}
		public By deleteBtn() {
			return deleteBtn;
		}
		public By confirmDeleteBtn() {
			return confirmDeleteBtn;
		}
		public By brandDeletionChkTxt() {
			return brandDeletionChkTxt;
		}
		
			
			
		//create brand
		public boolean createNewBrand()
		{
			
			elementActions.clickOnElement(brandInfoTab());
			elementActions.clickOnElement(addbrandBtn());
			elementActions.clickOnElement(selecthotelgroupdropdown());
			elementActions.clickOnElement(selectgroup());
			elementActions.sendKeysElement(brandnametextfield(), ExcelUtil.fetchData("Brand", 1, 0));
			elementActions.sendKeysElement(brandcodetextfield(), ExcelUtil.fetchData("Brand", 1, 1));
			elementActions.sendKeysElement(branddescriptiontextfield(), ExcelUtil.fetchData("Brand", 1, 2));
			elementActions.clickOnElement(nextbutton());
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			elementActions.clickOnElement(savebutton());
			boolean isBrandcreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
			return isBrandcreated;
			
			
		}
		// create multiple brand 
		public void multiplecreateNewBrand()
		{
			for(int i=1;i<=3;i++) {
				
			
			elementActions.clickOnElement(brandInfoTab());
			elementActions.clickOnElement(addbrandBtn());
			elementActions.clickOnElement(selecthotelgroupdropdown());
			elementActions.clickOnElement(selectgroup());
			elementActions.sendKeysElement(brandnametextfield(), ExcelUtil.fetchData("Brand",i+2,0));
			elementActions.sendKeysElement(brandcodetextfield(), ExcelUtil.fetchData("Brand",i+ 2, 1));
			elementActions.sendKeysElement(branddescriptiontextfield(), ExcelUtil.fetchData("Brand", i+2,2));
			elementActions.clickOnElement(nextbutton());
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			elementActions.clickOnElement(savebutton());
			System.out.println(selectgroup);
			}
		}
		public void NavigateTobrandpage() {
			elementActions.clickOnElement(propartymenutab);
			elementActions.clickOnElement(brandInfoTab);
			
		}
		
		
		
		//delete brand 
		
		public boolean branddelete() {
			
             // elementActions.clickOnElement(searchbutton1());
				elementActions.sendKeysElement(searchbutton1(), ExcelUtil.fetchData("Brand", 1, 0));
				elementActions.clickOnElement(getEllipsisBtn());
				elementActions.clickOnElement(deleteBtn());

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				elementActions.clickOnElement(confirmDeleteBtn());

				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				elementActions.sendKeysElement(searchbutton1(), ExcelUtil.fetchData("Brand1", 1, 0));

				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				boolean branddelete = elementActions.checkIfElementIsPresent(brandDeletionChkTxt());
			    return branddelete;

			}
		//update brand
		
		public boolean UpdateBrand()
		{
			elementActions.sendKeysElement(searchbutton1(), ExcelUtil.fetchData("Brand", 1, 0));
			elementActions.clickOnElement(getEllipsisBtn());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			elementActions.clickOnElement(brandeditbtn());
			
			elementActions.sendKeysElement(brandnametextfield(), ExcelUtil.fetchData("Brand", 1, 0));
			elementActions.sendKeysElement(brandcodetextfield(), ExcelUtil.fetchData("Brand", 1, 1));
			elementActions.sendKeysElement(branddescriptiontextfield(), ExcelUtil.fetchData("Brand", 1, 2));
			elementActions.clickOnElement(nextbutton());
			/*try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			elementActions.clickOnElement(savebutton());
			boolean UpdateBrand = elementActions.checkIfElementIsPresent(brandnametextfield());
			return UpdateBrand;
		}		
	}
	


