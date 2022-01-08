package com.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.base.TestBase;

public class TestUtil extends TestBase {
	
	public static void screentShot() throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("/Volumes/Macintosh HD - Data/Selenium/Selenium_Workspace/ProjectFrameWork/src/test/java/screenshots"+System.currentTimeMillis()+".png"));
	}

}
