package org.util;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonUtilityClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void urlLaunch(String url) {
		// TODO Auto-generated method stub
		driver.get(url);

	}
	
	public static void sendKeys(WebElement element,String userName) {
		// TODO Auto-generated method stub
      element.sendKeys(userName);
	}
	

	
	public static void clickEvent(WebElement e) {
		e.click();

	}
	
	public static void closeBrowser() {
		System.out.println("Hi I m IN");
		driver.quit();		
	}
	
	
	public static void getValuefromList(List<String> element,List<String> data) {
		Map<String,String> mp = new LinkedHashMap<String, String>();
		for(int i=0;i<element.size();i++) {
			mp.put(element.get(i), data.get(i));			
		}		
		
		Set<Entry<String, String>> entrySet = mp.entrySet();		
		for(Entry x:entrySet) {
			System.out.println("Product Name......"+x.getKey() + "*******Price *******" +x.getValue());
		}
	}

	
	public static int[] convertStringListToIntArray(List<String> stringList) {		
		 int[] intArray = {0, 1, 2, 3};                
		return intArray;

	}

}
