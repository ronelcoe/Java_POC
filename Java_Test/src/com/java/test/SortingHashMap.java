package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class SortingHashMap {

	public static void main(String[] args) {
		Map<String, Integer> unSortedMap = new LinkedHashMap<String, Integer>();
	    unSortedMap.put("A", 2);
	    unSortedMap.put("V", 1);
	    unSortedMap.put("G", 5);
	    System.out.println("Unsorted Map :\n");
	    for (Map.Entry<String, Integer> entry : unSortedMap.entrySet()) {
	        System.out.println(entry.getKey() + "   " + entry.getValue());
	    }
	    System.out.println("\n");
	    System.out.println("Sorting Map Based on Keys :\n");
	    Map<String, Integer> keySortedMap = new TreeMap<String, Integer>(unSortedMap);
//	    keySortedMap.entrySet().forEach(key -> System.out.println(key + " " + keySortedMap.get(key)));
	    
	    for (Map.Entry<String, Integer> entry : keySortedMap.entrySet()) {
	        System.out.println(entry.getKey() + "   " + entry.getValue());
	    }
	    System.out.println("\n");
	    System.out.println("Sorting Map Based on Values :\n");
	    List<Entry<String, Integer>> entryList = new ArrayList<Entry<String, Integer>>(unSortedMap.entrySet());
	    Collections.sort(entryList, new Comparator<Entry<String, Integer>>() {

	        @Override
	        public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
	            return obj1.getValue().compareTo(obj2.getValue());
	        }
	    });
	    unSortedMap.clear();
	    for (Entry<String, Integer> entry : entryList) {
	        unSortedMap.put(entry.getKey(), entry.getValue());
	        System.out.println(entry.getKey() + "   " + entry.getValue());
	    }

	    System.out.println("Sorting Map Based on Lambda approach :\n");
//	    entryList.forEach(val1, val2 -> {
//	    	
//	    });
	    
//	    entryList.sort((val1, val2) -> val1.compareTo(val2));
	}

}
