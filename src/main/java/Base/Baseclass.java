package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	static Properties prop;
	public static WebDriver driver;
	public static String browserName;
	@BeforeTest
    public void loadConfig() throws Exception{
    	try {
        FileInputStream fis = new FileInputStream("C:\\Users\\muram.rani\\eclipse-workspace\\Cucumberframework11\\Configuration");
 prop = new Properties();
 prop.load(fis);
    	}
    	catch(FileNotFoundException e) {
    		e.printStackTrace();
    	}
    	catch (IOException e) {
    		e.printStackTrace();
    		}
    	}

	public static void LaunchApp() throws InterruptedException	{
    	WebDriverManager.chromedriver().setup();
   browserName = "chrome";
    	if( browserName.contains("chrome")) {
    		 driver = new ChromeDriver();
    	}
    	else if(browserName.contains("Firefox")) {
    		 driver = new FirefoxDriver();
    	}
    	else if(browserName.contains("IE")) {
    		 driver = new InternetExplorerDriver();
}
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}
}







