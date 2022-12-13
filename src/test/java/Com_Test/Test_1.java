package Com_Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.BaseClass1;
import Com.Utility.Library;

public class Test_1 extends BaseClass1 {
	@Test
	public void Test_case1() {
		LoginPom login=PageFactory.initElements(driver,LoginPom.class);
		Library.custom_Sendkeys(login.getText_email(),excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_Sendkeys(login.getText_pass(),excel.getStringData("Sheet1", 0, 1),"Password");
		login.getBtn_login().click();
	}

}
