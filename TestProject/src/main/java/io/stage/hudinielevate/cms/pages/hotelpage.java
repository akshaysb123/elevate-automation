package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class hotelpage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public hotelpage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}
	private By propartymenutab=By.xpath("//div[@title='Properties']");
	private By hotelInfoTab = By.xpath("//span[contains(.,'Hotels')]");
	private By addhotelbtn=By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge' and @type='button']");
    private By hotelgroupselectdropdown=By.id("hotel_group_select");
    private By selecthotelgroup = By.xpath("//li[contains(.,'Automation')]");
	private By brandselectdropdown=By.id("brand_select");
	private By selecthotelbrandgroup = By.xpath("//li[contains(.,'Automation')]");
	private By hotelnametxtfield=By.id("hotel_name_input");
	private By hotelcodetxtfield=By.id("hotel_code_input");
	private By descriptiontxtfield=By.id("description_input");
	private By currencyselectdropdown=By.id("currency_select");
	private By selectcurrencyselectdropdown = By.xpath("//li[contains(.,'Euro')]");
	private By mobilenumberfield=By.xpath("//input[@type='tel']");
	private By traveltypeselectdropdown=By.id("travel_type_select");
	private By selecttraveltypeselectdropdown = By.xpath("//li[contains(.,'Getaway')]");
	private By interestsdropdown=By.xpath("(//div[@class='MuiFormControl-root custom-multi-select w-100'])[2]");
	private By selectinterestsdropdown = By.xpath("//li[contains(.,'Food')]");
	private By nextbtn=By.xpath("//span[contains(.,'Next')]");
	private By searchgooglemapdropdown=By.xpath("(//input [@type='text'] )[2]");
	private By searchgooglemapdropdowncontains=By.xpath("(//input[contains(.,'Bangalore')])[1]");
	private By addresslinetxtfield=By.xpath("//input[@id='address_line_1_input' and @class='MuiInputBase-input MuiInput-input']");
	private By nextbtn1=By.xpath("//span[contains(.,'Next')]");
	private By addbtn=By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained me-3 MuiButton-containedPrimary MuiButton-containedSizeLarge MuiButton-sizeLarge' and @type='button']");
	private By ellipsisBtn = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
	
	public By ellipsisBtn() {
		return ellipsisBtn;
	}
	public By addbtn() {
		return addbtn;
	}
	public By searchgooglemapdropdowncontains() {
		return searchgooglemapdropdowncontains;
	}
	public By selectinterestsdropdown() {
		return selectinterestsdropdown;
	}
	public By selecttraveltypeselectdropdown() {
		return selecttraveltypeselectdropdown;
	}
	public By selectcurrencyselectdropdown() {
		return selectcurrencyselectdropdown;
	}
	public By propartymenutab() {
		return propartymenutab;
	}
	public By hotelInfoTab() {
		return hotelInfoTab;
	}
	public By addhotelbtn() {
		return addhotelbtn;
	}
	public By hotelgroupselectdropdown() {
		return hotelgroupselectdropdown;
	}
	public By brandselectdropdown() {
		return brandselectdropdown;
	}
	public By hotelnametxtfield() {
		return hotelnametxtfield;
	}
	public By hotelcodetxtfield() {
		return hotelcodetxtfield;
	}
	public By descriptiontxtfield() {
		return descriptiontxtfield;
	}
	public By currencyselectdropdown() {
		return currencyselectdropdown;
	}
	public By mobilenumberfield() {
		return mobilenumberfield;
	}
	public By traveltypeselectdropdown() {
		return traveltypeselectdropdown;
	}
	public By interestsdropdown() {
		return interestsdropdown;
	}
	public By nextbtn() {
		return nextbtn;
	}
	public By searchgooglemapdropdown() {
		return searchgooglemapdropdown;
	}
	public By addresslinetxtfield() {
		return addresslinetxtfield;
	}
	public By nextbtn1() {
		return nextbtn1;
	}
	public By selecthotelgroup() {
		return selecthotelgroup;
	}
	public By selecthotelbrandgroup() {
		return selecthotelbrandgroup;
	}
	public void NavigateTohotelpage() {
		elementActions.clickOnElement(propartymenutab);
		elementActions.clickOnElement(hotelInfoTab);}
	
	
	//create new hotel
	public boolean createNewHotel()
	{
		
		elementActions.clickOnElement(addhotelbtn());
		elementActions.clickOnElement(hotelgroupselectdropdown());
		elementActions.clickOnElement(selecthotelgroup());
		elementActions.clickOnElement(brandselectdropdown());
		elementActions.clickOnElement(selecthotelbrandgroup());
		elementActions.sendKeysElement(hotelnametxtfield(), ExcelUtil.fetchData("Createhotel",1, 0));
		elementActions.sendKeysElement(hotelcodetxtfield(), ExcelUtil.fetchData("Createhotel",1, 1));
		elementActions.sendKeysElement(descriptiontxtfield(), ExcelUtil.fetchData("Createhotel",1, 2));
		elementActions.clickOnElement(currencyselectdropdown());
		elementActions.clickOnElement(selectcurrencyselectdropdown());
		elementActions.sendKeysElement(mobilenumberfield(), ExcelUtil.fetchData("Createhotel", 1, 3));
		elementActions.clickOnElement(traveltypeselectdropdown());
		elementActions.clickOnElement(selecttraveltypeselectdropdown());
        try {
			elementActions.closePopup();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(interestsdropdown());
		elementActions.clickOnElement(selectinterestsdropdown());
		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(nextbtn());
		
		
		elementActions.clickOnElement(searchgooglemapdropdown());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(searchgooglemapdropdown(), ExcelUtil.fetchData("Createhotel",1,4));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(searchgooglemapdropdowncontains());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(searchgooglemapdropdowncontains());
		elementActions.sendKeysElement(addresslinetxtfield(), ExcelUtil.fetchData("Createhotel", 1, 5));
		for(int i=1;i<=5;i++) {
		elementActions.clickOnElement(nextbtn());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		elementActions.clickOnElement(addbtn());
		
		
		boolean isHotelcreated = elementActions.checkIfElementIsPresent(ellipsisBtn());
		return isHotelcreated;
		}

	

}
