package sminq.co.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import sminq.co.Base.*;

public class Objects_Post_Story extends BaseClass{

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"iconAddPost\"]")
	public WebElement addPostIcon;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	public WebElement OK;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
	public WebElement captureButton;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement tagPlace1;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement tagPlace2;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Return\"]")
	public WebElement returnKey;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell")
	public WebElement tagPlace3;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"moodIcon1\"]")
	public WebElement mood1;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeTextField")
	public WebElement searchSticker;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeCollectionView/XCUIElementTypeCell")
	public WebElement selectSticker;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"IconStoryText\"]")
	public WebElement clickTypeTextIcon;

	@FindBy(xpath = "//XCUIElementTypeApplication[@name=\"Sminq\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther[1]/XCUIElementTypeTextView")
	public WebElement typeText;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
	public WebElement tapDone;

	@FindBy(xpath = "//XCUIElementTypeButton[@name=\"POST\"]")
	public WebElement tapPost;

	@FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Upload completed!\"]")
	public WebElement UploadMessage;
	
	public Objects_Post_Story() {
		PageFactory.initElements(getDriver(), this);
	}

}
