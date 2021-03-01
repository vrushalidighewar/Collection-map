package com.app;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.Map;

public class IdentityHashMapTest {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put(1, "abc");
		hm.put("a", 123);
		// hm.clear();

		  /*System.out.println(hm);
		  System.out.println(hm.clone()); 
		  System.out.println(hm.get(1));
		  System.out.println(hm.get("a")); 
		  System.out.println(hm.containsKey(1));     //true 
		  System.out.println(hm.containsValue(123));
		 */
		System.out.println("______________________________");
		
		Set s = hm.keySet();      // keySet()---return only keys
		for (Object key : s) {
			System.out.println(key);
			Object obj = hm.get(key);
			System.out.println(obj);
		}
		System.out.println("______________________________");
		
		Set s1=hm.entrySet();      //return key value -Map.Entry:key,value
		for(Object object : s1) {
			Map.Entry me=(Map.Entry) object;
			System.out.println(me.getKey()+   " "  +me.getValue());
		}
		
		System.out.println("__________Equality check in hashmap___________");
		   
		HashMap hm1=new HashMap();
		hm1.put("abc",15);
		hm1.put(new String("abc"),30);
        System.out.println(hm1);
		
		System.out.println("______Equality check in Identityhashmap_______");

		IdentityHashMap ihm=new IdentityHashMap();
		ihm.put("abc",15);
		ihm.put(new String("abc"),30);
		System.out.println(ihm);
	}

}
