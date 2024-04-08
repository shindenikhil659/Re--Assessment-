package Test_Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;


import java.util.List;

public class AppTest {
	WebDriver driver;
	
	@Test(priority=0)
	
	public void TestApp() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement table = driver.findElement(By.xpath("//tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		
		for (WebElement row : rows) {
			
	        List<WebElement> cells = row.findElements(By.tagName("td"));

	        for (WebElement cell : cells) {
	        	
	        	
	        	
	            System.out.print(cell.getText() + "\t");
	            
	        }
	        System.out.println();
	    }

	}
	
	@Test(priority = 1)
	public void FindCountry() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement table = driver.findElement(By.xpath("//tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		boolean temp = false;
		
		for (WebElement row : rows) {
			
	        List<WebElement> cells = row.findElements(By.tagName("td"));

	        for (WebElement cell : cells) {
	        	
	        	String cellText = cell.getText();
	        	
//	            System.out.print(cell.getText() + "\t");
	            
	            if(cellText.contains("Mexico")) {
	        
	            	temp = true;
	            	break;
	            }
	        }
//	        System.out.println();
	    }
		
		System.out.println();
		
		Assert.assertTrue(temp);
		System.out.println("Country Found In the Given Table");
		
//		if(temp == true) {
//			Assert.assertTrue(temp);
//			System.out.println("Country Found In the Given Table");
//		}
//		else {
//			System.out.println("Country Not Found In the Given Table");
//		}
//		
	}
	
	@Test(priority = 2)
	public void oddRow() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		WebElement table = driver.findElement(By.xpath("//tbody"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		boolean isOddRow = true;
		
		for (WebElement row : rows) {
			if (isOddRow) {
	        List<WebElement> cells = row.findElements(By.tagName("td"));

	        for (WebElement cell : cells) {
	        	
	            System.out.print(cell.getText() + "\t");
	            
	        }
	        System.out.println();
	        
			}
            isOddRow = !isOddRow;
	    }
		
		System.out.println();
		
	}

}

