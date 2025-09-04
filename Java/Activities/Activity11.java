package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
	public static void main (String ars[])
	{
		Map<Integer, String> colours = new HashMap<>();
		colours.put(100, "Red");
		colours.put(101, "Blue");
		colours.put(102, "Green");
		colours.put(103, "White");
		colours.put(104, "Balck");
		System.out.println(colours);
		for(java.util.Map.Entry<Integer, String> item: colours.entrySet())
		{
			System.out.println(item.getKey() + ": " + item.getValue());
			
			
		}
		colours.remove(104);
		System.out.println("Does Green exists " + colours.containsValue("Green"));
		System.out.println("Size of the map : " + colours.size());
	}
	

}
