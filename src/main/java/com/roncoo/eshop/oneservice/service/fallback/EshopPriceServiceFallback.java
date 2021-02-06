package com.roncoo.eshop.oneservice.service.fallback;

import org.springframework.stereotype.Component;

import com.roncoo.eshop.oneservice.service.EshopPriceService;


@Component
public class EshopPriceServiceFallback implements EshopPriceService {

	public String findByProductId(Long productId) {
		return "降级价格数据";
	}

}
