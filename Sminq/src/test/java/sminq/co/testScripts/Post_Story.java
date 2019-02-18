/*
* Project Name : Sminq Demo Framework
* Author : vTESTcorp
* Version : V1.0.demo
* Reviewed By : Manjeet
* Date of Creation : Feb 7, 2019
* Modification History :
* Date of change : Feb 15, 2019
* Version : V1.1.demo
* changed function : 
* change description :
* Modified By : Manjeet
*/

package sminq.co.testScripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import sminq.co.pageObjects.*;
import sminq.co.Base.*;

public class Post_Story extends BaseClass {
		
	// Calling base class constructor.
	public Post_Story() {
		super();
	}	
	
	/*
	 * Test case ID: TC01 
	 * Module: Post 
	 * Precondition: User should be logged into app.
	 * Title: Post story. 
	 * Steps: 1. Launch the app. 
	 * 			2. Tap on Add Photo icon. 
	 * 			3. Tap on Capture button. 
	 * 			4. Tag a place. 
	 * 			5. Select a Mood. 
	 * 			6. Select a Sticker. 
	 * 			7. Type a text. 
	 * 			8. Tap on Done and then Post. 
	 * Expected: 	1. Should Post the story. 
	 * 				2. Successful message 'Upload Completed!' should be displayed."
	 */
	@Test
	public void POST() throws Exception {
		
		Objects_Post_Story p1 = new Objects_Post_Story(); // Creating instance of Objects_Post_Story
		BaseClass b1=new BaseClass();
		
		System.out.println("Sminq app is launched successfully");
		logger=extent.createTest("Post Real time stories: ["+ b1.platform_version+"]");
		String screenshotPath = Post_Story.getScreenshot(getDriver(), "Pass");
		logger.log(Status.PASS,"Application Launched Successfully- " + screenshotPath,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath).build());
		p1.addPostIcon.click();
		System.out.println("Tapped on Add Post");
		logger.pass("Tapped on Add Post Button");

		try {
			p1.OK.click();
			logger.log(Status.PASS, "Clicked on Ok button, present on Location Popup");
		} catch (Exception e) {
		}

		p1.captureButton.click();
		System.out.println("Tapped on Capture button");
		logger.log(Status.PASS, "Clicked on Capture button, present on Sminq native app");

		p1.tagPlace1.click();

		p1.tagPlace2.sendKeys(prop.getProperty("tag_place"));
		logger.log(Status.PASS, "Added specific Location, after search with name");

		p1.returnKey.click();

		p1.tagPlace3.click();
		System.out.println("Tagged a place");
		String screenshotPath1 = Post_Story.getScreenshot(getDriver(), "Pass");
		logger.log(Status.PASS,"Tagging specific place- " + screenshotPath1,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath1).build());

		p1.mood1.click();
		System.out.println("1st mood selected");

		p1.searchSticker.sendKeys(prop.getProperty("select_sticker"));

		p1.returnKey.click();

		p1.selectSticker.click();
		System.out.println("Sticker selected");
		String screenshotPath2 = Post_Story.getScreenshot(getDriver(), "Pass");
		logger.log(Status.PASS,"Selection of Genre specific stickers- " + screenshotPath2,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath2).build());

		p1.clickTypeTextIcon.click();

		p1.typeText.sendKeys(prop.getProperty("Custom_Text"));
		
		System.out.println("Text added");
		String screenshotPath3 = Post_Story.getScreenshot(getDriver(), "Pass");
		logger.log(Status.PASS,"Addition of Customized notes- " + screenshotPath3,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath3).build());

		p1.tapDone.click();
		System.out.println("Tapped on Done");

		p1.tapPost.click();
		System.out.println("Tapped on POST \n\n");

		System.out.println("Is the POST uploaded?.....");
		
		try
		{
		String text = p1.UploadMessage.getText();
		if (text.equalsIgnoreCase("Upload completed!")) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}}catch(Exception e){}
		
		String screenshotPath4 = Post_Story.getScreenshot(getDriver(), "Pass");
		logger.log(Status.PASS,"Post Submission- " + screenshotPath4,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath4).build());
	}
	

}