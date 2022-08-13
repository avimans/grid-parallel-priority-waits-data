package TESTTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class priority {
//	@Test (priority = 0)
//	public void elephant() {
//		System.out.println("first");
//}
//=========================IMPORTANAT THINGS======================================//	
	/*	my assert will fail /because expected result us not equal to actual result
		
		*/
	@Test (priority = 0)
	public void elephant() 
	{
	Assert.assertEquals("suniul","Niharika");
		System.out.println("first");
    }
	
	
//	@Test(priority = 1)
//	public void lion() {
//		System.out.println("second");
//		
//	}
	
//	/*
//	 * /*	IF THEB METHG OD ELEPHANT IS PASSED THEN IT WILL EXECUTE ;LION
//		INCASE IF THE METHOD ELEPHANT IS FAILED //IT WILL NOT EEXECUTE
//		
	  @Test(priority = 1,dependsOnMethods = "Elephant",alwaysRun = true)
	public void lion() 
	  {
		System.out.println("second");
    	}
	  
	  
	@Test (priority = 3)
	public void tiger() {
		System.out.println("third");
		
	}
	
	@Test (priority = 4)
	public void butterfly() {
		System.out.println("fourth");
		
	}
//==================pPRIORITY QUESTION WILL BE IN ASSESMENT========================	
	/*when we writting in the MEthod it executes in alphabeticval order
	 * WHEN PRIOPTY IS GIVEN FROM 1-2 IT WILL START FIRST FROM NON PRIORITESD THEN TO PRIOTITESD
	 * IT IS A INTERVIEW QUESTION
	 * ASSESMENT QUESTION
	 * CHECK RUNNING TWO AT A TIME AND TO SEE REPORTS
	 *practicalyy it can be usedd in registartionb pages when we cxanmty to go
	 *next pagfes untill we fill one the first 
	 */
}
