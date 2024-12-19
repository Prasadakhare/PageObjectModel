package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	@FindBy(id ="first-name")
	WebElement firstName;
	
	@FindBy(id ="last-name")
	WebElement lastName;
	
	@FindBy(id="postal-code")
	WebElement postlCode;
	
	@FindBy(id ="continue")
	WebElement continueBtn;
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	@FindBy(css ="h2.complete-header")
	WebElement successMsg;
	@FindBy(id="back-to-products")
	WebElement backToHomeBtn;
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void provideDetails(String strName, String strlName, String pCode) {
		
		firstName.sendKeys(strName);
		lastName.sendKeys(strlName);
		postlCode.sendKeys(pCode);
		continueBtn.click();
		
	}
	public void checkoutOrder() {
		finishBtn.click();
	}
	public boolean isOrderSuccess() {
		return successMsg.isDisplayed();
	}
	public void backtoHome() {
		backToHomeBtn.click();
	}
	

	
}
