package com.test.funn;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class TestJunitFunc extends FunctionalTestCase{

	   @Test
	    public void junitflow() throws Exception {
	   
		   runFlowAndExpect("new-junit-flow", "test");
	    }
	
	@Override
   protected String getConfigFile(){
     return "mule-hello-functional-test-app.xml";
   }
	
}
