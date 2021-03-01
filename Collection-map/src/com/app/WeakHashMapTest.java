package com.app;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {

		 Country country=new Country();
		 country.setCname("India");
		 
		 HashMap hm=new HashMap();
		 hm.put(country,"Maharashtra");
		 
		 country=null;
		 System.gc();
		 System.out.println(hm);

		 System.out.println("__________________________________");
		 
		 WeakHashMap whm=new WeakHashMap();
		 whm.put(country,"Maharashtra");
		 
		 country=null;
		 System.gc();
		 System.out.println(whm);
	}

}
