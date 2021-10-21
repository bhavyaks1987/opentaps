package com.start.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		
	/*	Set<String> bk=new LinkedHashSet<String>(); // hastse- random value,treeset-ascii value.linked hashset-order vaue
		
		bk.add("bhavya");// get method will not be used in set as it gives random output.hashset-random,treeset-ascii,linked ahsh set-order
		bk.add("divya");
		bk.add("poo");
		bk.add("bhavya");

		System.out.println(bk); // to fetch all data //duplicate value will not written in set.
	
		// to fetch single item from set,convert set into list and use get function
		
		List<String> bk1=new ArrayList<String>(bk);//converting set into list 
		
	System.out.println(bk1.get(0)); //   */
		
		// will try with numbers
		
		//Set<Integer> bn=new LinkedHashSet<Integer>(); // outpot is 2400 3400 6400
		
		Set<Integer> st=new TreeSet<Integer>(); 
		st.add(2400);
		st.add(3400);
		st.add(6400);
		st.add(2400);  
		System.out.println(st);   // dupliacte will not be dispayed..prints entire data
		System.out.println(st.addAll(st));	
		
		//for(datatype varname : collection)
		
		for(int eachitem : st) {  // for each loop ..prints value one by one
			
			System.out.println(eachitem);
			
			// fetch single item by set
			
			List<Integer> lst=new ArrayList<Integer>(st); // puuting all set value from set to list to use get method
			
			System.out.println(lst.get(0));
			System.out.println(lst.get(1));
			lst.get(2);
		}
		
	}

}
