package io.stage.hudinielevate.cms.pages;

import java.util.Properties;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class HotelCompendiumPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public HotelCompendiumPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}

	// Hotel Category(Add, Edit and Delete):

	private By categoryTab = By.xpath("//span[text()='Category']");
	private By addCategoryBtn = By.xpath("//span[text()='Add Category']");
	private By categoryNameTxtBx = By.id("name_input");
	private By categoryAddBtn = By.xpath("//span[text()='Add']");
	private By categoryUpdateBtn = By.xpath("//span[text()='Update']");
	private By ellipsisBtn = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
	private By editBtn = By.xpath("(//li[@role='menuitem'])[1]");
	private By deleteBtn = By.xpath("(//li[@role='menuitem'])[3]");
	private By confirmDeleteBtn = By.xpath("//span[text()='Delete']");

	private By searchHotelCategoryTxtBx = By.xpath("//input[@type='text']");
	private By categoryDeletionChkTxt = By.xpath("//p[text()='0-0 of 0']");

	// Hotel Compendium:(Add, Edit, Deactivate, Delete):

	private By hotelCompendiumTb = By.xpath("(//span[text()='Hotel Compendium'])[3]");
	private By addHotelCompendiumBtn = By.xpath("//span[text()='Add Hotel Compendium']");
	private By hotelCategoryDropDwnOptions = By.id("category_select");
	private By hotelCategorySelectedOption = By
			.xpath("//ul[@aria-labelledby='category_label']//input[@type='checkbox']");
	private By hotelCompendiumNameTxtBx = By.id("name_input");
	private By hotelCompendiumDescriptionTxtBx = By.id("description_input");
	private By nextBtn1 = By.xpath("//span[text()='Next']");
	private By editHotelCompendiumBtn = By.xpath("(//li[@role='menuitem'])[2]");

	private By nextBtn2 = By.xpath("//span[text()='Next']");

	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By updateBtn = By.xpath("//span[text()='Update']");

	private By ellipsisBtn2 = By.xpath("//tbody[@class='MuiTableBody-root']//span[@class='MuiButton-label']");
	private By editBtn2 = By.xpath("(//li[@role='menuitem'])[2]");
	private By deleteBtn2 = By.xpath("(//li[@role='menuitem'])[4]");
	private By deactivateBtn = By.xpath("(//li[@role='menuitem'])[1]");

	private By searchHotelCompendiumTxtBx = By.xpath("//input[@type='text']");
	private By compendiumDeletionChkTxt = By.xpath("//p[text()='0-0 of 0']");

	public By getCompendiumDeletionChkTxt() {
		return compendiumDeletionChkTxt;
	}

	public void setCompendiumDeletionChkTxt(By compendiumDeletionChkTxt) {
		this.compendiumDeletionChkTxt = compendiumDeletionChkTxt;
	}

	public By getEditHotelCompendiumBtn() {
		return editHotelCompendiumBtn;
	}

	public void setEditHotelCompendiumBtn(By editHotelCompendiumBtn) {
		this.editHotelCompendiumBtn = editHotelCompendiumBtn;
	}

	public By getHotelCompendiumTb() {
		return hotelCompendiumTb;
	}

	public void setHotelCompendiumTb(By hotelCompendiumTb) {
		this.hotelCompendiumTb = hotelCompendiumTb;
	}

	public By getCategoryDeletionChkTxt() {
		return categoryDeletionChkTxt;
	}

	public void setCategoryDeletionChkTxt(By categoryDeletionChkTxt) {
		this.categoryDeletionChkTxt = categoryDeletionChkTxt;
	}

	public By getConfirmDeleteBtn() {
		return confirmDeleteBtn;
	}

	public void setConfirmDeleteBtn(By confirmDeleteBtn) {
		this.confirmDeleteBtn = confirmDeleteBtn;
	}

	public By getCategoryTab() {
		return categoryTab;
	}

	public void setCategoryTab(By categoryTab) {
		this.categoryTab = categoryTab;
	}

	public By getAddCategoryBtn() {
		return addCategoryBtn;
	}

	public void setAddCategoryBtn(By addCategoryBtn) {
		this.addCategoryBtn = addCategoryBtn;
	}

	public By getCategoryNameTxtBx() {
		return categoryNameTxtBx;
	}

	public void setCategoryNameTxtBx(By categoryNameTxtBx) {
		this.categoryNameTxtBx = categoryNameTxtBx;
	}

	public By getCategoryAddBtn() {
		return categoryAddBtn;
	}

	public void setCategoryAddBtn(By categoryAddBtn) {
		this.categoryAddBtn = categoryAddBtn;
	}

	public By getCategoryUpdateBtn() {
		return categoryUpdateBtn;
	}

	public void setCategoryUpdateBtn(By categoryUpdateBtn) {
		this.categoryUpdateBtn = categoryUpdateBtn;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	public By getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(By editBtn) {
		this.editBtn = editBtn;
	}

	public By getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(By deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public By getSearchHotelCategoryTxtBx() {
		return searchHotelCategoryTxtBx;
	}

	public void setSearchHotelCategoryTxtBx(By searchHotelCategoryTxtBx) {
		this.searchHotelCategoryTxtBx = searchHotelCategoryTxtBx;
	}

	public By getAddHotelCompendiumBtn() {
		return addHotelCompendiumBtn;
	}

	public void setAddHotelCompendiumBtn(By addHotelCompendiumBtn) {
		this.addHotelCompendiumBtn = addHotelCompendiumBtn;
	}

	public By getHotelCategoryDropDwnOptions() {
		return hotelCategoryDropDwnOptions;
	}

	public void setHotelCategoryDropDwnOptions(By hotelCategoryDropDwnOptions) {
		this.hotelCategoryDropDwnOptions = hotelCategoryDropDwnOptions;
	}

	public By getHotelCategorySelectedOption() {
		return hotelCategorySelectedOption;
	}

	public void setHotelCategorySelectedOption(By hotelCategorySelectedOption) {
		this.hotelCategorySelectedOption = hotelCategorySelectedOption;
	}

	public By getHotelCompendiumNameTxtBx() {
		return hotelCompendiumNameTxtBx;
	}

	public void setHotelCompendiumNameTxtBx(By hotelCompendiumNameTxtBx) {
		this.hotelCompendiumNameTxtBx = hotelCompendiumNameTxtBx;
	}

	public By getHotelCompendiumDescriptionTxtBx() {
		return hotelCompendiumDescriptionTxtBx;
	}

	public void setHotelCompendiumDescriptionTxtBx(By hotelCompendiumDescriptionTxtBx) {
		this.hotelCompendiumDescriptionTxtBx = hotelCompendiumDescriptionTxtBx;
	}

	public By getNextBtn1() {
		return nextBtn1;
	}

	public void setNextBtn1(By nextBtn1) {
		this.nextBtn1 = nextBtn1;
	}

	public By getNextBtn2() {
		return nextBtn2;
	}

	public void setNextBtn2(By nextBtn2) {
		this.nextBtn2 = nextBtn2;
	}

	public By getBrowseBtn() {
		return browseBtn;
	}

	public void setBrowseBtn(By browseBtn) {
		this.browseBtn = browseBtn;
	}

	public By getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}

	public By getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}

	public By getEllipsisBtn2() {
		return ellipsisBtn2;
	}

	public void setEllipsisBtn2(By ellipsisBtn2) {
		this.ellipsisBtn2 = ellipsisBtn2;
	}

	public By getEditBtn2() {
		return editBtn2;
	}

	public void setEditBtn2(By editBtn2) {
		this.editBtn2 = editBtn2;
	}

	public By getDeleteBtn2() {
		return deleteBtn2;
	}

	public void setDeleteBtn2(By deleteBtn2) {
		this.deleteBtn2 = deleteBtn2;
	}

	public By getDeactivateBtn() {
		return deactivateBtn;
	}

	public void setDeactivateBtn(By deactivateBtn) {
		this.deactivateBtn = deactivateBtn;
	}

	public By getSearchHotelCompendiumTxtBx() {
		return searchHotelCompendiumTxtBx;
	}

	public void setSearchHotelCompendiumTxtBx(By searchHotelCompendiumTxtBx) {
		this.searchHotelCompendiumTxtBx = searchHotelCompendiumTxtBx;
	}

	public boolean createCategory() {
		elementActions.clickOnElement(getCategoryTab());
		elementActions.clickOnElement(getAddCategoryBtn());
		elementActions.sendKeysElement(getCategoryNameTxtBx(), ExcelUtil.fetchData("Hotel_Category", 1, 0));
		elementActions.clickOnElement(getNextBtn1());

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getAddBtn());

		// Code to verify if the category is added successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelCategoryTxtBx(), ExcelUtil.fetchData("Hotel_Category", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isCategoryCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isCategoryCreated;

	}

	public boolean editCategory() {
		elementActions.clickOnElement(getCategoryTab());

		elementActions.sendKeysElement(getSearchHotelCategoryTxtBx(), ExcelUtil.fetchData("Hotel_Category", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn2());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEditBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clearData(getCategoryNameTxtBx());

		elementActions.sendKeysElement(getCategoryNameTxtBx(), ExcelUtil.fetchData("Hotel_Category", 2, 0));
		elementActions.clickOnElement(nextBtn1);

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getUpdateBtn());

		// Code to verify if the category is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelCategoryTxtBx(), ExcelUtil.fetchData("Hotel_Category", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isCategoryUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isCategoryUpdated;
	}

	public boolean deleteCategory() {

		elementActions.sendKeysElement(getSearchHotelCategoryTxtBx(), ExcelUtil.fetchData("Hotel_Category", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn2());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getDeleteBtn());

		elementActions.clickOnElement(getConfirmDeleteBtn());

		// Code to verify if the category is deleted successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelCategoryTxtBx(), ExcelUtil.fetchData("Hotel_Category", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isCategoryDeleted = elementActions.checkIfElementIsPresent(getCategoryDeletionChkTxt());
		return isCategoryDeleted;

	}

	public boolean createHotelCompendium() {
		elementActions.clickOnElement(getHotelCompendiumTb());

		elementActions.clickOnElement(getAddHotelCompendiumBtn());
		elementActions.clickOnElement(getHotelCategoryDropDwnOptions());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {

			elementActions.selectAllCheckBoxes(getHotelCategorySelectedOption());
		} catch (StaleElementReferenceException se1) {
			se1.printStackTrace();
		}

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			elementActions.closePopup();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getHotelCompendiumNameTxtBx(), ExcelUtil.fetchData("Hotel_Compendium", 1, 0));
		elementActions.sendKeysElement(getHotelCompendiumDescriptionTxtBx(),
				ExcelUtil.fetchData("Hotel_Compendium", 1, 1));

		elementActions.clickOnElement(getNextBtn1());
		elementActions.clickOnElement(getNextBtn2());

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getAddBtn());

		// Code to verify if the hotel compendium is created successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelCompendiumTxtBx(), ExcelUtil.fetchData("Hotel_Compendium", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHotelCompendiumCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isHotelCompendiumCreated;

	}

	public boolean editHotelCompendium() {

		elementActions.clickOnElement(getHotelCompendiumTb());

		elementActions.sendKeysElement(getSearchHotelCompendiumTxtBx(), ExcelUtil.fetchData("Hotel_Compendium", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn2());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		elementActions.clickOnElement(getEditHotelCompendiumBtn());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clearData(getHotelCompendiumNameTxtBx());
		elementActions.clearData(getHotelCompendiumDescriptionTxtBx());

		elementActions.sendKeysElement(getHotelCompendiumNameTxtBx(), ExcelUtil.fetchData("Hotel_Compendium", 2, 0));
		elementActions.sendKeysElement(getHotelCompendiumDescriptionTxtBx(),
				ExcelUtil.fetchData("Hotel_Compendium", 2, 1));

		elementActions.clickOnElement(getNextBtn1());
		elementActions.clickOnElement(getNextBtn2());

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getUpdateBtn());

		// Code to verify if the hotel compendium is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelCompendiumTxtBx(), ExcelUtil.fetchData("Hotel_Compendium", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHotelCompendiumUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isHotelCompendiumUpdated;

	}

	public boolean deleteHotelCompendium() {

		elementActions.clickOnElement(getHotelCompendiumTb());

		elementActions.sendKeysElement(getSearchHotelCompendiumTxtBx(), ExcelUtil.fetchData("Hotel_Compendium", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn2());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getDeleteBtn2());

		elementActions.clickOnElement(getConfirmDeleteBtn());

		// Code to verify if the compendium is deleted successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchHotelCompendiumTxtBx(), ExcelUtil.fetchData("Hotel_Category", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isCompendiumDeleted = elementActions.checkIfElementIsPresent(getCompendiumDeletionChkTxt());
		return isCompendiumDeleted;

	}
}
