package org.util;

import java.util.Comparator;

public class ComparatorUtilities implements Comparator{

	public int compare(Object o1, Object o2) {
		String s1 = (String)o1;
		 
		String s2 = (String)o2;
		
		if(s1.lengt>s2) {
			return 1;
		}
		else if(s1.length<s2) {
			return -1;
		}else {
			return 0;
		}
		
	}
	
	

}
