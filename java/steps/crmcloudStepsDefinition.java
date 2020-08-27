package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class crmcloudStepsDefinition {

	@Given("https:\\/\\/demo{double}crmcloud.com\\/")
	public void httpsDemoCrmcloudCom(Double double1) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.1crmcloud.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebDriverWait  wait = new WebDriverWait(driver,30);
	    
	}

	@Given("Give username as admin and password as admin")
	public void giveUsernameAsAdminAndPasswordAsAdmin() {
	    
	    
	}

	@Given("Choose theme as Claro Theme")
	public void chooseThemeAsClaroTheme() {
	    
	    
	}

	@Given("Go to Sales and Marketting and click Sales Home")
	public void goToSalesAndMarkettingAndClickSalesHome() {
	    
	    
	}

	@Given("Click Create contact")
	public void clickCreateContact() {
	    
	    
	}

	@Given("Select Title and type First name, Last Name, Email and Phone Numbers")
	public void selectTitleAndTypeFirstNameLastNameEmailAndPhoneNumbers() {
	    
	    
	}

	@Given("Select Lead Source as Public Relations and Business Roles")
	public void selectLeadSourceAsPublicRelationsAndBusinessRoles() {
	    
	    
	}

	@Given("Fill the Primary Address, City, State, Country and Postal Code and click Save")
	public void fillThePrimaryAddressCityStateCountryAndPostalCodeAndClickSave() {
	    
	    
	}

	@Given("Click create and Leads")
	public void clickCreateAndLeads() {
	    
	    
	}

	@Given("Fill First & Last name, Status as In Process, Title as Manager and Department as Sales")
	public void fillFirstLastNameStatusAsInProcessTitleAsManagerAndDepartmentAsSales() {
	    
	    
	}

	@Given("Select Lead as Public Relations and fill department, Email and Phone Number")
	public void selectLeadAsPublicRelationsAndFillDepartmentEmailAndPhoneNumber() {
	    
	    
	}

	@Given("Click Save and View")
	public void clickSaveAndView() {
	    
	    
	}

	@Given("Mouse over on Today's Activities and click Meetings")
	public void mouseOverOnTodaySActivitiesAndClickMeetings() {
	    
	    
	}

	@Given("Type Subject as Project Status Status as Planned and Time as tomorrow {int} p.m")
	public void typeSubjectAsProjectStatusStatusAsPlannedAndTimeAsTomorrowPM(Integer int1) {
	    
	    
	}

	@Given("Click Add paricipants, add your created Lead name and click Save")
	public void clickAddParicipantsAddYourCreatedLeadNameAndClickSave() {
	    
	    
	}

	@When("Click contacts under Sales and Marketting, search the lead Name and click the name from the result")
	public void clickContactsUnderSalesAndMarkettingSearchTheLeadNameAndClickTheNameFromTheResult() {
	    
	    
	}

	@Then("Check weather the Meeting is assigned to the contact.")
	public void checkWeatherTheMeetingIsAssignedToTheContact() {
	    
	    
	}


	
	
	
	
}
