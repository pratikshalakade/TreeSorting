package com.customsort;

import java.util.*;

public class AscendingName implements Comparator {

	public int compare(Object o1, Object o2) {
		Employee el = (Employee) o1;
		Employee ek = (Employee) o2;
		return el.nm.compareTo(ek.nm);
	}

}
