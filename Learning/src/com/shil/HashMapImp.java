//hash map implementation examples using object class employee

package com.shil;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImp {

	public static void main(String[] args) {
	
		Map<String,String> map = new HashMap();
		map.put("1", "shilpa");
		map.put("2","ramya");
		map.put("3", "rathnamma");
		
		System.out.println(map.containsValue("rathnamma"));
		System.out.println(map.containsKey("2"));
		
		Set<Entry<String,String>> s =map.entrySet();
		for(Entry e:s) {
			System.out.println(e.getKey()   +" " +e.getValue());
		}
		
		Employee e1 = new Employee();
		e1.setName("Rathnamma");
		e1.setAge(50);
		
		Employee e2 = new Employee();
        e2.setName("muniyallappa");
        e2.setAge(60);
        
        Employee e3 = new Employee();
        e3.setName("ramya");
        e3.setAge(30);
        
        Map<Integer,Employee> m = new HashMap();
        m.put(1, e1);
        m.put(2, e2);
        m.put(3, e3);
        
        Set<Entry<Integer,Employee>> s1= m.entrySet();
        for(Entry<Integer,Employee> e5: s1) {
        	System.out.println(e5.getKey() +" " +e5.getValue().getName() +" "  +e5.getValue().getAge());
        }
		}

}
