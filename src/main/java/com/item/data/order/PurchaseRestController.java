package com.item.data.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.data.vendor.consume.VendorConsumer;

@RestController
@RequestMapping("/purchase")
public class PurchaseRestController {

	@Autowired
	private VendorConsumer vendor;  
	
		@GetMapping("/show")
		public String getData() {
			
			
			return vendor.getData();
		}

}
