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

public class Change_Profile_Pic extends BaseClass {

	// Calling base class constructor.
	public Change_Profile_Pic() {
		super();
	}
	
	/*
	 * Test case ID: TC02
	 * Module: Profile
	 * Sub-module: Edit Profile 
	 * Precondition: User should be logged into app.
	 * Title: Change Profile Pic. 
	 * Steps:   1. Launch the app.
	 * 			2. Tap on Profile icon.
	 * 			3. Tap on EDIT PROFILE.
	 * 			4. Tap on Photo.
	 * 			5. Select 'Choose From Library'.
	 * 			6. Select folder.
	 * 			7. Select photo.
	 * 			8. Tap Choose. 
	 * Expected: Should change/ update profile picture
	 */
	@Test
	public void CHANGE() throws Exception {
		BaseClass b1=new BaseClass();
		Objects_Change_Profile_Pic change = new Objects_Change_Profile_Pic();

		System.out.println("Sminq app is launched successfully");
		logger = extent.createTest("Profile pic updation: [" + b1.platform_version + "]");

		change.tapProfileIcon.click();
		System.out.println("Tapped on Profile icon");
		logger.pass("Tapped on Profile Icon Button");

		change.tapEditProfile.click();
		System.out.println("Editing Profile");
		logger.pass("Tapped on Edit Profile Icon Button");

		change.tapAddPhoto.click();
		System.out.println("Tapped on Add Photo");
		logger.pass("Tapped on Add Photo Button");

		change.tapTakePhoto.click();
		System.out.println("Take Photo");

		change.tapCapturePhoto.click();
		System.out.println("Taking Photo using Camera");

		change.tapUsePhoto.click();
		System.out.println("Using captured photo");
		logger.pass("Tapped on Captured Camera Button");

		change.tapSaveButton.click();
		System.out.println("Saving the Photo");
		logger.pass("Tapped on Save Button");

		change.pageProfileTitle.getText();
		System.out.println("Profile pic changed successfully...");
		
		String screenshotPath5 = Post_Story.getScreenshot(getDriver(), "Pass");
		logger.log(Status.PASS, "Profile picture updated successfully- " + screenshotPath5,MediaEntityBuilder.createScreenCaptureFromPath(screenshotPath5).build());

	}

}