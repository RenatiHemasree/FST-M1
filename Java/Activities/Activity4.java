package activities;

import java.util.Arrays;

public class Activity4 {
	public static void ascendingSort(int[] array) {
        int n = array.length;

     
        for (int i = 1; i < n; i++) {
            int key = array[i];   
            int j = i - 1;

            
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

          
            array[j + 1] = key;
        }
	}
	

	public  static void main(String[] args)
	{
	int num[]	= {12,31,9,12,78,20};
	ascendingSort(num);
	System.out.println("sorted array in ascending order: ");
	System.out.println(Arrays.toString(num));
	
	}

	
}
