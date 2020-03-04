package com.tinyApi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tinyApi.model.Vehicle;
import com.tinyApi.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;
	
	@Override
	public List<Vehicle> findVehiclesByCity(String cityName, float lowerLeftXCoord, float upperRightXCoord, float lowerLeftYCoord,
			float upperRightYCoord, List<Integer> companyIds) {
		return vehicleRepository.findVehiclesByCity(cityName, lowerLeftXCoord, upperRightXCoord, 
				                                    lowerLeftYCoord, upperRightYCoord, companyIds);
	}
}
