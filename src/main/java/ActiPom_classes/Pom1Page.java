package ActiPom_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1Page {
	
	@FindBy(xpath="//input[@id='username']") private WebElement Username;
	@FindBy(xpath="//input[@name='pwd']")private WebElement Password;
	@FindBy(xpath="//div[text()='Login ']")private WebElement clickbtn;
	
	public Pom1Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterusername(String userid) {
		Username.sendKeys(userid);
	}
	public void enterpassword(String password) {
		Password.sendKeys(password);
	}
    public void clickbutton() {
		clickbtn.click();
	}
}
