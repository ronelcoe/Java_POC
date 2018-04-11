package com.test.codility.circle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Reference {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int [] arrayNumbers = {1,2,3};
		
		//1. Sort list
		Collections.sort(list);
		list.forEach(item -> System.out.println(item));
		
		//2. Convert integer array to Arraylist
		list.addAll(Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList()));
		
		//3. Convert to binary
		String binaryNumber = Integer.toBinaryString(4);
		
		//4. Copy array to another array
//		System.arraycopy(arrayNumbers, x, tmpArrayNumbers, x + movement, 1);
		
		//5. Rotate array
//		List<Integer> intList = Arrays.stream(arrayNumbers).boxed().collect(Collectors.toList());
//		Collections.rotate(intList, movement);
		
		//6. Print map
		Map<String, String> map = new HashMap<String, String>(); 
		map.put("A", "a");
		map.forEach((k,v) -> System.out.println(k));
		
		//7. Sort array of integers
		Arrays.sort(arrayNumbers);
		
		//8. Get distinct count
		Arrays.stream(arrayNumbers).distinct().count();
	}

}
