package sminq.co.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sminq.co.Base.*;

public class Objects_Change_Profile_Pic extends BaseClass{

	@FindBy(xpath = "//XCUIElementTypeButton[2]")
	public WebElement tapProfileIcon;

	@FindBy(xpath = "//*[@name='EDIT PROFILE']")
	public WebElement tapEditProfile;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
	public WebElement tapAddPhoto;

	@FindBy(xpath = "//*[@name='Take Photo']")
	public WebElement tapTakePhoto;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"PhotoCapture\"]")
	public WebElement tapCapturePhoto;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Use Photo\"]")
	public WebElement tapUsePhoto;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"SAVE\"]")
	public WebElement tapSaveButton;

	@FindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Profile\"]")
	public WebElement pageProfileTitle;
	
	public Objects_Change_Profile_Pic() {
		PageFactory.initElements(getDriver(), this);
	}

}
