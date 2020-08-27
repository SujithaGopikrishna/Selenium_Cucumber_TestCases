package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class bigbasketStepsDefinition {
	
	public ChromeDriver driver;

	@Given("Go to https:\\/\\/www.bigbasket.com\\/")
	public void goToHttpsWwwBigbasketCom() {
	    
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications-");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		//options.addArguments("--log-level=3");
		//options.addArguments("--silent");
		System.setProperty("safebrowsing.enable", "true");
		
		driver.get("https://www.bigbasket.com/");
	    driver.manage().window().maximize();  
	    WebDriverWait  wait = new WebDriverWait(driver,30);
	}

	@Given("mouse over on  Shop by Category")
	public void mouseOverOnShopByCategory() {
	    
	    
	}

	@Given("Go to Beverages and Fruit juices & Drinks")
	public void goToBeveragesAndFruitJuicesDrinks() {
	    
	    
	}

	@Given("Click on JUICES")
	public void clickOnJUICES() {
	    
	    
	}

	@Given("click Tropicana and Real under Brand")
	public void clickTropicanaAndRealUnderBrand() {
	    
	    
	}

	@Given("Check count of the products from each Brands and total count")
	public void checkCountOfTheProductsFromEachBrandsAndTotalCount() {
	    
	    
	}

	@Given("Check whether the products is availabe with Add button.")
	public void checkWhetherTheProductsIsAvailabeWithAddButton() {
	    
	    
	}

	@Given("Add the First listed available product")
	public void addTheFirstListedAvailableProduct() {
	    
	    
	}

	@Given("click on Change Address")
	public void clickOnChangeAddress() {
	    
	    
	}

	@Given("Select CHennai as City, Alandur{int},Chennai as Area  and click Continue")
	public void selectCHennaiAsCityAlandurChennaiAsAreaAndClickContinue(Integer int1) {
	    
	    
	}

	@Given("Mouse over on My Basket print the product name. count and price.")
	public void mouseOverOnMyBasketPrintTheProductNameCountAndPrice() {
	    
	    
	}

	@When("Click View Basker and Checkout")
	public void clickViewBaskerAndCheckout() {
	    
	    
	}

	@Then("Click the close button and close the browser")
	public void clickTheCloseButtonAndCloseTheBrowser() {
	    
	    
	}

}
