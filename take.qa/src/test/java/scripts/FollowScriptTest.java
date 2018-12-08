package scripts;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Test;


import pages.HomePage;


public class FollowScriptTest {
	WebDriver driver;
	HomePage homePage;

	@Before
	public void init() {
		if(driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"/Take/take.qa/src/test/java/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		driver.get("https://qadatake.wordpress.com/2018/07/12/the-journey-begins/");
		
	}
	
	@After
    public void close() {
		driver.quit();
    }
	
	@Test
	public void follow() throws Throwable{
		homePage = new HomePage();
		try {
        homePage.clickFollow();
        homePage.enterEmail("juliamartorelli@live.com");
        homePage.clickCadastre();
        if(homePage.getMessage() == "Você receberá um email com um link para confirmar sua assinatura. Se você não recebê-lo, ")
        	assertEquals("Você receberá um email com um link para confirmar sua assinatura. Se você não recebê-lo, ", homePage.getMessage());
        else
        	assertEquals("Você já possui uma assinatura pendente, acabamos de enviar outro email. Clique no link ou ", homePage.getMessage());
		} catch (Exception error) {
			error.getMessage();
		}
		
		
    }
	
        
       // return new HomePage(driver);
    
}