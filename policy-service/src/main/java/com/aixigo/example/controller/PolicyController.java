package com.aixigo.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aixigo.example.entity.Policy;

@RestController
public class PolicyController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	Policy createPolicyForUserId(long userId) {
		return null;
	}
	
	@RequestMapping("/policy")
	Policy getPolicyByUserId(@RequestParam(name = "userid", defaultValue = "1") long userId) {
		logger.info("Getting policy by userid {}", userId);
		Policy policy = new Policy();
		policy.setId(1L);
		policy.setUserId(1L);
		policy.setPolicyContent("Lebensversicherung");
		return policy;
	}
	
	List<Policy> getAllPolicies() {
		return null;
	}

}
