package io.stage.hudinielevate.cms.pages;

import java.awt.AWTException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

import io.stage.hudinielevate.cms.base.BaseClass;
import io.stage.hudinielevate.cms.util.ElementActions;
import io.stage.hudinielevate.cms.util.ExcelUtil;

public class ServiceRequestsPage extends BaseClass {

	public static WebDriver driver;
	public static Properties properties;
	ElementActions elementActions;

	public ServiceRequestsPage(WebDriver driver) {
		this.driver = driver;
		elementActions = new ElementActions(driver);

	}

	// Housekeeping:

	private By housekeepingTb = By.xpath("//span[text()='Housekeeping']");
	private By housekeepingAddServiceBtn = By.xpath("//span[text()='Add Service']");
	private By housekeepingNameTxtBx = By.id("name_input");
	private By housekeepingCodeTxtBx = By.id("code_input");
	private By housekeepingIconDpDownOptions = By.id("select_icon_select");
	private By housekeepingIconOptionSelected = By.xpath("//ul[@aria-labelledby='select_icon_label']//li");
	private By housekeepingIsActiveChkBx = By.xpath("//input[@type='checkbox']");
	private By housekeepingDescriptionTxtBx = By.id("description_input");
	private By housekeepingMsgTxtBx = By.id("message_input");
	private By nextBtn = By.xpath("//span[text()='Next']");
	private By hoursAddBtn = By.xpath("(//span[text()='Add'])[2]");
	private By browseBtn = By.xpath("//span[text()='Browse']");
	private By addBtn = By.xpath("(//span[text()='Add'])[2]");
	private By housekeepingSearchTxtBx = By.xpath("//input[@type='text']");
	private By ellipsisBtn = By.xpath("(//button[@aria-controls='simple-menu']/span)[1]");
	private By deactivateHousekeepingOption = By.xpath("(//ul[@role='menu']/li[@role='menuitem'])[1]");
	private By editHousekeepingOption = By.xpath("(//ul[@role='menu']/li[@role='menuitem'])[2]");
	private By deleteHousekeepingOption = By.xpath("(//ul[@role='menu']/li[@role='menuitem'])[4]");
	private By confirmDeleteHousekeepingBtn = By.xpath("//span[text()='Delete']");
	private By housekeepingDeleteConfirmationTxt = By.xpath("//p[text()='0-0 of 0']");
	private By updateBtn = By.xpath("//span[text()='Update']");

	// Concierge:

	private By conciergeTb = By.xpath("//span[text()='Concierge']");
	private By conciergeAddServiceBtn = By.xpath("//span[text()='Add Service']");
	private By conciergeNameTxtBx = By.id("name_input");
	private By conciergeCodeTxtBx = By.id("code_input");
	private By conciergeIconDpDownOptions = By.id("select_icon_select");
	private By conciergeIconOptionSelected = By.xpath("//ul[@aria-labelledby='select_icon_label']//li");
	private By conciergeIsActiveChkBx = By.xpath("//input[@type='checkbox']");
	private By conciergeDescriptionTxtBx = By.id("description_input");
	private By conciergeMsgTxtBx = By.id("message_input");
	private By conciergeSearchTxtBx = By.xpath("//input[@type='text']");
	private By deactivateConciergeOption = By.xpath("(//ul[@role='menu']/li[@role='menuitem'])[1]");
	private By editConcierge = By.xpath("(//ul[@role='menu']/li[@role='menuitem'])[2]");
	private By deleteConciergeOption = By.xpath("(//ul[@role='menu']/li[@role='menuitem'])[4]");
	private By confirmDeleteConciergeBtn = By.xpath("//span[text()='Delete']");
	private By conciergeDeleteConfirmationTxt = By.xpath("//p[text()='0-0 of 0']");

	public ElementActions getElementActions() {
		return elementActions;
	}

	public By getUpdateBtn() {
		return updateBtn;
	}

	public void setUpdateBtn(By updateBtn) {
		this.updateBtn = updateBtn;
	}

	public void setElementActions(ElementActions elementActions) {
		this.elementActions = elementActions;
	}

	public By getHousekeepingTb() {
		return housekeepingTb;
	}

