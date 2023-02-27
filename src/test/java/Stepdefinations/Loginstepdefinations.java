package Stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginstepdefinations extends Baseclass {
public Loginstepdefinations() {
	 PageFactory.initElements(driver, this);

}
	@Given("User open the browser")
	public void user_open_the_browser() throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\muram.rani\\Downloads\\chromedriver108\\chromedriver.exe");

	driver = new ChromeDriver();
		driver.manage().window().maximize();
		LaunchApp();
	}

	@Given("User should be on LoginPage")
	public void user_should_be_on_login_page() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
System.out.println("sucessfully open");
	   }

	@When("^User should enters\" (.*)\" and\"(.*)\"$")

public void user_should_enters_username_and_password(String username,String password) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		
	    }

	@When("Click on Login")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

	}

	@Then("user should be on Homepage")
	public void user_should_be_on_homepage() {
		verifypagesourceelement();
driver.quit();
	}
public void verifypagesourceelement() {
boolean name=	 driver.getPageSource().contains("Employ Distribution by Sub Unit");
System.out.println(name);
}


}
