package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"D:/Suji/SLM/backup/sujiselenium/Selenium/Cucumber/src/main/java/feature/Shein.feature"}, 
glue= {"steps"},monochrome =true)
public class Shein extends AbstractTestNGCucumberTests {
}
