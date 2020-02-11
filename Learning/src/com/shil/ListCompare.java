package com.shil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();
		list.add("ramya");
		list.add("shilpa");
		list.add("muniyalla");
		list.add("rathnamma");
		
		Collections.sort(list);
		
		//first method to iterate
		for(String s:list) {
			System.out.println(s);
		}
		
		//second method to iterate
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//comparing student object by name and class
		Student stu1 = new Student();
		stu1.setName("ramya");
		stu1.setAge(28);
		
		Student stu2 = new Student();
		stu2.setName("praveen");
		stu2.setAge(31);
		
		Student stu3 = new Student();
		stu3.setName("muniyalla");
		stu3.setAge(55);
		
		List<Student> l = new ArrayList();
		l.add(stu1);
		l.add(stu2);
		l.add(stu3);
		
		Collections.sort(l, new StudentCompbyName());
		Iterator<Student> i=l.iterator();
		while(i.hasNext()) {
		Student st=i.next();
		System.out.println(st.getName()  +st.getAge());
		
	}
		
		Collections.sort(l, new StudentCompbyAge());
		for(int k=0;k<l.size();k++) {
			System.out.println(l.get(k).getAge()  +""  +l.get(k).getName());
		}
}
}
