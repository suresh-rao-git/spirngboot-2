package com.simplelearning.springboot2.service;

import org.springframework.stereotype.Service;

import com.simplelearning.springboot2.model.Vehicle;
import com.simplelearning.springboot2.registry.AdapterService;

@Service("Bike")
public class BikeService  implements AdapterService<Vehicle>{

	@Override
	public void process( Vehicle  vehicle) {
		System.out.println( "INside BIKE service  " + vehicle);
	}
}
