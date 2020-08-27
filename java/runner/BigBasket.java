package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="D:\\\\sujiselenium\\\\Selenium\\\\Cucumber\\\\src\\\\main\\\\java\\\\feature\\\\BigBasket.feature" , glue="steps", monochrome=true, dryRun=true, 
snippets = SnippetType.CAMELCASE)
public class BigBasket extends AbstractTestNGCucumberTests{
	
}

