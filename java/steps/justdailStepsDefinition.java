package steps;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class justdailStepsDefinition {
	
	public static ChromeDriver driver;
	WebDriverWait wait;
	int priceV;
	
	@Given("Launch https://www.justdial.com/")
	public void Launchapp() throws InterruptedException {
	    
        System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		System.setProperty("silentoutput","SILENT");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);		
	    driver.get("https:/www.justdial.com/");
	    driver.manage().window().maximize();  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    Thread.sleep(2000);
	    
	}

	@Given("Cick on Air Tickets")
	public void cickOnAirTickets() {
		driver.findElementById("hotkeys_text_4").click();
	    driver.findElementById("departure").sendKeys("Chennai");
	    
	}

	@Given("Type Chennai and choose Chennai")
	public void typeChennai() {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//li[text()='Chennai, IN - Chennai Airport (MAA)']")));
	    driver.findElementByXPath("//li[text()='Chennai, IN - Chennai Airport (MAA)']").click();
	    
	}

	@Given("Type Toronto and select Toronto")
	public void typeToronto() {
		wait = new WebDriverWait(driver, 30);
		driver.findElementById("arrival").sendKeys("Toronto");
	    wait.until(ExpectedConditions.elementToBeClickable(driver.findElementByXPath("//li[text()='Toronto, CA - Toronto City Centre Airport (YTZ)']")));
	    driver.findElementByXPath("//li[text()='Toronto, CA - Toronto City Centre Airport (YTZ)']").click();
	    System.out.println("checking ");
	    
	}

	@Given("Set Departure")
	public void setDepartureAsJuly() {
		driver.findElementById("departDate").click();
	    driver.findElementByXPath("//span[@class='ui-icon ui-icon-circle-triangle-e']").click();
	    driver.findElementByXPath("//a[text()='30']//parent::td").click();
	    
	}

	@Given("Add AdulttwoChildrenone click and Search")
	public void addAdultChildrenClickAndSearch() throws InterruptedException {
		driver.findElementByXPath("//span[@onclick='paxSelAdults.increment();']").click();
	    driver.findElementByXPath("//span[@onclick='paxSelChildren.increment();']").click();
	    driver.findElementByXPath("//input[@value='SEARCH']").click();
	    System.out.println("Chennai - Toronto ->2Adult1child");
	    Thread.sleep(2000);
	}

	@Given("Select Air Canada from multi-airline itineraries")
	public void selectAirCanadaFromMultiAirlineItineraries() {
		driver.findElementByXPath("//label[text()='Air Canada(AC)']").click();
	    
	}

	@Given("Click on Price to sort the result")
	public void clickOnPriceToSortTheResult() {
		driver.findElementById("priceSort").click();
	   
	}

	@Given("Click on +Details of first result under Price")
	public void clickOnDetailsOfFirstResultUnderPrice() throws InterruptedException {
		 driver.findElementByXPath("//a[@id='resTD1']").click();
		 Thread.sleep(2000);
	    
	}

	@Given("Capture the Flight Arrival times")
	public void captureTheFlightArrivalTimes() throws InterruptedException {
		System.out.println("Arrival time for the first resulting fight details");
		   List<WebElement> arrivalTimes = driver.findElementsByXPath("//td[@id='result1td1']//td[6]"); 
		    
		    for (int i = 0; i < arrivalTimes.size(); i++) 
		    {
		    	System.out.println(arrivalTimes.get(i).getText()); 
			} 
		    Thread.sleep(3000);
	    
	}

	@Given("Capture the total price in a list and Click on Book")
	public void captureTheTotalPriceInAListAndClickOnBook() throws InterruptedException {
		System.out.println("**********************************");
	    System.out.println("Total Price details");
	    WebElement pricevalue = driver.findElementByXPath("//tr[@id='result1tr1']//td[5]//span[1]");
	    priceV = Integer.parseInt(pricevalue.getText());
	    System.out.println(priceV);	    
	   
	    driver.findElementByXPath("//tr[@id='result1tr1']//td[6]").click(); 
	    Thread.sleep(3000);
	    
	}

	@When("Capture the Airport name base on the list of time")
	public void captureTheAirportNameBaseOnTheListOfTime() throws InterruptedException {
		System.out.println("***************List of airportname at Odd place*******************");
	    List <WebElement> airportnameOdd = driver.findElementsByXPath("//table[@id='innerDiv']//tr[@class='childText']//td[2]");
	    for(int i=0 ; i <airportnameOdd.size();i++)
	    {
	    System.out.println(airportnameOdd.get(i).getText());
	    }
	    Thread.sleep(3000);
	    
	    System.out.println("***************List of airportname at even place*******************");
	    List<WebElement> airportnameEven = driver.findElementsByXPath("//table[@id='innerDiv']//tr[@class='childText']//td[4]");
	    for(int j=0;j<airportnameEven.size();j++)
	    {
	    	System.out.println(airportnameEven.get(j).getText());
	    }
	    Thread.sleep(3000);
	    
	}

	@Then("Captur the total fare and print the difference amount from previous total price")
	public void capturTheTotalFareAndPrintTheDifferenceAmountFromPreviousTotalPrice() {
		System.out.println("*****************Total Fare*****************");
	    WebElement TotalFare = driver.findElementByXPath("//span[@id='totalFare']");
	    int totalF = Integer.parseInt(TotalFare.getText());
	    System.out.println(totalF);
	    
	    int DifAmount;
        DifAmount = totalF - priceV ;
        System.out.println("*********Difference Value in price amount*********");
        System.out.println(DifAmount);
        System.out.println("*****************Taskcomplete*****************");
        driver.close();
	}
}
