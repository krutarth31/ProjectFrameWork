package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DailyDealsPage extends TestBase {
	
	@FindBy(xpath="(//span[@class='first'])[32]")
	WebElement joggerPrice;
	
	public DailyDealsPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getJoggerPrice() {
		return joggerPrice.getText();
		}
	

}
