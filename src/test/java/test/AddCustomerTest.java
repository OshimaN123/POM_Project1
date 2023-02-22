package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomePage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTest {
	WebDriver driver;
	String UserName="demo@techfios.com";
	String PassWord="abc123";
	@Test
	public void userShouldBeAbleToAddCustomer() {
		driver=BrowserFactory.init();
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		loginPage.InsertUserName(UserName);
		loginPage.InsertPassword(PassWord);
		loginPage.clickOnSignInButton();
		DashboardPage dashboardPage=PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashBoardPage();
		dashboardPage.clickCustomerMenuElement();
		dashboardPage.clickAddCustomerMenuElement();
		AddCustomePage addCustomerPage=PageFactory.initElements(driver, AddCustomePage.class);
		addCustomerPage.validateAddContactPage();
	}

}
