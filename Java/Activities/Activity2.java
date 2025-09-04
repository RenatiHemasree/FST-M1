package activities;

public class Activity2 {
	public static void main(String[] args) {
		int[] number = {10,77,10,54,-11,10};
		int sum=0;
		
		for (int i = 0; i < 6; i++) {
            if (number[i] == 10) {
                System.out.println("Found 10 at index: " + i);
                sum += number[i];
            }
        }
            System.out.println("Sum of all 10's: " + sum);
            if (sum == 30) {
                System.out.println("Sum is equal to 30");
            } else {
                System.out.println("Sum is NOT equal to 30");
            }
        }
    }

