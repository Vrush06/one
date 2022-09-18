package ActiPom_classes;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomHomePage {
	
	@FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement actT;
	
	public PomHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyuserid() {
		String actId = actT.getText();
		return actId;
	}

}
