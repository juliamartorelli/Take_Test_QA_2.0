package pages;

import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	static WebDriver driver;

    @FindBy(xpath="//div[@class='actnbr-action actnbr-actn-follow']")
    private WebElement followButton;
    
    @FindBy(xpath="//div[@class='actnbr-email-field']")
    private WebElement email;
    
    @FindBy(xpath="//div[@class='actnbr-button-wrap']")
    private WebElement cadastreButton;
    
    @FindBy(xpath="//div[@class='actnbr-message']")
    private WebElement message;
    
    public HomePage(WebDriver driver){
    	HomePage.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    public HomePage() {
    	PageFactory.initElements(driver, this);
    }
    
    public void clickFollow(){
        followButton.click();
    }
    
    public void enterEmail(String email){
        this.email.clear();
        this.email.sendKeys(email);
    }
    
    public void clickCadastre(){
        cadastreButton.click();
    }
    
    public String getMessage(){
        return message.getText();
    }


   
}
