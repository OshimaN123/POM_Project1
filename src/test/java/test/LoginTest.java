package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	WebDriver driver;
	String UserName="demo@techfios.com";
	String PassWord="abc123";
	@Test
	public void validUserShouldBeAbleToLogIn() {
	driver=	BrowserFactory.init();
	LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
	loginPage.InsertUserName(UserName);
	loginPage.InsertPassword(PassWord);
	loginPage.clickOnSignInButton();
	DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
	dashboardPage.validateDashBoardPage();
	BrowserFactory.TearDown();
	
	}

}
