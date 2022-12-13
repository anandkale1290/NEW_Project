package Com.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import net.bytebuddy.utility.RandomString;

public class Library {
	public static ExtentTest test;
	public static void custom_Sendkeys(WebElement element,String Value,String fieldname) {
		try {
		element.sendKeys(Value);
		test.log(Status.PASS,fieldname+"=value successfully sent="+Value);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			System.out.println(e.getMessage());
		}
	}	
	
	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS,"clicked Sucessfully"+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_dropdown(WebElement element,String Value) {
		try{
			
		Select select=new Select(element);
		select.selectByVisibleText(Value);}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void custom_mousemovement(WebDriver driver,WebElement element) {
		try{Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void custom_getCapture(WebDriver driver) throws Exception {
		try {
			
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String rm=RandomString.make(5);
		File dest=new File("C:\\Users\\Anand\\eclipse-workspace\\New_Project\\Screenshot\\"+rm+".png");
		FileUtils.copyFile(src, dest);
		}catch(Exception E)
		{
			System.out.println(E.getMessage());			
		}
	}
	public static Alert custom_AlertHandle(WebDriver driver) {
		Alert alt=driver.switchTo().alert();
		return alt;
		
	}
	
}