package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

// D:\sujiselenium\Selenium\Cucumber\src\main\java\feature\CarWale.feature

// /scr/main/java/feature/CarWale.feature
@CucumberOptions(features = "D:\\sujiselenium\\Selenium\\Cucumber\\src\\main\\java\\feature\\CarWale.feature", glue="steps", monochrome= true, dryRun=true, 
             snippets = SnippetType.CAMELCASE)
public class CarWale extends AbstractTestNGCucumberTests{
	

}
