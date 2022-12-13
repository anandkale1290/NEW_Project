package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports ext;
	public static ExtentReports getReports() {
		String path="C:\\Users\\Anand\\eclipse-workspace\\New_Project\\Reports\\index.html";
		ExtentSparkReporter extent=new ExtentSparkReporter(path);
		extent.config().setDocumentTitle("New Document Reports");
		extent.config().setReportName("Anand");
		extent.config().setTheme(Theme.DARK);

		ExtentReports ext=new ExtentReports();
		ext.attachReporter(extent);
		ext.setSystemInfo("Project Name", "Framework Design");
		ext.setSystemInfo("Module Name", "Anand");
		ext.setSystemInfo("BrowserName", "Chrome");
		ext.setSystemInfo("version name", "3.141.23");
		ext.setSystemInfo("QA Name", "Anand kale");
		return ext;
		
		
	}
}
