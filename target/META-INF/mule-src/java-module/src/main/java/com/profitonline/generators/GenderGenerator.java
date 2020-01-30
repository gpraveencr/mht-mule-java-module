package com.profitonline.generators;


import java.util.Random;

public final class GenderGenerator {
	private final static String MALE = "MA";
	private final static String FEMALE = "FE";
	
	private static Random random = new Random(System.currentTimeMillis());

	public static String  generate() {
		System.out.println("Request is in GenderGenerator.generate() method");
		return random.nextBoolean() ? MALE : FEMALE;
	}

}