	public void setHousekeepingTb(By housekeepingTb) {
		this.housekeepingTb = housekeepingTb;
	}

	public By getHousekeepingAddServiceBtn() {
		return housekeepingAddServiceBtn;
	}

	public void setHousekeepingAddServiceBtn(By housekeepingAddServiceBtn) {
		this.housekeepingAddServiceBtn = housekeepingAddServiceBtn;
	}

	public By getHousekeepingNameTxtBx() {
		return housekeepingNameTxtBx;
	}

	public void setHousekeepingNameTxtBx(By housekeepingNameTxtBx) {
		this.housekeepingNameTxtBx = housekeepingNameTxtBx;
	}

	public By getHousekeepingCodeTxtBx() {
		return housekeepingCodeTxtBx;
	}

	public void setHousekeepingCodeTxtBx(By housekeepingCodeTxtBx) {
		this.housekeepingCodeTxtBx = housekeepingCodeTxtBx;
	}

	public By getHousekeepingIconDpDownOptions() {
		return housekeepingIconDpDownOptions;
	}

	public void setHousekeepingIconDpDownOptions(By housekeepingIconDpDownOptions) {
		this.housekeepingIconDpDownOptions = housekeepingIconDpDownOptions;
	}

	public By getHousekeepingIconOptionSelected() {
		return housekeepingIconOptionSelected;
	}

	public void setHousekeepingIconOptionSelected(By housekeepingIconOptionSelected) {
		this.housekeepingIconOptionSelected = housekeepingIconOptionSelected;
	}

	public By getHousekeepingIsActiveChkBx() {
		return housekeepingIsActiveChkBx;
	}

	public void setHousekeepingIsActiveChkBx(By housekeepingIsActiveChkBx) {
		this.housekeepingIsActiveChkBx = housekeepingIsActiveChkBx;
	}

	public By getHousekeepingDescriptionTxtBx() {
		return housekeepingDescriptionTxtBx;
	}

	public void setHousekeepingDescriptionTxtBx(By housekeepingDescriptionTxtBx) {
		this.housekeepingDescriptionTxtBx = housekeepingDescriptionTxtBx;
	}

	public By getHousekeepingMsgTxtBx() {
		return housekeepingMsgTxtBx;
	}

	public void setHousekeepingMsgTxtBx(By housekeepingMsgTxtBx) {
		this.housekeepingMsgTxtBx = housekeepingMsgTxtBx;
	}

	public By getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(By nextBtn) {
		this.nextBtn = nextBtn;
	}

	public By getHoursAddBtn() {
		return hoursAddBtn;
	}

