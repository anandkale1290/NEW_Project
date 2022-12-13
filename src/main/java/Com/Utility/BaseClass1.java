package Com.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass1 {
	public static WebDriver driver;
	public static ExcelDataProvider excel;
	public static ConfigDataProvider config;
	
	@BeforeSuite
	public void BS() throws Exception {
		excel=new ExcelDataProvider();
		config=new ConfigDataProvider();
	}
	@BeforeMethod
	public void Start() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get(config.getBaseValue1());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
		@AfterMethod
		public void end() {
			driver.close();
		}
		}

