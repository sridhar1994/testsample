package websiteapplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends basepage {
	
	
		  @FindBy(xpath="//div/ul/li/a[@title=\\\"Women\\\"]")
		  private WebElement women;
		  
		  @FindBy(xpath = " //div/ul/li[2]/a[@title=\\\"dresses\\\"]")
		  private WebElement dress;
		  
		  @FindBy(xpath =" //div/ul/li[3]/a[@title=\\\" T-shirts\\\"]")
		  private WebElement tshirts;
		  
		  @FindBy(xpath = "//div/ul/li/a[@title=\"women\"] ")
		  private String womenclick;
		  
		  public homepage()
		  {
			  PageFactory.initElements(driver, this);
		  }
			  public WebElement women()
			  {
				  return women;
			  }
			  public WebElement dress()
			  {
				  return dress;
			  }
		       public WebElement tshirts()
		       {
		    	   return tshirts;
		       }
		       public void womenclick() {
		    	   women.click();}
		       public void dressclick() {
		    	   dress.click();}
		       public void tshirtsclick() {
		    	   tshirts.click();}       


}
