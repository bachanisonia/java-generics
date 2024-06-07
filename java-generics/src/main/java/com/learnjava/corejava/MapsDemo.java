package com.learnjava.corejava;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		
		Map<String, Date> m = new HashMap<>();
		
		m.put("Today", new Date());
		System.out.println(m);
		
	}

}
