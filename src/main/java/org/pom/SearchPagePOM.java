package org.pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.util.CommonUtilityClass;

public class SearchPagePOM extends CommonUtilityClass{
	
	public SearchPagePOM() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement searchTextbox;
	
	@FindBy(xpath="//span[@class='BUOuZu']")
	private WebElement results;
	
	@FindBy(xpath="//div[@class='KzDlHZ']")
	private List<WebElement> iPhoneResults;
	
	@FindBy(xpath="//div[@class='Nx9bqj _4b5DiR']")
	private List<WebElement> iPhonePrice;

	public List<WebElement> getiPhonePrice() {
		return iPhonePrice;
	}

	public List<WebElement> getiPhoneResults() {
		return iPhoneResults;
	}

	public WebElement getResults() {
		return results;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

}
