package org.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/consumer")
	public String dc() {
		String s = "";
		s+=restTemplate.getForObject("http://eureka-client/dc", String.class);
		return s;
	}
}