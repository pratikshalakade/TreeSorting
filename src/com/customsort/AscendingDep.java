package com.customsort;
import java.util.*;

public class AscendingDep implements Comparator {

	public int compare(Object o,Object o1) {
		Employee ee=(Employee)o;
		Employee er=(Employee)o1;
		return ee.dep.compareTo(er.dep); // for descending (return -)
	}
}
