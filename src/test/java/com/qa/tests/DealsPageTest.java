package com.qa.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.DailyDealsPage;
import com.qa.pages.HomePage;

public class DealsPageTest extends TestBase {
	DailyDealsPage dp;
	HomePage hp;

	
  @Test
  public void getJoggerPriceTest() {
	  String price = dp.getJoggerPrice();
	  Assert.assertEquals(price, "$29.99", "Test Pass");
  }
  @BeforeMethod
  public void beforeMethod() throws IOException {
	  init();
	  hp = new HomePage();
	  hp.clickDailyDeals();
	  dp = new DailyDealsPage();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  tearDown();
  }

}
