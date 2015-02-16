package com.rebeccaolson.evenfibonacci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EvenFibonacciSum {
	public static final Integer MAX_VALUE = 4000000;
	List<Integer> list = new ArrayList<Integer>();

	private void findEvenFibonacci(int max) {

		for (int i = 1; i < max; i++) {
			int sequenceValue;
			if (list.size() > 1) {
				sequenceValue = list.get(list.size() - 1)
						+ list.get(list.size() - 2);
				if (sequenceValue < max) {
					list.add(sequenceValue);
				}
			} else {
				list.add(i);
			}
			if (list.get(list.size() - 1) >= max) {
				break;
			}
		}

		findEvenNumbers();
	}

	private void findEvenNumbers() {
		for (Iterator<Integer> i = list.iterator(); i.hasNext();) {
			Integer value = i.next();
			if (value % 2 != 0) {
				i.remove();
			}
		}
	}

	public Long sumEvenFibonacci() {
		findEvenFibonacci(MAX_VALUE);
		Long sum = 0L;
		for (int i : list) {
			System.out.print(i + " ");
			sum += i;
		}

		return sum;
	}

	public static void main(String[] args) {
		EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();
		Long sum = evenFibonacciSum.sumEvenFibonacci();
		System.out.println("Sum: " + sum);
	}

}
