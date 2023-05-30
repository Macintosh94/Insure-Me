package com.project.insureme.InsureMe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InsureMeApplicationTests {

	@Test
	void contextLoads() {
	}

	
	
	@Test
     void testcreatepolicy() {
		Policy policy = new Policy(1,"Test","Individual",10000, "15-Dec-2017","15-Dec-2022");
		PolicyService pService = new PolicyService();
		//Policy outPutPolicy = pService.CreatePolicy();
		assertEquals(policy.getPolicyId(), pService.generateDummyPolicy().getPolicyId());
 	}

	@Test
	 void TestSearchPolicy() {
		PolicyService pService = new PolicyService();
		assertEquals(null,pService.searchPolicy());
	}
}

