package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sheinStepsDefinition {
	public static RemoteWebDriver driver; 
	Actions builder; 
	
	@Given("Launchapp https://www.shein.in/")
	public void Launchapp() throws InterruptedException {
	    
        System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		
		System.setProperty("silentoutput","SILENT");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
	     driver = new ChromeDriver(option);		
		//1) open https://www.shein.in/
	    driver.get("https://www.shein.in/");
	    driver.manage().window().maximize();  
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    Thread.sleep(2000);
	   
	    
	    //closing the popoup
	    
	    driver.findElementByXPath("(//i[@class='iconfont icon-close she-close'])[21]").click();
	    Thread.sleep(2000);
	    
	}

	@Given("Mouseover on Clothing and click Jeans")
	public void mouseoverOnClothingAndClickJeans() throws InterruptedException {
		WebElement wb1 = driver.findElementByXPath("//span[text()='CLOTHING']");
	    Actions builder = new Actions(driver);
	    builder.moveToElement(wb1).build().perform();
	    Thread.sleep(2000);
	    
	    WebElement wb2 = driver.findElementByXPath("(//a[@title='Jeans'])[1]");
	    builder.click(wb2).build().perform();
	    Thread.sleep(2000);
	    System.out.println("jeans checking");
	    
	}

	@Given("Choose Black under Jeans product count")
	public void chooseBlackUnderJeansProductCount() throws InterruptedException {

	    WebElement selectblack = driver.findElementByXPath("//a[text()='Black']");
	    selectblack.click();
	    String setblack = driver.findElementByXPath("//div[@data-tag_id='4000112']").getText();
	    System.out.println(setblack);
	    
	    Thread.sleep(2000);
	    
	}

	@Given("check size as medium")
	public void checkSizeAsMedium() throws InterruptedException {
	    
		 driver.findElementByXPath("//span[text()='Size']").click(); ////span[text()='Size']//parent::li
		 Thread.sleep(2000);
		 driver.findElementByXPath("//a[@data-attr-value_id='417']").click();
	}

	@Given("Click + in color")
	public void clickInColor() throws InterruptedException {
		 driver.findElementByXPath("(//li[@class='filter-title leftnav-first-title'])[2]").click();
		 driver.findElementByXPath("(//li[@class='filter-title leftnav-first-title'])[2]").click();
		 System.out.println("checking whether it is black");
		 Thread.sleep(2000);
	    
	}

	@Given("check whether the color is black")
	public void checkWhetherTheColorIsBlack() {
		 String getcolor = driver.findElementByXPath("//span[@class='attr-item-pic j-attr-item']/a/span").getText();
		    System.out.println(getcolor);
		    
		    if (getcolor.contains("Black")) {
				System.out.println("Selected Colour in the filter: " + getcolor);
			} else { 
				System.out.println("Color is not matched in filter");
			}
	    
	}

	@Given("Click first item to Add to Bag")
	public void clickFirstItemToAddToBag() throws InterruptedException {
		builder.moveToElement(driver.findElementByXPath("(//div[@class='c-goodsitem__absolute j-sc-goodsitem'])[1]")).build().perform(); 
	    Thread.sleep(2000);
	    builder.click(driver.findElementByXPath("(//button[contains(text(),'Add to Bag')])[1]")).build().perform();
	    
	}

	@Given("Click the size as M abd click Submit")
	public void clickTheSizeAsMAbdClickSubmit() throws InterruptedException {
		 builder.moveToElement(driver.findElementByXPath("(//div[@class='c-goodsitem__absolute j-sc-goodsitem'])[1]")).build().perform(); 
			Thread.sleep(2000);
			builder.click(driver.findElementByXPath("//label[@class='opt-size j-quick-add-opt']//span[contains(text(),'M')]")).build().perform();
			builder.click(driver.findElementByXPath("(//button[contains(text(),'Submit')])[1]")).build().perform();
	    
	}

	@Given("Click view Bag")
	public void clickViewBag() throws InterruptedException {
		builder.moveToElement(driver.findElementByXPath("//div[@class='header-right-dropdown-ctn header-right-no-relative fast-cart-wrap j-fast-cart']")).build().perform();
	    Thread.sleep(2000);
	    builder.click(driver.findElementByXPath("//a[text()='view bag']")).build().perform(); 
	    Thread.sleep(3000);
	    
	}

	@When("Check the size is Medium or not")
	public void checkTheSizeIsMediumOrNot() throws InterruptedException {
	    
       String sizeDisplayed = driver.findElementByXPath("//span[@class='gd-size']//em").getText(); 
	    
	    if (sizeDisplayed.equalsIgnoreCase("M")) {
	    	System.out.println("Selected size is M."); 
	    } else { 
	    	System.out.println("Size is not M.");
	    }
	    
	    Thread.sleep(2000); 
	}

	@Then("Close the browser means sheinapplication")
	public void closeTheBrowser() {
		driver.quit();
	    
	}


}
