package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ajioStepsDefinition
{
	@Given("Go to https:\\/\\/www.ajio.com\\/")
	public void goToHttpsWwwAjioCom() {
	    
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
	
		System.setProperty("silentoutput","SILENT");
	    driver.get("https://www.carwale.com/");
	    driver.manage().window().maximize();  
	    
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    
	}

	@Given("Mouseover on Women, CATEGORIES and click on Kurtas")
	public void mouseoverOnWomenCATEGORIESAndClickOnKurtas() {
	    
	    
	}

	@Given("Click on Brands and choose Ajio")
	public void clickOnBrandsAndChooseAjio() {
	    
	    
	}

	@Given("Check all the results are Ajio")
	public void checkAllTheResultsAreAjio() {
	    
	    
	}

	@Given("Set Sort by the result as Discount")
	public void setSortByTheResultAsDiscount() {
	    
	    
	}

	@Given("Select the Color and click ADD TO BAG")
	public void selectTheColorAndClickADDTOBAG() {
	    
	    
	}

	@Given("Verify the error message Select your size to know your estimated delivery date")
	public void verifyTheErrorMessageSelectYourSizeToKnowYourEstimatedDeliveryDate() {
	    
	    
	}

	@Given("Select size and click ADD TO BAG")
	public void selectSizeAndClickADDTOBAG() {
	    
	    
	}

	@Given("click on Enter pin-code to know estimated delivery date")
	public void clickOnEnterPinCodeToKnowEstimatedDeliveryDate() {
	    
	    
	}

	@Given("Enter the pincode as {int} and click Confirm pincode")
	public void enterThePincodeAsAndClickConfirmPincode(Integer int1) {
	    
	    
	}

	@When("Print the message and click Go to  Bag")
	public void printTheMessageAndClickGoToBag() {
	    
	    
	}

	@Then("Click on Proceed to Shipping and clode the browser")
	public void clickOnProceedToShippingAndClodeTheBrowser() {
	    
	    
	}


}
