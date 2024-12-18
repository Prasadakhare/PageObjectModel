package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LoginPage;
import pages.ProductListPage;

public class PlaceOrderTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductListPage listPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		listPage = new ProductListPage(driver);
		
	}
@BeforeTest
public void setup() {
	TestBase.openURL("https://www.saucedemo.com/");
	
}
@Test(priority =1)
public void loginTest() {
	loginPage.validLogin("standard_user", "secret_sauce");
}
@Test(priority =1)
public void addItemTest() {
	boolean isOnProductPage = listPage.isOnProducts();
	Assert.assertTrue(isOnProductPage);
	listPage.addToCart();
	listPage.ViewCart();
	//Assert.assertTrue(cartPage.isItemAdded());
}
}
