package org.report;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBWithPojo extends HelperClass{
	public FBWithPojo() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement email;
	@FindBy(id="pass")
	private WebElement pass;
    @FindBy(name="login")
	private WebElement login;
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPass() {
		return pass;
	}
	public void setPass(WebElement pass) {
		this.pass = pass;
	}

}
