package com.LearningSpring.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apple.eawt.Application;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
	  ApplicationContext SpringApplication.run(StoreApplication.class, args);
		var orderService = context.getBean(OrderService.class);
		//orderService.setPaymentService(new PayPalPaymentService());
		orderService.placeOrder();
	}
}
