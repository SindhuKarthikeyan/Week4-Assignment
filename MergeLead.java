package Week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MergeLead {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
			ChromeDriver drivers = new ChromeDriver();
			
			drivers.get("http://leaftaps.com/opentaps/control/login");
			drivers.manage().window().maximize();
			drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			drivers.findElementById("username").sendKeys("Demosalesmanager",Keys.TAB);
			drivers.findElementById("password").sendKeys("crmsfa");
			drivers.findElementByClassName("decorativeSubmit").click();
			drivers.findElementByXPath("//img[@src='/opentaps_images/integratingweb/crm.png']").click();
			drivers.findElementByXPath("//a[text()='Contacts']").click();
			drivers.findElementByXPath("//a[text()='Merge Contacts']").click();
			drivers.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
			Set<String>AllWindowRef=drivers.getWindowHandles();
			List<String>List=new ArrayList<String>(AllWindowRef);
			drivers.switchTo().window(List.get(1));
			System.out.println(drivers.getTitle());
			drivers.findElementByXPath("//a[text()='DemoContact1']").click();
			drivers.switchTo().window(List.get(0));
			System.out.println(drivers.getTitle());
			
			 Thread.sleep(3000);
			
			drivers.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
			Set<String>AllWindowRef1=drivers.getWindowHandles();
			List<String>List1=new ArrayList<String>(AllWindowRef1);
		    drivers.switchTo().window(List1.get(1));
		    System.out.println(drivers.getTitle());
		    Thread.sleep(3000);
			drivers.findElementByXPath("//a[text()='DemoContact2']").click();
			drivers.switchTo().window(List1.get(0));
			System.out.println(drivers.getTitle());
			
			drivers.findElementByXPath("//a[@class='buttonDangerous']").click();
			
			Alert alert =drivers.switchTo().alert();
			alert.accept();
			drivers.switchTo().defaultContent();
			
			System.out.println(drivers.getTitle());
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
