package com.customsort;
import java.util.*;
public class CustomSort1  {
	
	public static void main(String[] args) {
		Employee e =new Employee(100,"Renu","Agri");
		Employee e1 =new Employee(200,"Shree","PHD");
		Employee e2 =new Employee(300,"Vaibhav","MNC");
		Employee e3 =new Employee(400,"Pratiksha","BSC");
		
		AscendingRoll ar=new AscendingRoll();
		AscendingName an=new AscendingName();
		AscendingDep ad=new AscendingDep();
		TreeSet ts=new TreeSet(ad);
		
		ts.add(e3);
		ts.add(e);
		ts.add(e1);
		ts.add(e2);
		
		System.out.println(ts);
		
	}

}
