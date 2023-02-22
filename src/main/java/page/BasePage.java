package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	public int generateRandomNum(int boundNum) {
		Random rnd=new Random();
		int generateNum=rnd.nextInt(boundNum);
		return generateNum;
	}
	public void selectFromDropDown(WebElement Element, String visibleText ) {
		Select sel=new Select(Element);
		sel.deselectByVisibleText(visibleText);
	}


}
