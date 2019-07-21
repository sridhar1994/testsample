package websitetestapp;

import org.testng.Assert;
import org.testng.annotations.Test;

import websiteapplication.basepage;
import websiteapplication.homepage;

public class homepagetest {
	
	homepage hp;
	basepage bp;
	
	
	public homepagetest()
	{
		hp = new homepage();
		bp=new basepage();
	}
    @Test
	public void verifytabs() {
	Assert.assertTrue(hp.elementFound(hp.women()));
	Assert.assertTrue(hp.elementFound(hp.dress()));
	Assert.assertTrue(hp.elementFound(hp.tshirts()));
	
	}
   @Test
public void verifyclick() {
	   hp.womenclick();
	   String gettitle = bp.getTitlte();
	   Assert.assertEquals(gettitle, "Women - My Store");
	   
	   hp.dressclick();
	   String gettitle1 = bp.getTitlte();
			   Assert.assertEquals(gettitle1, "dresses - My Store");
			   
		hp.tshirtsclick();
		String gettitle2 = bp.getTitlte();
		Assert.assertEquals(gettitle2, "T-shirts- My Store");
System.out.println();
   }
}




