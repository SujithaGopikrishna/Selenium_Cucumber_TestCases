package steps;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class carwaleStepsDefiniton {
	
	public ChromeDriver driver;
	
	@Given("Launch https:\\/\\/www.carwale.com\\/")
	public void launchHttpsWwwCarwaleCom() {
		System.setProperty("WebDriver.chrome.driver", "./drivers./chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
	
		System.setProperty("silentoutput","SILENT");
	    driver.get("https://www.carwale.com/");
	    driver.manage().window().maximize();  
	}

	@Given("Click on Used")
	public void clickOnUsed() {
	    driver.findElementByXPath("//li[@data-tabs='usedCars']").click();
	}

	@Given("Select the City as Chennai")
	public void selectTheCityAsChennai() throws InterruptedException {
	    driver.findElementById("usedCarsList").sendKeys("chennai", Keys.TAB);
	    Thread.sleep(2000);
	}

	@Given("Select budget min \\({int}L) and max\\({int}L) and Click Search")
	public void selectBudgetMinLAndMaxLAndClickSearch(Integer int1, Integer int2) throws InterruptedException {
	    driver.findElementById("budgetBtn").click();
	    WebElement minprize = driver.findElementById("minPriceList");
	    driver.findElementByXPath("//li[text()='8 Lakh']").click();

	    WebElement maxprize = driver.findElementById("maxPriceList");
	    driver.findElementByXPath("(//li[text()='12 Lakh'])[2]").click();

        driver.findElementByXPath("//button[@id='btnFindCar']").click();
        Thread.sleep(2000);

	}

	@Given("Select Cars with Photos under Only Show Cars With")
	public void selectCarsWithPhotosUnderOnlyShowCarsWith() {
	    driver.findElementByXPath("//span[text()='Cars with Photos']").click();
	    
	}

	@Given("Select Manufacturer as Hyundai --> Creta")
	public void selectManufacturerAsHyundaiCreta() {
	    
	    
	}

	@Given("Select Fuel Type as Petrol")
	public void selectFuelTypeAsPetrol() {
	    
	    
	}

	@Given("Select Best Match as KM: Low to High")
	public void selectBestMatchAsKMLowToHigh() {
	    
	    
	}

	@Given("Validate the Cars are listed with KMs Low to High")
	public void validateTheCarsAreListedWithKMsLowToHigh() {
	    
	    
	}

	@Given("Add the least KM ran car to Wishlist")
	public void addTheLeastKMRanCarToWishlist() {
	    
	    
	}

	@Given("Go to Wishlist and Click on More Details")
	public void goToWishlistAndClickOnMoreDetails() {
	    
	    
	}

	@When("Print all the details under Overview in the Same way as displayed in application")
	public void printAllTheDetailsUnderOverviewInTheSameWayAsDisplayedInApplication() {
	    
	    
	}

	@Then("Close the browser")
	public void closeTheBrowser() {
	    
	    
	}

}
