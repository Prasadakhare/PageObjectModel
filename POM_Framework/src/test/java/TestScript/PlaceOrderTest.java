package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.TestBase;
import pages.CartPage;
import pages.CheckOutPage;
import pages.LoginPage;
import pages.ProductListPage;

public class PlaceOrderTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductListPage listPage;
	CartPage cartPage;
	CheckOutPage checkoutPage;
	
	public PlaceOrderTest() {
		TestBase.initDriver();
		driver = TestBase.getDriver();
		loginPage = new LoginPage(driver);
		listPage = new ProductListPage(driver);
		cartPage=new CartPage(driver);
		checkoutPage = new CheckOutPage(driver);
		
		
	}
@BeforeTest
public void setup() {
	TestBase.openURL("https://www.saucedemo.com/");
	
}
@Test(priority =1)
public void loginTest() {
	loginPage.validLogin("standard_user", "secret_sauce");
}
@Test(priority =2)
public void addItemTest() {
	boolean isOnProductPage = listPage.isOnProducts();
	Assert.assertTrue(isOnProductPage);
	listPage.addToCart();
	listPage.ViewCart();
	Assert.assertTrue(cartPage.isItemAdded());
}
@Test(priority =3)
public void checkOutPageCart() {
	cartPage.checkoutItems();
	checkoutPage.provideDetails("Test","user","23432");
	checkoutPage.checkoutOrder();
	checkoutPage.isOrderSuccess();
	checkoutPage.backtoHome();

}

}
