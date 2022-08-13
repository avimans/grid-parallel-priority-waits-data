package TESTTNG;

import org.testng.annotations.Test;

public class demoo2 {
/*	smoke testing and regresssion testing
	inn a anew build // if i want to chevk all the critical features are working we will thwn gob to smoke
	//if if find a defect and when developer fix it 
	//if i rereun the entire applicvation to check all other features are working fine we ggob foir regressuion
	whwen i run i should run only smoke test
	or shoulld runb only tregression
	if it is a normal xml we can run multiplken but it is s 
	GROUP XML we cant run multiple class
	HERE WE ARE RUNNING MULTIPLE TEST CASES IN A GRUOP
	*/
	@Test ( groups="smoke",priority=0)
	public void testcase1() {
		System.out.println("smoke test");
		
	}
	
	@Test ( groups="regression",priority=1)
	public void testcase2() {
		System.out.println("regression testing second");
		
	}
	@Test ( groups="smoke",priority=1)
	public void testcase3() {
		System.out.println("smoke test second");
		
	}
	@Test ( groups="regression",priority=0)
	public void testcase4() {
		System.out.println("regression testing");
		
	}
//========================PARALLEL TESTING====================================
}
