package com.naturalSort;

import java.util.Objects;

public class Student implements Comparable {

	int roll;
	String nm;
	
	Student(int roll,String nm){
		this.roll=roll;
		this.nm=nm;
	}
	Student(){
		super();
	}
	public int hashCode() {
		return Objects.hash(roll,nm);
	}
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if( obj instanceof Student) {
			Student s = (Student)obj;
			if(roll==s.roll && nm.equals(s.nm));
			return true;
		}
		else 
			return false;
	}
	public String toString() {
		return "Student [roll=" + roll + ", nm=" + nm + "]";
	}
	
//	public int compareTo(Object o) {
//		Student ss =(Student)o;
//		if(this.roll==ss.roll)
//			return 0;
//		else if(this.roll>ss.roll)
//			return 1;
//		else
//			return -1;
//	}
	
	public int compareTo(Object o) {
		Student s1=(Student)o;
		if(this.nm==s1.nm)
			return 0;
		else if(this.nm.compareTo(s1.nm)>0)
			return 1;
		else
			return -1;
	}
}
