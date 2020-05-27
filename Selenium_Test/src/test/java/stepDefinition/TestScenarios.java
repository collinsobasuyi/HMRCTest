package stepDefinition;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestScenarios {
	public static WebDriver driver;



	@Given("^user is on \"([^\"]*)\" homepage$")
	public void user_is_on_homepage(String url) throws Throwable {
		System.setProperty("webdriver.chrome.driver","browserDrivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

	}

	@When("^user click Sign in CTA$")
	public void user_click_Sign_in_CTA() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign in")));
		elem.click();

	}

	@When("^enter random email$")
	public void enter_random_email() throws Throwable {

		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000); 

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email_create")));
		elem.sendKeys("hmrc-test-email" + randomInt +"@gmail.com");

	}

	@When("^click create an account CTA button$")
	public void click_create_an_account_CTA_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#SubmitCreate > span")));
		elem.click();


	}

	@Then("^user select a title$")
	public void user_select_a_title() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender2")));
		elem.click();

	}

	@Then("^user input \"([^\"]*)\" in first name text field$")
	public void user_input_in_first_name_text_field(String firstname) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_firstname")));
		elem.sendKeys(firstname);

	}

	@Then("^user input \"([^\"]*)\" in last name text field$")
	public void user_input_in_last_name_text_field(String lastname) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customer_lastname")));
		elem.sendKeys(lastname);

	}


	@Then("^user input \"([^\"]*)\" in password text field$")
	public void user_input_in_password_text_field(String password) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));
		elem.sendKeys(password);

	}

	@When("^select day from day drop down list$")
	public void select_day_from_day_drop_down_list() throws Throwable {

		//Thread.sleep(3000);

		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByValue("23");


	}

	@When("^select month from month drop down list$")
	public void select_month_from_month_drop_down_list() throws Throwable {

		Select day = new Select(driver.findElement(By.id("months")));
		day.selectByValue("9");


	}

	@When("^select year from year drop down list$")
	public void select_year_from_year_drop_down_list() throws Throwable {


		Select day = new Select(driver.findElement(By.id("years")));
		day.selectByValue("1984");



	}

	@When("^user input \"([^\"]*)\" in company text field in your address section$")
	public void user_input_in_company_text_field_in_your_address_section(String company) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("company")));
		elem.sendKeys(company);

	}

	@When("^user input \"([^\"]*)\" in addressone text field in your address section$")
	public void user_input_in_addressone_text_field_in_your_address_section(String address1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1")));
		elem.sendKeys(address1);

	}

	@When("^user input \"([^\"]*)\" in addresstwo text field in your address section$")
	public void user_input_in_addresstwo_text_field_in_your_address_section(String address2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address2")));
		elem.sendKeys(address2);

	}

	@When("^user input \"([^\"]*)\" in city text field in your address section$")
	public void user_input_in_city_text_field_in_your_address_section(String city) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
		elem.sendKeys(city);

	}

	@When("^select statename from state drop down list$")
	public void select_statename_from_state_drop_down_list() throws Throwable {
		Select day = new Select(driver.findElement(By.id("id_state")));
		day.selectByValue("2");

	}

	@When("^user input \"([^\"]*)\" in zipcode text field in your address section$")
	public void user_input_in_zipcode_text_field_in_your_address_section(String postcode) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("postcode")));
		elem.sendKeys(postcode);

	}

	@When("^select country from country drop down list$")
	public void select_country_from_country_drop_down_list() throws Throwable {
		  new Select(driver.findElement(By.id("id_state"))).selectByVisibleText("California");

	}

	@When("^user input \"([^\"]*)\" in additional information text field in your address section$")
	public void user_input_in_additional_information_text_field_in_your_address_section(String other) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("other")));
		elem.sendKeys(other);

	}

	@When("^user input \"([^\"]*)\" in home phone text field in your address section$")
	public void user_input_in_home_phone_text_field_in_your_address_section(String phone) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
		elem.sendKeys(phone);
	}

	@When("^user input \"([^\"]*)\" in mobile phone text field in your address section$")
	public void user_input_in_mobile_phone_text_field_in_your_address_section(String phone_mobile) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone_mobile")));
		elem.sendKeys(phone_mobile);

	}

	@When("^user input \"([^\"]*)\" in assign an address alias for future reference text field in your address section$")
	public void user_input_in_assign_an_address_alias_for_future_reference_text_field_in_your_address_section(String alias) throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("alias")));
		elem.sendKeys(alias);
	}

	@When("^click register button$")
	public void click_register_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#submitAccount > span")));
		elem.click();

	}
	
	@When("^click dresses menu$")
	public void click_dresses_menu() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.sfHover > a.sf-with-ul")));
		elem.click();
	}

	@When("^add most expensive dress$")
	public void add_most_expensive_dress() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("lbutton[name=\\\"Submit\\")));
		elem.click();
	}

	@When("^i log out$")
	public void i_log_out() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement elem;
		elem= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a.logout")));
		elem.click();
	}

	@When("^login$")
	public void login() throws Throwable {

	}

	@Then("^i can see my dress$")
	public void i_can_see_my_dress() throws Throwable {
;
	}



}
