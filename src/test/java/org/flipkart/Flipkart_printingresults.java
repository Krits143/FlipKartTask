package org.flipkart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pom.SearchPagePOM;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.util.CommonUtilityClass;
import org.util.ComparatorUtilities;

public class Flipkart_printingresults extends CommonUtilityClass{
	
	
	
	@BeforeClass
	public void beforeClass() {
		launchBrowser();
		urlLaunch("https://www.flipkart.com/");	
	}
	
	/*@Test
	public void testResults() {
		
		SearchPagePOM searchPOM = new SearchPagePOM();
		WebElement searchTextbox = searchPOM.getSearchTextbox();
		searchTextbox.sendKeys("iphone",Keys.ENTER);
		
		WebElement results = searchPOM.getResults();
		String searchResultText = results.getText();
		System.out.println(searchResultText);
		
		int startIndex = searchResultText.indexOf("of ") + 3;//Move to start of number
		int endIndex = searchResultText.indexOf(" results");
		
		String result = searchResultText.substring(startIndex, endIndex).trim();
        int searchResultInNum = Integer.parseInt(result);
        
        System.out.println("printing the total search result count....."+searchResultInNum);
			
		}*/
	
	
	@Test
	public void printIphoneNameAndPriceInConsole() {
		
		//For name
		List<String> nameList = new ArrayList<String>();
		SearchPagePOM searchPOM = new SearchPagePOM();
		WebElement searchTextbox = searchPOM.getSearchTextbox();	
		searchTextbox.sendKeys("iphone",Keys.ENTER);
				
		List<WebElement> getiPhoneResultsList = searchPOM.getiPhoneResults();
		for(WebElement e :getiPhoneResultsList) {
			System.out.println(e.getText());
			System.out.println("-----------------------------");
			String productName = e.getText();
			nameList.add(productName);
		}	
		
	//For price 
		
		List<String> priceList = new LinkedList<String>();
		List<WebElement> getiPhonePrice = searchPOM.getiPhonePrice();
		for(WebElement e :getiPhonePrice) {
			System.out.println("Getting the price of iPhone------"+e.getText());
			System.out.println("-----------------------------");		
			String productPrice = e.getText();
			String newProductPrice = productPrice.replace("₹", "");
		    System.out.println("Getting the price of iPhone after removing special character------"+newProductPrice);
			priceList.add(newProductPrice);
		}
		System.out.println(priceList);
		Comparator con = new ComparatorUtilities();
		Collections.sort(priceList,con);
		/*getValuefromList(nameList,priceList);
		
    	Comparator con = new ComparatorUtilities();
		Collections.sort(priceList,con);
		int[] priceSorted = convertStringListToIntArray(priceList);
		
		System.out.println("------------List of Products Minimum Value-------------");
		System.out.println("---------------Mimimum Value --------"+priceSorted[0]);
	    System.out.println("------------List of Products Maximum Value-------------");		
		System.out.println("---------------Maximum Value --------"+priceSorted[priceSorted.length - 1]);*/

	}	
			
	}
	
	
	
	


