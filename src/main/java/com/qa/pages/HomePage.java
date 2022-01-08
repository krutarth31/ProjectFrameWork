package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//ul[@class='hl-cat-nav__container']/li")
	List<WebElement> header; 
	
	@FindBy(linkText="Daily Deals")
	WebElement dailyDeals;
	
	public HomePage() {
		PageFactory.initElements(driver,this );
	}
	
	public int checkHeaderSize() {

		return header.size();
		
	}
		
	public DailyDealsPage clickDailyDeals() {

		dailyDeals.click();
		return new DailyDealsPage();
		
	}
		
	}


