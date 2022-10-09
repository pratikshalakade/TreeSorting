package com.customsort;
import java.util.Objects;

public class Employee {

	Integer roll;
	String nm;
	String dep;

	Employee(int roll, String nm, String dep) {
		this.roll = roll;
		this.nm = nm;
		this.dep = dep;
	}

	Employee() {
		super();
	}

	public int hashCode() {
		return Objects.hash(roll, nm, dep);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Employee) {
			Employee e = (Employee) obj;
			if (roll == e.roll && nm.equals(e.nm) && dep.equals(e.dep)) {
				return true;
			}
			return false;
		}
		return false;
	}

//	public String toString() {
//		return "Employee [roll=" + roll + ", nm=" + nm + ", dep=" + dep + "]";
//	}

}
