package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
	public static void main (String ars[])
	{
		List<String> strlist = new ArrayList<>();
		strlist.add("Apple ");
		strlist.add("Cherry ");
		strlist.add("Papaya ");
		strlist.add(0, "Orange ");
		strlist.add(1, "watermelon "); // first value is index 
		for(String name : strlist) {
			System.out.println(name);
				}
		Iterator<String> listItr = strlist.iterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		System.out.println("3rd Name is : "  + strlist.get(2) );
		System.out.println("Does Mango exist "  + strlist.contains("Mango"));
		System.out.println("Number of elements in list :  "  + strlist.size());
		strlist.remove("Papaya");
		System.out.println("Number of elements in list :  "  + strlist.size());
	}

}	
		
		
		

