package Week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
			ChromeDriver drivers = new ChromeDriver();
			//1) Launch URL: https://acme-test.uipath.com/account/login
			drivers.get("https://acme-test.uipath.com/account/login");
			drivers.manage().window().maximize();
			drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//2) Enter UserName (kumar.testleaf@gmail.com) and TAB
			drivers.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB );
			//3) Enter Password (leaf@12)
			drivers.findElementById("password").sendKeys("leaf@12");
			//4) Click Login
			drivers.findElementById("buttonLogin").click();
			//5) Mouse Over on Vendors
			Actions builder= new Actions(drivers);
			WebElement Element1 = drivers.findElementByXPath("(//button[@type='button'])[6]");
			builder.click(Element1).perform();
			//6) Click Search Vendor
			WebElement Element2 = drivers.findElementByXPath("//a[text()='Search for Vendor']");
			builder.click(Element2).perform();
			//7) Enter Vendor Name (Blue Lagoon)
			drivers.findElementById("vendorName").sendKeys("Blue Lagoon");
			//8) Click Search
			drivers.findElementById("buttonSearch").click();
			
			 // Table is identified 
			drivers.findElementByClassName("table");
			 //From table travel through rows
			 List<WebElement> allRows= drivers.findElements(By.tagName("tr"));
			 System.out.println("Number of rows in the table: "+allRows.size());
			 //From table travel through coloumn
			 List<WebElement> allCols = drivers.findElementsByXPath("//table//tr/td");
			 System.out.println("count of no. of. Columns: "+allCols.size());
			//9) Find the Country Name based on the Vendor
			 WebElement Element3=drivers.findElementByXPath("//td[text()=\"France\"]");
			 System.out.println("The Country Name is: "+Element3.getText());
			// 10) Click Log Out
			 drivers.findElementByXPath("//a[text()=\"Log Out\"]").click();
			// 11) Close browser
			 drivers.close();
			 
		

			
			
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
			
			
			

	}

}
