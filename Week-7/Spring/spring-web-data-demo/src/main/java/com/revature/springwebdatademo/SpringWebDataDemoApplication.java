package com.revature.springwebdatademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.springwebdatademo.services.RestaurantService;

@SpringBootApplication
public class SpringWebDataDemoApplication implements CommandLineRunner {
	@Autowired
	private RestaurantService rService;

	public static void main(String[] args) {
		SpringApplication.run(SpringWebDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(rService.getAllRestaurants());
		System.out.println(rService.getRestaurantById(5).get());
		System.out.println(rService.getRestaurantByName("Basilisk"));
	}

}
