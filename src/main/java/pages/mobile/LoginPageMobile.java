package pages.mobile;

import org.openqa.selenium.By;

import core.BasePage;

public class LoginPageMobile extends BasePage{
	
	private By userTxt = By.xpath("//android.widget.EditText[@resource-id=\"br.com.kabum.webviewapp:id/login_input\"]");
	private By passwordTxt = By.xpath("//android.widget.EditText[@resource-id=\"br.com.kabum.webviewapp:id/password_input\"]");
	private By loginBtn = By.xpath("//android.widget.Button[@resource-id=\"br.com.kabum.webviewapp:id/button_login\"]");
	
	public void loginUser(String user, String password) {
		interactions.write(userTxt, user, "userTxt");
		interactions.write(passwordTxt, password, "passwordTxt");
		interactions.click(loginBtn, "loginBtn");
	}

}
