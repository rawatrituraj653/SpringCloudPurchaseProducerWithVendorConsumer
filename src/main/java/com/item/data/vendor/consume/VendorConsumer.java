package com.item.data.vendor.consume;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class VendorConsumer {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private LoadBalancerClient client;
	
	public String getData(){
			
		ServiceInstance instance=client.choose("Vendor-MODE");
		URI uri= instance.getUri();
		String URL=uri+"/vendor/msg";
			
		
		return restTemplate.getForEntity(URL, String.class).getBody();
	}
	
	
}
