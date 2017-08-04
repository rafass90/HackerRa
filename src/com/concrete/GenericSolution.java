package com.concrete;

public class GenericSolution {

	public static void main(String[] args) {

		Integer[] numbers = {1,2,3};
		String[] texts = {"Hello", "Worlds"};


		printArrays(numbers);
		printArrays(texts);

	}

	private static void printArrays(Object[] texts) {
		for (Object nums : texts) {
			System.out.println(nums);
		}
	}
}
