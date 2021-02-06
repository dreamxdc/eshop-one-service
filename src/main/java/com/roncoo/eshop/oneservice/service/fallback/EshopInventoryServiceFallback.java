package com.roncoo.eshop.oneservice.service.fallback;

import org.springframework.stereotype.Component;

import com.roncoo.eshop.oneservice.service.EshopInventoryService;


@Component
public class EshopInventoryServiceFallback implements EshopInventoryService {
	
	public String findByProductId(Long productId) {
		return "降级库存数据";
	}

}
