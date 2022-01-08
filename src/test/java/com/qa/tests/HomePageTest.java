package com.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DailyDealsPage;
import com.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	DailyDealsPage dailyDealsPage;
	
  @Test
  public void checkHeaderSizeTest() {

	 int size = hp.checkHeaderSize();
	 System.out.println(size);
	 Assert.assertEquals(size, 13);
  }
  
  @Test
  public void dailyDealsPage() {
	  dailyDealsPage = new DailyDealsPage();
	  dailyDealsPage = hp.clickDailyDeals();
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  init();
	  hp = new HomePage();

  }

  @AfterMethod
  public void afterMethod() {
	 tearDown();
  }

}
