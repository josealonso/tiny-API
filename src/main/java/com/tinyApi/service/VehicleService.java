package com.tinyApi.service;

import com.tinyApi.model.Vehicle;

import java.util.List;

public interface VehicleService {
	public List<Vehicle> findVehiclesByCity(String cityName, float lowerLeftXCoord, float upperRightXCoord, float lowerLeftYCoord,
			float upperRightYCoord, List<Integer> companyIds);
}
