package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
	public static void main(String[] args) {
		
		//Create an empty list
		List<Integer> intlist = new ArrayList<>();
		// create an scanner object
		
		Scanner scan = new Scanner(System.in);
		
		// create the random object
		Random rand = new Random();
		//Take user input and add the number to the list
		System.out.println("Enter the number to add the list");
		
		while(scan.hasNextInt()) {
			intlist.add(scan.nextInt());
			System.out.println("List of numbers " + intlist);
			
		}
		scan.close();
		//genearte a random index numbers
		
		int genIndex = rand.nextInt(intlist.size()-1);
		System.out.println("Generated index " + genIndex);
		System.out.println("value of index " + intlist.get(genIndex));
	}

}
