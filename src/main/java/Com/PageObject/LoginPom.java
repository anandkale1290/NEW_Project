package Com.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {
@FindBy(how=How.XPATH, using="//input[@name='email']") private WebElement text_email;
@FindBy(how=How.XPATH, using="//input[@name='pass']") private WebElement text_pass;
@FindBy(how=How.XPATH, using="//button[@name='login']") private WebElement btn_login;
public WebElement getText_email() {
	return text_email;
}
public WebElement getText_pass() {
	return text_pass;
}
public WebElement getBtn_login() {
	return btn_login;
}
}
