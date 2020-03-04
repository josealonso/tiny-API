package com.tinyApi.model;

import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor @Setter @Getter @ToString @EqualsAndHashCode
public class Vehicle {
	@Id @JsonIgnore
	private Long id;
	private String name;
	@JsonIgnore
	private String cityName;
	private float latitude;  // x coordinate. Its type would rather be BigDecimal.
	private float longitude; // y coordinate. Its type would rather be BigDecimal.
	private String licencePlate;
	private float range;
	private float batteryLevel;
	private int seats;
	private String model;
	private String resourceImageId;
	private float pricePerMinuteParking;
	private float pricePerMinuteDriving;
    private boolean realTimeData;
    private String engineType; // "DIESEL"
    private String resourceType; // "CAR",
    private int companyZoneId;  // 545
}
