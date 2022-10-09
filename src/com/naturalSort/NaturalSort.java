package com.naturalSort;
import java.util.*;

public class NaturalSort {

	public static void main(String[] args) {
		
		Student s1 = new Student(100,"Pratiksha");
		Student s2 = new Student(200,"Renu");
		Student s3 = new Student(300,"Shree");
		Student s4 = new Student(400,"Komal");
		
		TreeSet ts = new TreeSet();
		ts.add(s3);
		ts.add(s2);
		ts.add(s1);
		ts.add(s4);
		
		System.out.println(ts);
	}
	
	
}