	public void setHoursAddBtn(By hoursAddBtn) {
		this.hoursAddBtn = hoursAddBtn;
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

	public By getHousekeepingSearchTxtBx() {
		return housekeepingSearchTxtBx;
	}

	public void setHousekeepingSearchTxtBx(By housekeepingSearchTxtBx) {
		this.housekeepingSearchTxtBx = housekeepingSearchTxtBx;
	}

	public By getEllipsisBtn() {
		return ellipsisBtn;
	}

	public void setEllipsisBtn(By ellipsisBtn) {
		this.ellipsisBtn = ellipsisBtn;
	}

	public By getDeactivateHousekeepingOption() {
		return deactivateHousekeepingOption;
	}

	public void setDeactivateHousekeepingOption(By deactivateHousekeepingOption) {
		this.deactivateHousekeepingOption = deactivateHousekeepingOption;
	}

	public By getEditHousekeepingOption() {
		return editHousekeepingOption;
	}

	public void setEditHousekeepingOption(By editHousekeepingOption) {
		this.editHousekeepingOption = editHousekeepingOption;
	}

	public By getDeleteHousekeepingOption() {
		return deleteHousekeepingOption;
	}

	public void setDeleteHousekeepingOption(By deleteHousekeepingOption) {
		this.deleteHousekeepingOption = deleteHousekeepingOption;
	}

	public By getConfirmDeleteHousekeepingBtn() {
		return confirmDeleteHousekeepingBtn;
	}

	public void setConfirmDeleteHousekeepingBtn(By confirmDeleteHousekeepingBtn) {
		this.confirmDeleteHousekeepingBtn = confirmDeleteHousekeepingBtn;
	}

	public By getHousekeepingDeleteConfirmationTxt() {
		return housekeepingDeleteConfirmationTxt;
	}

	public void setHousekeepingDeleteConfirmationTxt(By housekeepingDeleteConfirmationTxt) {
		this.housekeepingDeleteConfirmationTxt = housekeepingDeleteConfirmationTxt;
	}

	public By getConciergeTb() {
		return conciergeTb;
	}

	public void setConciergeTb(By conciergeTb) {
		this.conciergeTb = conciergeTb;
	}

	public By getConciergeAddServiceBtn() {
		return conciergeAddServiceBtn;
	}

	public void setConciergeAddServiceBtn(By conciergeAddServiceBtn) {
		this.conciergeAddServiceBtn = conciergeAddServiceBtn;
	}

	public By getConciergeNameTxtBx() {
		return conciergeNameTxtBx;
	}

	public void setConciergeNameTxtBx(By conciergeNameTxtBx) {
		this.conciergeNameTxtBx = conciergeNameTxtBx;
	}

	public By getConciergeCodeTxtBx() {
		return conciergeCodeTxtBx;
	}

	public void setConciergeCodeTxtBx(By conciergeCodeTxtBx) {
		this.conciergeCodeTxtBx = conciergeCodeTxtBx;
	}

	public By getConciergeIconDpDownOptions() {
		return conciergeIconDpDownOptions;
	}

	public void setConciergeIconDpDownOptions(By conciergeIconDpDownOptions) {
		this.conciergeIconDpDownOptions = conciergeIconDpDownOptions;
	}

	public By getConciergeIconOptionSelected() {
		return conciergeIconOptionSelected;
	}

	public void setConciergeIconOptionSelected(By conciergeIconOptionSelected) {
		this.conciergeIconOptionSelected = conciergeIconOptionSelected;
	}

	public By getConciergeIsActiveChkBx() {
		return conciergeIsActiveChkBx;
	}

	public void setConciergeIsActiveChkBx(By conciergeIsActiveChkBx) {
		this.conciergeIsActiveChkBx = conciergeIsActiveChkBx;
	}

	public By getConciergeDescriptionTxtBx() {
		return conciergeDescriptionTxtBx;
	}

	public void setConciergeDescriptionTxtBx(By conciergeDescriptionTxtBx) {
		this.conciergeDescriptionTxtBx = conciergeDescriptionTxtBx;
	}

	public By getConciergeMsgTxtBx() {
		return conciergeMsgTxtBx;
	}

	public void setConciergeMsgTxtBx(By conciergeMsgTxtBx) {
		this.conciergeMsgTxtBx = conciergeMsgTxtBx;
	}

	public By getConciergeSearchTxtBx() {
		return conciergeSearchTxtBx;
	}

	public void setConciergeSearchTxtBx(By conciergeSearchTxtBx) {
		this.conciergeSearchTxtBx = conciergeSearchTxtBx;
	}

	public By getDeactivateConciergeOption() {
		return deactivateConciergeOption;
	}

	public void setDeactivateConciergeOption(By deactivateConciergeOption) {
		this.deactivateConciergeOption = deactivateConciergeOption;
	}

	public By getEditConcierge() {
		return editConcierge;
	}

	public void setEditConcierge(By editConcierge) {
		this.editConcierge = editConcierge;
	}

	public By getDeleteConciergeOption() {
		return deleteConciergeOption;
	}

	public void setDeleteConciergeOption(By deleteConciergeOption) {
		this.deleteConciergeOption = deleteConciergeOption;
	}

	public By getConfirmDeleteConciergeBtn() {
		return confirmDeleteConciergeBtn;
	}

	public void setConfirmDeleteConciergeBtn(By confirmDeleteConciergeBtn) {
		this.confirmDeleteConciergeBtn = confirmDeleteConciergeBtn;
	}

	public By getConciergeDeleteConfirmationTxt() {
		return conciergeDeleteConfirmationTxt;
	}

	public void setConciergeDeleteConfirmationTxt(By conciergeDeleteConfirmationTxt) {
		this.conciergeDeleteConfirmationTxt = conciergeDeleteConfirmationTxt;
	}

	public boolean createHousekeeping() {

		elementActions.clickOnElement(getHousekeepingTb());

		elementActions.clickOnElement(getHousekeepingAddServiceBtn());
		elementActions.sendKeysElement(getHousekeepingNameTxtBx(), ExcelUtil.fetchData("Housekeeping", 1, 0));
		elementActions.sendKeysElement(getHousekeepingCodeTxtBx(), ExcelUtil.fetchData("Housekeeping", 1, 1));
		elementActions.clickOnElement(getHousekeepingIconDpDownOptions());
		System.out.println("Housekeeping service icon=" + ExcelUtil.fetchData("Housekeeping", 1, 2));

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getHousekeepingIconOptionSelected(),
					ExcelUtil.fetchData("Housekeeping", 1, 2));
		} catch (StaleElementReferenceException se) {

			elementActions.clickOnElement(getHousekeepingIsActiveChkBx());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// elementActions.sendKeysElement(getHousekeepingIconOptionSelected(),
		// ExcelUtil.fetchData("Housekeeping", 1, 2));

		elementActions.sendKeysElement(getHousekeepingDescriptionTxtBx(), ExcelUtil.fetchData("Housekeeping", 1, 3));
		elementActions.sendKeysElement(getHousekeepingMsgTxtBx(), ExcelUtil.fetchData("Housekeeping", 1, 4));
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getAddBtn());
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getBrowseBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getAddBtn());

		// To verify if the housekeeping service is created successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getHousekeepingSearchTxtBx(), ExcelUtil.fetchData("Housekeeping", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHousekeepingServiceCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isHousekeepingServiceCreated;

	}

	public boolean editHouskeeping() {

		elementActions.clickOnElement(getHousekeepingTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getHousekeepingSearchTxtBx(), ExcelUtil.fetchData("Housekeeping", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditHousekeepingOption());

		elementActions.clearData(getHousekeepingNameTxtBx());
		elementActions.clearData(getHousekeepingCodeTxtBx());
		elementActions.clearData(getHousekeepingDescriptionTxtBx());
		elementActions.clearData(getHousekeepingMsgTxtBx());

		elementActions.sendKeysElement(getHousekeepingNameTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 0));
		elementActions.sendKeysElement(getHousekeepingCodeTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 1));
		elementActions.clickOnElement(getHousekeepingIconDpDownOptions());
		System.out.println("Housekeeping service icon=" + ExcelUtil.fetchData("Housekeeping", 2, 2));

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getHousekeepingIconOptionSelected(),
					ExcelUtil.fetchData("Housekeeping", 2, 2));
		} catch (StaleElementReferenceException se) {

			elementActions.clickOnElement(getHousekeepingIsActiveChkBx());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// elementActions.sendKeysElement(getHousekeepingIconOptionSelected(),
		// ExcelUtil.fetchData("Housekeeping", 2, 2));

		elementActions.sendKeysElement(getHousekeepingDescriptionTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 3));
		elementActions.sendKeysElement(getHousekeepingMsgTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 4));
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getNextBtn());

		// elementActions.clickOnElement(getAddBtn());
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getBrowseBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getUpdateBtn());

		// To verify if the housekeeping service is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getHousekeepingSearchTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isHousekeepingServiceUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isHousekeepingServiceUpdated;

	}

	public boolean deleteHousekeepingService() {

		elementActions.clickOnElement(getHousekeepingTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getHousekeepingSearchTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteHousekeepingOption());

		elementActions.clickOnElement(getConfirmDeleteHousekeepingBtn());

		// Verify if the housekeeping service is deleted successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getHousekeepingSearchTxtBx(), ExcelUtil.fetchData("Housekeeping", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isServiceRequestDeleted = elementActions
				.checkIfElementIsPresent(getHousekeepingDeleteConfirmationTxt());
		return isServiceRequestDeleted;

	}

	public boolean createConcierge() {

		elementActions.clickOnElement(getConciergeTb());

		elementActions.clickOnElement(getConciergeAddServiceBtn());
		elementActions.sendKeysElement(getConciergeNameTxtBx(), ExcelUtil.fetchData("Concierge", 1, 0));
		elementActions.sendKeysElement(getConciergeCodeTxtBx(), ExcelUtil.fetchData("Concierge", 1, 1));
		elementActions.clickOnElement(getConciergeIconDpDownOptions());

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getConciergeIconOptionSelected(),
					ExcelUtil.fetchData("Concierge", 1, 2));
		} catch (StaleElementReferenceException se) {

			elementActions.clickOnElement(getConciergeIsActiveChkBx());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// elementActions.sendKeysElement(getHousekeepingIconOptionSelected(),
		// ExcelUtil.fetchData("Housekeeping", 1, 2));

		elementActions.sendKeysElement(getConciergeDescriptionTxtBx(), ExcelUtil.fetchData("Concierge", 1, 3));
		elementActions.sendKeysElement(getConciergeMsgTxtBx(), ExcelUtil.fetchData("Concierge", 1, 4));
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getAddBtn());
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getBrowseBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getAddBtn());

		// To verify if the concierge service is created successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getConciergeSearchTxtBx(), ExcelUtil.fetchData("Concierge", 1, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isConciergeCreated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isConciergeCreated;

	}

	public boolean editConcierge() {

		elementActions.clickOnElement(getConciergeTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getConciergeSearchTxtBx(), ExcelUtil.fetchData("Concierge", 1, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getEditHousekeepingOption());

		elementActions.clearData(getConciergeNameTxtBx());
		elementActions.clearData(getConciergeCodeTxtBx());
		elementActions.clearData(getConciergeDescriptionTxtBx());
		elementActions.clearData(getConciergeMsgTxtBx());

		elementActions.sendKeysElement(getConciergeNameTxtBx(), ExcelUtil.fetchData("Concierge", 2, 0));
		elementActions.sendKeysElement(getConciergeCodeTxtBx(), ExcelUtil.fetchData("Concierge", 2, 1));
		elementActions.clickOnElement(getConciergeIconDpDownOptions());
		System.out.println("Concierge service icon=" + ExcelUtil.fetchData("Concierge", 2, 2));

		try {
			Thread.sleep(3000);
			elementActions.selectDropdownOption(getConciergeIconOptionSelected(),
					ExcelUtil.fetchData("Concierge", 2, 2));
		} catch (StaleElementReferenceException se) {

			elementActions.clickOnElement(getConciergeIsActiveChkBx());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// elementActions.sendKeysElement(getHousekeepingIconOptionSelected(),
		// ExcelUtil.fetchData("Housekeeping", 2, 2));

		elementActions.sendKeysElement(getConciergeDescriptionTxtBx(), ExcelUtil.fetchData("Concierge", 2, 3));
		elementActions.sendKeysElement(getConciergeMsgTxtBx(), ExcelUtil.fetchData("Concierge", 2, 4));
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getNextBtn());

		// elementActions.clickOnElement(getAddBtn());
		elementActions.clickOnElement(getNextBtn());

		elementActions.clickOnElement(getBrowseBtn());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			elementActions.uploadImage();
		} catch (AWTException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.clickOnElement(getUpdateBtn());

		// To verify if the housekeeping service is updated successfully
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		elementActions.sendKeysElement(getConciergeSearchTxtBx(), ExcelUtil.fetchData("Concierge", 2, 0));

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean isConciergeServiceUpdated = elementActions.checkIfElementIsPresent(getEllipsisBtn());
		return isConciergeServiceUpdated;

	}

	public boolean deleteConcierge() {

		elementActions.clickOnElement(getConciergeTb());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getConciergeSearchTxtBx(), ExcelUtil.fetchData("Concierge", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		elementActions.clickOnElement(getEllipsisBtn());
		elementActions.clickOnElement(getDeleteConciergeOption());

		elementActions.clickOnElement(getConfirmDeleteConciergeBtn());

		// Verify if the concierge service is deleted successfully
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		elementActions.sendKeysElement(getConciergeSearchTxtBx(), ExcelUtil.fetchData("Concierge", 2, 0));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		boolean isConciergeServiceDeleted = elementActions
				.checkIfElementIsPresent(getConciergeDeleteConfirmationTxt());
		return isConciergeServiceDeleted;

	}

}
