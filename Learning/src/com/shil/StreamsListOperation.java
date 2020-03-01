//stream operation using filter on list

package com.shil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsListOperation {
	
	public static List<Student> findStreamsListOperation(List<Student> list,int number, String name) {
		List<Student> l=list.stream().filter(a->number==a.getAge() && name.equals(a.getName())).collect(Collectors.toList());
		return l;	
	}

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		
		Student stu1=new Student();
		stu1.setName("shilpa");
		stu1.setAge(31);
		Student stu2=new Student();
		stu2.setName("ramya");
		stu2.setAge(28);
		Student stu3=new Student();
		stu3.setName("sanjana");
		stu3.setAge(10);
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		List<Student> result=(findStreamsListOperation(list,10, "sanjana"));
		result.forEach(output->System.out.println(output));
			
		}
		
	}


