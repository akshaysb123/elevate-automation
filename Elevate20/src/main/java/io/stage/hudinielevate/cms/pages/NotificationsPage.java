package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class NotificationsPage extends BaseClass {

	public static WebDriver driver;
	public static Properties propgetBerties;
	ElementActions elementActions;

	public NotificationsPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}

	// Notifications:
	private By notificationTypeDpDownOptions = By.id("type_select");
	private By notificationTypeDpDownOptionSelected = By.xpath("//ul[@aria-labelledby='type_label']/li");
	private By notificationTitleTxtBx = By.id("title_input");
	private By notificationMsgTxtBx = By.id("notification_message_input");
	private By selectDeviceDpDownOptions = By.id("select_device_select");
	private By selectDeviceAllOptionsChkBx = By
			.xpath("//ul[@aria-labelledby='select_device_label']//div[@class='MuiListItemIcon-root']/span");
	private By nextBtn = By.xpath("//span[text()='Next']");
	private By impresssionCountTxtBx = By.id("no._of_impressions_per_day_input");
	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By addBtn = By.xpath("//span[text()='Add']");
	private By updateBtn = By.xpath("//span[text()='Update']");
	private By notificationSearchTxtBx = By.xpath("//input[@type='text']");
	private By ellipsisBtn = By.xpath("(//button[@aria-controls='simple-menu']/span)[1]");
	private By deactivateNotificationOption = By.xpath("(//li[@role='menuitem'])[1]");
	private By editNotificationOption = By.xpath("(//li[@role='menuitem'])[2]");
	private By deleteNotificationOption = By.xpath("(//li[@role='menuitem'])[4]");
	private By deleteConfirmationBtn = By.xpath("//span[text()='Yes']");
	private By deleteConfirmationTxt = By.xpath("//p[text()='0-0 of 0']");

	private By addNotificationBtn = By.xpath("//span[text()='Add Notifications']");

	private By notificationDateTxtBx = By.id("Date");
	private By notificationTimeTxtBx = By.id("onetime");
	private By deleteBtn = By.xpath("//span[text()='Delete']");

	public By getDeleteBtn() {
		return deleteBtn;
	}

	public void setDeleteBtn(By deleteBtn) {
		this.deleteBtn = deleteBtn;
	}

	public By getNotificationTimeTxtBx() {
		return notificationTimeTxtBx;
	}

	public void setNotificationTimeTxtBx(By notificationTimeTxtBx) {
		this.notificationTimeTxtBx = notificationTimeTxtBx;
	}

	public By getNotificationDateTxtBx() {
		return notificationDateTxtBx;
	}

	public void setNotificationDateTxtBx(By notificationDateTxtBx) {
		this.notificationDateTxtBx = notificationDateTxtBx;
	}

	public By getAddNotificationBtn() {
		return addNotificationBtn;
	}

	public void setAddNotificationBtn(By addNotificationBtn) {
		this.addNotificationBtn = addNotificationBtn;
	}

	public By getNotificationTypeDpDownOptions() {
		return notificationTypeDpDownOptions;
	}

	public void setNotificationTypeDpDownOptions(By notificationTypeDpDownOptions) {
		this.notificationTypeDpDownOptions = notificationTypeDpDownOptions;
	}

	public By getNotificationTypeDpDownOptionSelected() {
		return notificationTypeDpDownOptionSelected;
	}

	public void setNotificationTypeDpDownOptionSelected(By notificationTypeDpDownOptionSelected) {
		this.notificationTypeDpDownOptionSelected = notificationTypeDpDownOptionSelected;
	}

	public By getNotificationTitleTxtBx() {
		return notificationTitleTxtBx;
	}

	public void setNotificationTitleTxtBx(By notificationTitleTxtBx) {
		this.notificationTitleTxtBx = notificationTitleTxtBx;
	}

	public By getNotificationMsgTxtBx() {
		return notificationMsgTxtBx;
	}

	public void setNotificationMsgTxtBx(By notificationMsgTxtBx) {
		this.notificationMsgTxtBx = notificationMsgTxtBx;
	}

	public By getSelectDeviceDpDownOptions() {
		return selectDeviceDpDownOptions;
	}

	public void setSelectDeviceDpDownOptions(By selectDeviceDpDownOptions) {
		this.selectDeviceDpDownOptions = selectDeviceDpDownOptions;
	}

	public By getSelectDeviceAllOptionsChkBx() {
		return selectDeviceAllOptionsChkBx;
	}

	public void setSelectDeviceAllOptionsChkBx(By selectDeviceAllOptionsChkBx) {
		this.selectDeviceAllOptionsChkBx = selectDeviceAllOptionsChkBx;
	}

	public By getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(By nextBtn) {
		this.nextBtn = nextBtn;
	}

	public By getImpresssionCountTxtBx() {
		return impresssionCountTxtBx;
	}

	public void setImpresssionCountTxtBx(By impresssionCountTxtBx) {
		this.impresssionCountTxtBx = impresssionCountTxtBx;
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

	public By getNotificationSearchTxtBx() {
		return notificationSearchTxtBx;
	}

	public void setNotificationSearchTxtBx(By notificationSearchTxtBx) {
		this.notificationSearchTxtBx = notificationSearchTxtBx;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	public By getDeactivateNotificationOption() {
		return deactivateNotificationOption;
	}

	public void setDeactivateNotificationOption(By deactivateNotificationOption) {
		this.deactivateNotificationOption = deactivateNotificationOption;
	}

	public By getEditNotificationOption() {
		return editNotificationOption;
	}

	public void setEditNotificationOption(By editNotificationOption) {
		this.editNotificationOption = editNotificationOption;
	}

	public By getDeleteNotificationOption() {
		return deleteNotificationOption;
	}

	public void setDeleteNotificationOption(By deleteNotificationOption) {
		this.deleteNotificationOption = deleteNotificationOption;
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

	public boolean createNotification() {
		elementActions.clickOnElement(getAddNotificationBtn());
		elementActions.clickOnElement(getNotificationTypeDpDownOptions());

		System.out.println("Notification Type=" + ExcelUtil.fetchData("Notification", 1, 0));

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getNotificationTypeDpDownOptionSelected(),
					ExcelUtil.fetchData("Notification", 1, 0));
		} catch (StaleElementReferenceException se) {

			// se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		elementActions.sendKeysElement(getNotificationTitleTxtBx(), ExcelUtil.fetchData("Notification", 1, 1));
		elementActions.sendKeysElement(getNotificationMsgTxtBx(), ExcelUtil.fetchData("Notification", 1, 2));

		elementActions.clickOnElement(getSelectDeviceDpDownOptions());

		elementActions.selectAllCheckBoxes(getSelectDeviceAllOptionsChkBx());

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
		elementActions.clickOnElement(getNextBtn());

		elementActions.clearData(getNotificationDateTxtBx());
		elementActions.clearData(getNotificationTimeTxtBx());

		System.out.println("Date=" + ExcelUtil.fetchData("Notification", 1, 3));
		System.out.println("Time=" + ExcelUtil.fetchData("Notification", 1, 4));

		elementActions.sendKeysElement(getNotificationDateTxtBx(), ExcelUtil.fetchData("Notification", 1, 3));
		elementActions.sendKeysElement(getNotificationTimeTxtBx(), ExcelUtil.fetchData("Notification", 1, 4));
		elementActions.sendKeysElement(getImpresssionCountTxtBx(), ExcelUtil.fetchData("Notification", 1, 5));
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getAddBtn());

		// To verify if the notification is created successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getNotificationSearchTxtBx(), ExcelUtil.fetchData("Notification", 1, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isNotificationCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isNotificationCreated;

	}

	public boolean editNotification() {
		elementActions.sendKeysElement(getNotificationSearchTxtBx(), ExcelUtil.fetchData("Notification", 1, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditNotificationOption());

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getNotificationTypeDpDownOptionSelected(),
					ExcelUtil.fetchData("Notification", 2, 0));
		} catch (StaleElementReferenceException se) {

			// se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		elementActions.clearData(getNotificationTitleTxtBx());
		elementActions.clearData(getNotificationMsgTxtBx());

		elementActions.sendKeysElement(getNotificationTitleTxtBx(), ExcelUtil.fetchData("Notification", 2, 1));
		elementActions.sendKeysElement(getNotificationMsgTxtBx(), ExcelUtil.fetchData("Notification", 2, 2));

		elementActions.clickOnElement(getNextBtn());

		elementActions.clearData(getNotificationDateTxtBx());
		elementActions.clearData(getNotificationTimeTxtBx());

		System.out.println("Date=" + ExcelUtil.fetchData("Notification", 2, 3));
		System.out.println("Time=" + ExcelUtil.fetchData("Notification", 2, 4));

		elementActions.sendKeysElement(getNotificationDateTxtBx(), ExcelUtil.fetchData("Notification", 2, 3));
		elementActions.sendKeysElement(getNotificationTimeTxtBx(), ExcelUtil.fetchData("Notification", 2, 4));
		elementActions.sendKeysElement(getImpresssionCountTxtBx(), ExcelUtil.fetchData("Notification", 2, 5));
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getBrowseBtn());

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getUpdateBtn());

		// To verify if the notification is updated successfully

		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getNotificationSearchTxtBx(), ExcelUtil.fetchData("Notification", 2, 1));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isNotificationUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isNotificationUpdated;
	}

	public boolean deleteNotification() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getNotificationSearchTxtBx(), ExcelUtil.fetchData("Notification", 2, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		// elementActions.clickOnElement(getDeleteNotificationOption());

		elementActions.clickOnElement(getDeactivateNotificationOption());
		elementActions.clickOnElement(getDeleteConfirmationBtn());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		elementActions.clearData(getNotificationSearchTxtBx());
		
		elementActions.sendKeysElement(getNotificationSearchTxtBx(), ExcelUtil.fetchData("Notification", 2, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());

		elementActions.clickOnElement(getDeleteNotificationOption());
		elementActions.clickOnElement(getDeleteBtn());

		// Verify if the notification is deleted successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getNotificationSearchTxtBx(), ExcelUtil.fetchData("Notification", 2, 1));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isNotificationDeleted = elementActions.checkIfElementIsPresent(getDeleteConfirmationTxt());
		return isNotificationDeleted;

	}

}
