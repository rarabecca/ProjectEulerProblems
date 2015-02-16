package com.rebeccaolson.multipleOf3and5;

import java.util.Set;
import java.util.TreeSet;

public class MultiplesOf3and5 {

	public static final int MAX_INTEGER = 1000;
	public static final int FIRST_MULTIPLE = 3;
	public static final int SECOND_MULTIPLE = 5;

	Set<Integer> set = new TreeSet<Integer>();
	
	private void findMultiple(int value) {
		
		for (int i = 1; i < MAX_INTEGER; i++) {
			if (i % value == 0) {
				set.add(i);
			}
		}
		System.out.println(set);
	}

	public Integer calculateSets() {		
		Integer sumOfSetValues = 0;
		
		for (Integer value : set) {
			sumOfSetValues += value;
		}
		return sumOfSetValues;
	}

	public static void main(String[] args) {
		MultiplesOf3and5 multipleCalculationRunner = new MultiplesOf3and5();

		multipleCalculationRunner.findMultiple(FIRST_MULTIPLE);
		multipleCalculationRunner.findMultiple(SECOND_MULTIPLE);
		Integer sum = multipleCalculationRunner.calculateSets();

		System.out.println("Result: " + sum);
	}

}
