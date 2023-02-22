package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddCustomePage extends BasePage {
WebDriver driver;
public AddCustomePage(WebDriver driver) {
	
}
@FindBy (how=How.XPATH, using="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5")WebElement AddContact_Header_Element;

@FindBy (how=How.XPATH, using="//*[@id=\"account\"]")WebElement FullName_Element;
@FindBy (how=How.XPATH, using="//*[@id=\"cid\"]")WebElement Company_DropDown_Element ;
@FindBy (how=How.XPATH, using="//*[@id=\"email\"]")WebElement Email_Element;

public void validateAddContactPage() {
	Assert.assertTrue(AddContact_Header_Element.isDisplayed(), "AddContact Page Not Found!!");
}
public void insertFullName(String fullName) {
	
	FullName_Element.sendKeys(fullName+generateRandomNum(999));
}
public void insertEmail(String mail) {
	Email_Element.sendKeys(generateRandomNum(999)+mail);
	
}
public void selectCompany(String company) {

selectFromDropDown(Company_DropDown_Element, company );
}




}
