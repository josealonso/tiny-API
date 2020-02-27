package com.tinyApi.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor @Setter @Getter @ToString @EqualsAndHashCode
public class Vehicle {
	@Id
	private Long id;
	private String name;
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
