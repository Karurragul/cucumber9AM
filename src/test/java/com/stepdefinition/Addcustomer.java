package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addcustomer {
	static WebDriver driver;
	@Given("user should be in telecom homepage")
	public void user_should_be_in_telecom_homepage() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\user\\\\eclipse-workspace\\\\ragul\\\\Selenium\\\\driver\\\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://www.demo.guru99.com/telecom/");
	}

	@Given("User click the add customer")
	public void user_click_the_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();		
	}

	/*@When("User should provide valid details")
	public void user_should_provide_valid_details() {
		
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys("aaa");
	driver.findElement(By.id("lname")).sendKeys("bbb");
	driver.findElement(By.id("email")).sendKeys("ccc@gmail.com");
	driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys("chennai");
	driver.findElement(By.id("telephoneno")).sendKeys("12345678");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	}*/

	///** scenario outline
	@When("User should provide valid details{string},{string},{string},{string},{string}")
	public void user_should_provide_valid_details(String fname, String lname, String email, String address, String mobile) {
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(address);
		driver.findElement(By.id("telephoneno")).sendKeys(mobile);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}


	/*//****onedlist
	@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
		List<String> list = dataTable.asList();
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(list.get(0));
		driver.findElement(By.id("lname")).sendKeys(list.get(1));
		driver.findElement(By.id("email")).sendKeys(list.get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(list.get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(list.get(4));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
	
	//***onedlist
	
	//***onedmap
	@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> map = dataTable.asMap(String.class, String.class);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(map.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(map.get("lname"));
		driver.findElement(By.id("email")).sendKeys(map.get("mail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(map.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(map.get("phone"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();   
	}
	*/
	//***onedmap
	
	//***twodlist - inner list [row] and outer list [column]
	/*@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable twodlists) {
	    List<List<String>> twodlist = twodlists.asLists(String.class);
	
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(twodlist.get(1).get(0));
		driver.findElement(By.id("lname")).sendKeys(twodlist.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(twodlist.get(1).get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twodlist.get(1).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(twodlist.get(1).get(4));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	}
*/ 
	//***twodlist
	
	//***twodmap map :- key [column name], value[ by index, it will calculate]
	/*@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable twodmaps) {
	    List<Map<String, String>> twodmap = twodmaps.asMaps(String.class,String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(twodmap.get(1).get("fname"));
		driver.findElement(By.id("lname")).sendKeys(twodmap.get(1).get("lname"));
		driver.findElement(By.id("email")).sendKeys(twodmap.get(1).get("gmail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twodmap.get(1).get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(twodmap.get(1).get("phone"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		}*/
	//***twodmap
	
	@Then("Customer id is generated")
	public void customer_id_is_generated() {
		Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}


}
