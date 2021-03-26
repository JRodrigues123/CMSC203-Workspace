

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ManagementCompanyTestSTUDENT {
	
	//Created an object
	ManagementCompany mgmt;
	
	@Before
	public void setUp() throws Exception {
		
		/*
		 * I made mgmt into a company with some added parameters
		 */
		mgmt = new ManagementCompany("MGMT Company", "42068", 13);
		
		/*
		 * I will be adding three properties to mgmt
		 */
		
		//First property
		mgmt.addProperty("Station 1", "Hyattsville", 750, "Edwin");
		//Next one
		mgmt.addProperty("Station 2", "Riverdale", 690, "Adrian", 1, 2, 5, 4);
		//Last property
		mgmt.addProperty("Station 3", "Miami", 456, "Jacob", 15, 20, 11, 13);
		
		
		
	}

	@After
	public void tearDown() {
		mgmt = null;  
	}

	@Test
	public void testAddPropertyDefaultPlot() {
		
		//student should add property with 4 args & default plot (0,0,1,1)
		assertEquals(mgmt.addProperty("Station 1", "Hyattsville", 750, "Edwin"), 3);
		//student should add property with 8 args
		assertEquals(mgmt.addProperty("Station 2", "Riverdale", 691, "Adrian", 1, 1, 5, 4), 4);
		//student should add property that exceeds the size of the mgmt co array and can not be added, add property should return -1
		assertEquals(mgmt.addProperty("Station 2", "Miami", 456, "Jacob", 15, 20, 11, 13), -1);
	}
 
	@Test
	public void testMaxRentProp() {
		
		//This is to hold the info for maxRentProp in a String variable
		double maxRent = mgmt.maxRentProp();
		
		
		
	}

	@Test
	public void testTotalRent() {
		fail("STUDENT test not implemented yet");
		//student should test if totalRent returns the total rent of properties
	}

 }