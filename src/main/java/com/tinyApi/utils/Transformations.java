package com.tinyApi.utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transformations {

	public static List<String> convertCSVIntoAListOfStrings(String rawString) {
		return Stream.of(rawString.split(",", -1)).collect(Collectors.toList());
	}

	public static List<Integer> convertCSVIntoAListOfIntegers(String rawString) {
		return Stream.of(rawString.split(","))
				  .map(String::trim)
				  .map(Integer::parseInt)
				  .collect(Collectors.toList());
	}

	public static List<Float> convertCSVIntoAListOfDecimals(String rawString) {
		return Stream.of(rawString.split(","))
				  .map(String::trim)
				  .map(Float::parseFloat)
				  .collect(Collectors.toList());
	}

}
