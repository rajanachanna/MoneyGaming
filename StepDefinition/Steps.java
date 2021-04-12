package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;	

import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;


public class Steps {

	WebDriver driver;
	
	 	@Given("^I am a user to join gameaccount by selecting Join Now$")				
	    public void I_am_a_user_to_Join_gameaccount_by_selecting_Join_Now() throws Throwable							
	    {		
	        
	 		System.setProperty("webdriver.gecko.driver","C:\\automation\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
	    	
	        String baseUrl = "https://moneygaming.qa.gameaccount.com/";
	 		
	        // launch Fire fox and direct it to the Base URL
	        driver.get(baseUrl);
	        
	        //Select Join Now button
	        driver.findElement(By.xpath("//a[@href='/sign-up.shtml']")).click();
	        
        
	        
	    }		

	 	
	 	@When("^I Enter Title and FirstName and Surname$")
	 	 public void I_Enter_Title_and_FirstName_and_Surname() throws Throwable 							
	    {		
	           	
	            
	        WebElement cmbTitle = driver.findElement(By.id("title"));	
	        cmbTitle.sendKeys("Mr");
	        
	        WebElement txtFName = driver.findElement(By.id("forename"));	
	        txtFName.sendKeys("TestFNmae");
	        
	        WebElement txtSurname = driver.findElement(By.name("map(lastName)"));	
	        txtSurname.sendKeys("TestLName");
	        


	       
	    } 
	        
	 	
	 	@When("^I Accept terms and conditions$")
	 	public void I_Accept_terms_and_conditions() throws Throwable {
	 	  
	 	
	        WebElement checkTerms = driver.findElement(By.name("map(terms)"));	
	        checkTerms.click();
	        
	        
	        
	 	}
	 	
	 
	        @When("^I Enter Join Now$")
	        public void I_Enter_Join_Now() throws Throwable {
	 		driver.findElement(By.id("form")).click();	
	        }
	        
	        
	        
	    @Then("^I get validation error$")					
	    public void I_get_validation_error() throws Throwable 							
	    {    		
	        

	        String bodyText = driver.findElement(By.tagName("body")).getText();
	        Assert.assertTrue("This field is required", bodyText.contains("This field is required"));

  
	        

	        String actualString = driver.findElement(By.xpath("//label[@for='dob']")).getText();
	        Assert.assertTrue(actualString.contains("This field is required"));
	        
	        //close Fire fox
	        //driver.close();
	    	
	    	
	    }		

	
}
