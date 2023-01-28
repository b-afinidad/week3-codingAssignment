package week3;

import java.util.Arrays;

public class Week3CodingAssignment {

	public static void main(String[] args) {
		
		
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code).
		//Print the result to the console
		
		int lastElement = ages[ages.length - 1];
		int firstElement = ages[0];
		int result = lastElement - firstElement;
		System.out.println(result);
		
		//Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths
		
		ages = Arrays.copyOf(ages,  ages.length + 1);
		ages[ages.length - 1] = 32;
		lastElement = ages[ages.length - 1];
		firstElement = ages[0];
		result = lastElement - firstElement;
		System.out.println(result);
		
		//Use a loop to iterate through the array and calculate the average age. Print the result to the console
		
		int sum = 0;
		for (int i = 0; i < ages.length; i++ ) {
			sum += ages[i];
		}
		double average = (double) sum / ages.length;
		System.out.println(average);
		
		//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		//Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		
		int totalLetters = 0;
		for (String name : names) {
		    totalLetters += name.length();
		}
		double averageLetters = (double) totalLetters / names.length;
		System.out.println(averageLetters);

		//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		
		String allNames = "";
		for (String name : names) {
		    allNames += name + " ";
		}
		System.out.println(allNames);
		
		//Create a new array of int called nameLengths. 
		
		int[] nameLengths = new int[names.length];
		
		
		//Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
		//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		//Print the result to the console
		
		int sumNameLengths = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sumNameLengths += nameLengths[i];
		}
		System.out.println(sumNameLengths);
		
		System.out.println(multiplyString("Hello", 3));	
		
		String firstName = "B";
		String lastName = "Afinidad";		
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		
		
		int[] myArray = new int[3];
		myArray[0] = 69;
		myArray[1] = 33;
		myArray[2] = 11;
		
		System.out.println(isSumGreaterThan100(myArray));
		
		double[] grades = new double[5];
		grades[0] = 88.7;
		grades[1] = 92.5;
		grades[2] = 100;
		grades[3] = 67.3;
		grades[4] = 78.9;
		
		System.out.println(calculateAverage(grades));
		
		double[] arr1 = {1.5, 2.5, 3.5, 4.5, 5.5};
		double[] arr2 = {0.5, 1.5, 2.5, 3.5, 4.5};

		boolean answer = isFirstArrayAvgGreater(arr1, arr2);
		System.out.println(answer);

		boolean isHot = true;
		double money = 20;
		boolean buyDrink = willBuyDrink(isHot, money);
		System.out.println(buyDrink);
		
	}
		//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		
		public static String multiplyString(String str, int num) {
			String result = "";
			for(int i = 0; i < num; i++) {
				result += str;
			}
			return result;
		}
		
		//Write a method that takes two Strings, firstName and lastName, and returns a full name. the full name should be the first and last name as a String separated by a space.
		
		public static String createFullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		}
		
		//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		
		public static boolean isSumGreaterThan100(int[] arr) {
			int sum = 0;
			for (int i : arr) {
				sum += i;
			}
			return sum > 100;
		}
		//Write a method that takes an array of double and returns the average of all the elements in the array.
		
		public static double calculateAverage(double[] numbers) {
			double sum = 0;
			for (double number : numbers) {
				sum += number;
			}
			return sum / numbers.length;
		}
		
		//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
		public static boolean isFirstArrayAvgGreater(double[] arr1, double[] arr2) {
			double avg1 = 0, avg2 = 0;
			for (double d : arr1) {
				avg1 += d;
			}
			avg1 = avg1 / arr1.length;
			for (double d : arr2) {
				avg2 += d;
			}
			avg2 = avg2 / arr2.length;
			return avg1 > avg2;
		}
		
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		    return isHotOutside && moneyInPocket > 10.50;
		}

		
		//Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		//This method takes in three double parameters, representing the total results of the Macau Room, Lotus Room and VIP Room and returns the sum of the three.
		//I created this method to automate the task of adding up total results for the high limit baccarat section at Bicycle Casino.
		
		public static double totalResults( double macauRoom, double lotusRoom, double vipRoom) {
			return macauRoom + lotusRoom + vipRoom;
		}

}
