package Actistep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ActiPom_classes.Pom1Page;
import ActiPom_classes.PomHomePage;
import io.cucumber.java.en.*;

public class StepDef {
	WebDriver driver=null; 
	Pom1Page p;
	PomHomePage ph;
	String actText;
	@Given("Open the browser")
	public void open_the_browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vrush\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	}

	@And("User on login page")
	public void user_on_login_page() {
	    driver.get("https://demo.actitime.com/login.do");
	}

	@When("^User enter (.*) and (.*)$")
	public void user_enter_admin_and_manager(String UN,String PWD) {
	    p=new Pom1Page(driver);
	    p.enterusername(UN);
	    p.enterpassword(PWD);
	}

	@And("Click on login btn")
	public void click_on_login_btn() {
	  p.clickbutton();	
	  }

	@Then("User should navigate on home page")
	public void user_should_navigate_on_home_page() {
		ph=new PomHomePage(driver);
		String expText="Enter Time-Track";
		String actText =ph.verifyuserid();
		if(actText.equals(expText)) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("TC is failed");
		}

	}
}
