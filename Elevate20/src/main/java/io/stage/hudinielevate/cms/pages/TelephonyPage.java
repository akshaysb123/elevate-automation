package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class TelephonyPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public TelephonyPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}

	// Directory:

	private By directoryTb = By.xpath("//span[text()='Directory']");

	private By addNumberBtn = By.xpath("//span[text()='Add Number']");
	private By addNameTxtBx = By.id("name_input");
	private By addCodeTxtBx = By.id("code_input");
	private By addExtensionNumberTxtBx = By.id("extension_number_input");
	private By addPasswordTxtBx = By.id("password_input");
	private By addIconDpDwnOptions = By.id("icon_select");
	private By addIconSelectedDpDwnOption = By.xpath("//ul[@aria-labelledby='icon_label']/li");
	private By addDescriptionTxtBx = By.id("description_input");
	private By isActiveChkBx = By.xpath("//input[@type='checkbox']");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By searchDirectoryTxtBx = By.xpath("//input[@type='text']");
	private By ellipsisBtn = By.xpath("(//button[@aria-controls='simple-menu']/span)[1]");
	private By deactivateDirectory = By.xpath("(//li[@role='menuitem'])[1]");
	private By editDirectory = By.xpath("(//li[@role='menuitem'])[2]");
	private By deleteDirectory = By.xpath("(//li[@role='menuitem'])[4]");
	private By updateBtn = By.xpath("//span[text()='Update']");
	private By deleteConfirmationBtn = By.xpath("//span[text()='Delete']");
	private By deleteConfirmationTxt = By.xpath("//p[text()='0-0 of 0']");

	// Extensions:

	private By extensionTb = By.xpath("//span[text()='Extensions']");
	private By addExtensionBtn = By.xpath("//span[text()='Add Extension']");
	private By roomNumberTxtBx = By.id("room_number_input");
	private By extensionNumberTxtBx = By.id("extension_number_input");
	private By passwordTxtBx = By.id("password_input");
	private By searchExtensionTxtBx = By.xpath("//input[@type='text']");
	private By editExtensionTxtBx = By.xpath("(//li[@role='menuitem'])[1]");
	private By deleteExtension = By.xpath("(//li[@role='menuitem'])[2]");

	public By getDirectoryTb() {
		return directoryTb;
	}

	public void setDirectoryTb(By directoryTb) {
		this.directoryTb = directoryTb;
	}

	public By getAddNumberBtn() {
		return addNumberBtn;
	}

	public void setAddNumberBtn(By addNumberBtn) {
		this.addNumberBtn = addNumberBtn;
	}

	public By getAddNameTxtBx() {
		return addNameTxtBx;
	}

	public void setAddNameTxtBx(By addNameTxtBx) {
		this.addNameTxtBx = addNameTxtBx;
	}

	public By getAddCodeTxtBx() {
		return addCodeTxtBx;
	}

	public void setAddCodeTxtBx(By addCodeTxtBx) {
		this.addCodeTxtBx = addCodeTxtBx;
	}

	public By getAddExtensionNumberTxtBx() {
		return addExtensionNumberTxtBx;
	}

	public void setAddExtensionNumberTxtBx(By addExtensionNumberTxtBx) {
		this.addExtensionNumberTxtBx = addExtensionNumberTxtBx;
	}

	public By getAddPasswordTxtBx() {
		return addPasswordTxtBx;
	}

	public void setAddPasswordTxtBx(By addPasswordTxtBx) {
		this.addPasswordTxtBx = addPasswordTxtBx;
	}

	public By getAddIconDpDwnOptions() {
		return addIconDpDwnOptions;
	}

	public void setAddIconDpDwnOptions(By addIconDpDwnOptions) {
		this.addIconDpDwnOptions = addIconDpDwnOptions;
	}

	public By getAddIconSelectedDpDwnOption() {
		return addIconSelectedDpDwnOption;
	}

	public void setAddIconSelectedDpDwnOption(By addIconSelectedDpDwnOption) {
		this.addIconSelectedDpDwnOption = addIconSelectedDpDwnOption;
	}

	public By getAddDescriptionTxtBx() {
		return addDescriptionTxtBx;
	}

	public void setAddDescriptionTxtBx(By addDescriptionTxtBx) {
		this.addDescriptionTxtBx = addDescriptionTxtBx;
	}

	public By getIsActiveChkBx() {
		return isActiveChkBx;
	}

	public void setIsActiveChkBx(By isActiveChkBx) {
		this.isActiveChkBx = isActiveChkBx;
	}

	public By getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(By addBtn) {
		this.addBtn = addBtn;
	}

	public By getSearchDirectoryTxtBx() {
		return searchDirectoryTxtBx;
	}

	public void setSearchDirectoryTxtBx(By searchDirectoryTxtBx) {
		this.searchDirectoryTxtBx = searchDirectoryTxtBx;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	public By getDeactivateDirectory() {
		return deactivateDirectory;
	}

	public void setDeactivateDirectory(By deactivateDirectory) {
		this.deactivateDirectory = deactivateDirectory;
	}

	public By getEditDirectory() {
		return editDirectory;
	}

	public void setEditDirectory(By editDirectory) {
		this.editDirectory = editDirectory;
	}

	public By getDeleteDirectory() {
		return deleteDirectory;
	}

	public void setDeleteDirectory(By deleteDirectory) {
		this.deleteDirectory = deleteDirectory;
	}

	public By getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}

	public By getDeleteConfirmationBtn() {
		return deleteConfirmationBtn;
	}

	public void setDeleteConfirmationBtn(By deleteConfirmationBtn) {
		this.deleteConfirmationBtn = deleteConfirmationBtn;
	}

	public By getDeleteConfirmationTxt() {
		return deleteConfirmationTxt;
	}

	public void setDeleteConfirmationTxt(By deleteConfirmationTxt) {
		this.deleteConfirmationTxt = deleteConfirmationTxt;
	}

	public By getExtensionTb() {
		return extensionTb;
	}

	public void setExtensionTb(By extensionTb) {
		this.extensionTb = extensionTb;
	}

	public By getAddExtensionBtn() {
		return addExtensionBtn;
	}

	public void setAddExtensionBtn(By addExtensionBtn) {
		this.addExtensionBtn = addExtensionBtn;
	}

	public By getRoomNumberTxtBx() {
		return roomNumberTxtBx;
	}

	public void setRoomNumberTxtBx(By roomNumberTxtBx) {
		this.roomNumberTxtBx = roomNumberTxtBx;
	}

	public By getExtensionNumberTxtBx() {
		return extensionNumberTxtBx;
	}

	public void setExtensionNumberTxtBx(By extensionNumberTxtBx) {
		this.extensionNumberTxtBx = extensionNumberTxtBx;
	}

	public By getPasswordTxtBx() {
		return passwordTxtBx;
	}

	public void setPasswordTxtBx(By passwordTxtBx) {
		this.passwordTxtBx = passwordTxtBx;
	}

	public By getSearchExtensionTxtBx() {
		return searchExtensionTxtBx;
	}

	public void setSearchExtensionTxtBx(By searchExtensionTxtBx) {
		this.searchExtensionTxtBx = searchExtensionTxtBx;
	}

	public By getEditExtensionTxtBx() {
		return editExtensionTxtBx;
	}

	public void setEditExtensionTxtBx(By editExtensionTxtBx) {
		this.editExtensionTxtBx = editExtensionTxtBx;
	}

	public By getDeleteExtension() {
		return deleteExtension;
	}

	public void setDeleteExtension(By deleteExtension) {
		this.deleteExtension = deleteExtension;
	}

	public boolean addDirectory() {

		elementActions.clickOnElement(getDirectoryTb());

		elementActions.clickOnElement(getAddNumberBtn());
		elementActions.sendKeysElement(getAddNameTxtBx(), ExcelUtil.fetchData("Directory", 1, 0));
		elementActions.sendKeysElement(getAddCodeTxtBx(), ExcelUtil.fetchData("Directory", 1, 1));
		elementActions.sendKeysElement(getAddExtensionNumberTxtBx(), ExcelUtil.fetchData("Directory", 1, 2));
		elementActions.sendKeysElement(getAddPasswordTxtBx(), ExcelUtil.fetchData("Directory", 1, 3));

		elementActions.clickOnElement(getAddIconDpDwnOptions());

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getAddIconSelectedDpDwnOption(),
					ExcelUtil.fetchData("Directory", 1, 4));
		} catch (StaleElementReferenceException se) {

			se.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getAddDescriptionTxtBx(), ExcelUtil.fetchData("Directory", 1, 5));
		elementActions.clickOnElement(getAddBtn());

		// Verify if the directory is added successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchDirectoryTxtBx(), ExcelUtil.fetchData("Directory", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isDirectoryCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isDirectoryCreated;

	}

	public boolean editDirectory() {

		elementActions.clickOnElement(getDirectoryTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchDirectoryTxtBx(), ExcelUtil.fetchData("Directory", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditDirectory());

		elementActions.clearData(getAddNameTxtBx());
		elementActions.clearData(getAddCodeTxtBx());
		elementActions.clearData(getAddExtensionNumberTxtBx());
		elementActions.clearData(getAddPasswordTxtBx());
		elementActions.clearData(getAddDescriptionTxtBx());

		elementActions.sendKeysElement(getAddNameTxtBx(), ExcelUtil.fetchData("Directory", 2, 0));
		elementActions.sendKeysElement(getAddCodeTxtBx(), ExcelUtil.fetchData("Directory", 2, 1));
		elementActions.sendKeysElement(getAddExtensionNumberTxtBx(), ExcelUtil.fetchData("Directory", 2, 2));
		elementActions.sendKeysElement(getAddPasswordTxtBx(), ExcelUtil.fetchData("Directory", 2, 3));

		elementActions.clickOnElement(getAddIconDpDwnOptions());

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getAddIconSelectedDpDwnOption(),
					ExcelUtil.fetchData("Directory", 2, 4));
		} catch (StaleElementReferenceException se) {

			se.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getAddDescriptionTxtBx(), ExcelUtil.fetchData("Directory", 2, 5));
		elementActions.clickOnElement(getUpdateBtn());

		// Verify if the directory is updated successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchDirectoryTxtBx(), ExcelUtil.fetchData("Directory", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isDirectoryUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isDirectoryUpdated;
	}

	public boolean deleteDirectory() {

		elementActions.clickOnElement(getDirectoryTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchDirectoryTxtBx(), ExcelUtil.fetchData("Directory", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteDirectory());

		elementActions.clickOnElement(getDeleteConfirmationBtn());

		// Verify if the directory is deleted successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchDirectoryTxtBx(), ExcelUtil.fetchData("Directory", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isDirectoryDeleted = elementActions.checkIfElementIsPresent(getDeleteConfirmationTxt());
		return isDirectoryDeleted;

	}

	public boolean addExtension() {
		elementActions.clickOnElement(getExtensionTb());

		elementActions.clickOnElement(getAddExtensionBtn());

		elementActions.sendKeysElement(getRoomNumberTxtBx(), ExcelUtil.fetchData("Extension", 1, 0));
		elementActions.sendKeysElement(getExtensionNumberTxtBx(), ExcelUtil.fetchData("Extension", 1, 1));
		elementActions.sendKeysElement(getPasswordTxtBx(), ExcelUtil.fetchData("Extension", 1, 2));

		elementActions.clickOnElement(getAddBtn());

		// Verify if the extension is added successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchExtensionTxtBx(), ExcelUtil.fetchData("Extension", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isExtensionCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isExtensionCreated;

	}

	public boolean editExtension() {
		elementActions.clickOnElement(getExtensionTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchExtensionTxtBx(), ExcelUtil.fetchData("Extension", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditExtensionTxtBx());

		elementActions.clearData(getRoomNumberTxtBx());
		elementActions.clearData(getExtensionNumberTxtBx());
		elementActions.clearData(getPasswordTxtBx());

		elementActions.sendKeysElement(getRoomNumberTxtBx(), ExcelUtil.fetchData("Extension", 2, 0));
		elementActions.sendKeysElement(getExtensionNumberTxtBx(), ExcelUtil.fetchData("Extension", 2, 1));
		elementActions.sendKeysElement(getPasswordTxtBx(), ExcelUtil.fetchData("Extension", 2, 2));

		elementActions.clickOnElement(getUpdateBtn());

		// To verify if the extension is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getSearchExtensionTxtBx(), ExcelUtil.fetchData("Extension", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isExtensionUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isExtensionUpdated;

	}

	public boolean deleteExtension() {

		elementActions.clickOnElement(getExtensionTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchExtensionTxtBx(), ExcelUtil.fetchData("Extension", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteExtension());

		elementActions.clickOnElement(getDeleteConfirmationBtn());

		// Verify if the extension is deleted successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getSearchExtensionTxtBx(), ExcelUtil.fetchData("Extension", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isExtensionDeleted = elementActions.checkIfElementIsPresent(getDeleteConfirmationTxt());
		return isExtensionDeleted;

	}

}
