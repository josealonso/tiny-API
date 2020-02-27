package com.tinyApi.controller;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tinyApi.model.Vehicle;
import com.tinyApi.service.VehicleService;
import com.tinyApi.utils.ExecutePeriodically;
import com.tinyApi.utils.Transformations;

@RestController
@RequestMapping("/apidev/meep.me/tripplan/api/v1/routers")
public class VehicleController {
	@Autowired
	private VehicleService vehicleService;

	@GetMapping(value = "/{cityName}/resources")
	public List<Vehicle> findVehiclesByCityController(@RequestParam(value = "lowerLeftLatLon", required = true) String lowerLeftBorder,
	                                         @RequestParam(value = "upperRightLatLon", required = true) String upperRightBorder,
	                                         @RequestParam(value = "companyZoneIds", required = false) String companyZoneIds) {
		List<Float> lowerLeftCoords = Transformations.convertCSVIntoAListOfDecimals(lowerLeftBorder);
		List<Float> upperRightCoords = Transformations.convertCSVIntoAListOfDecimals(upperRightBorder);
		List<Integer> companyIds = null;
		float lowerLeftXCoord = lowerLeftCoords.get(0);
		float lowerLeftYCoord = lowerLeftCoords.get(1);
		float upperRightXCoord = upperRightCoords.get(0);
		float upperRightYCoord = upperRightCoords.get(1);
		if (companyZoneIds.isEmpty() == false) {
			companyIds =  Transformations.convertCSVIntoAListOfIntegers(companyZoneIds);
		}
		return vehicleService.findVehiclesByCity(lowerLeftXCoord, upperRightXCoord, lowerLeftYCoord, upperRightYCoord, companyIds);
	}
	
}
