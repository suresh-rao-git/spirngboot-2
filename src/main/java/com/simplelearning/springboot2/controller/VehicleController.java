package com.simplelearning.springboot2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplelearning.springboot2.model.Vehicle;
import com.simplelearning.springboot2.registry.ServiceRegistry;

@RestController
@RequestMapping( "/vechile")
public class VehicleController {

	@Autowired
	ServiceRegistry serviceRegistry;
	
	@PostMapping
	public void processVehicleDetails(@RequestBody Vehicle vehicle) {
		serviceRegistry.getService(vehicle.getVechicleType()).process(vehicle);
	}
}
