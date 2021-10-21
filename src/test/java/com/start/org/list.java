package com.start.org;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		/*List<Integer> mk=new ArrayList<Integer>(); // list is used because dymanic value can be given(in arrary static value...so inlist n no of inputs can be given during run time)
		
		mk.add(3000);
		mk.add(4000);
		mk.add(1000);
		System.out.println(mk.size());
		System.out.println(mk);
		mk.remove(0);
		System.out.println(mk);
*/
	List<String> bs=new ArrayList<String>();	//list allows duplicate values
	
	bs.add("bhavya");
	bs.add("divya");
	bs.add("poo");
	bs.add("bhavya");
	System.out.println(bs);
	//bs.remove(0);
	bs.remove("poo");
	System.out.println(bs);
	//bs.clear();
	System.out.println(bs);
	System.out.println(bs.get(0));
	System.out.println(bs.contains("divya"));
	System.out.println(bs.isEmpty());
	}

}
