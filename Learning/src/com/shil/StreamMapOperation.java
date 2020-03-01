//stream operation using filter on Map

package com.shil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapOperation {

	public static void main(String[] args) {
	
		Map<Integer,String> map = new HashMap<>();
		map.put(10,"sanju");
		map.put(20,"rammu");
		map.put(30,"shillu");
		
		Map<Integer,String> output=findStreamMapOperation(map, 20);
		for(Integer key: output.keySet()){
			System.out.println(map.get(key)+","+key);
		}

	}
	
	public static Map<Integer,String> findStreamMapOperation(Map<Integer,String> map,int age){
		
		Map<Integer,String> m=map.entrySet().stream()
		.filter(a->age==a.getKey())
		.collect(Collectors.toMap(a->a.getKey(), a->a.getValue()));
		return m;
		
	}

}
