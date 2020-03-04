package com.tinyApi.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.tinyApi.model.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {
	@NativeQuery("SELECT v FROM Vehicle v WHERE cityName = :cityName AND latitude BETWEEN :lowerLeftXCoord AND :upperRightXCoord AND "
			                            + "longitude BETWEEN :lowerLeftYCoord AND :upperRightYCoord AND " 
					                    + "v.companyZoneId IN :companyZoneId ORDER BY companyZoneId")
	List<Vehicle> findVehiclesByCity(String cityName, float lowerLeftXCoord, float upperRightXCoord, float lowerLeftYCoord,
			float upperRightYCoord, List<Integer> companyIds); 
}
