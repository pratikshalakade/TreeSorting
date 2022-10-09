package com.customsort;
import java.util.Comparator;

public class AscendingRoll implements Comparator {
		public int compare(Object o,Object o1) {
			Employee w=(Employee)o;
			Employee w1=(Employee)o1;
		return w.roll.compareTo(w1.roll);
	}

}
