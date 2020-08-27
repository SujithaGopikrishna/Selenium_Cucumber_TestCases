package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "D:\\sujiselenium\\Selenium\\Cucumber\\src\\main\\java\\feature\\ajio.feature", glue="steps", monochrome= true, dryRun=true, 
snippets = SnippetType.CAMELCASE)
public class Ajio extends AbstractTestNGCucumberTests{}
