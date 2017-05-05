package org.javaiw.collections;
import java.util.*;
//Key is used to get Value in case of Map
public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, Student1> map1 = new TreeMap<Integer, Student1>(); //key is Integer, value is object of Student class
		map1.put(1, new Student1(1, "Dinesh", "J2EE",  25624));
		map1.put(5, new Student1(5, "Robin",  "Cplus+", 23431));
		map1.put(3, new Student1(3, "Harsha", "Python", 36542));
		map1.put(4, new Student1(4, "Dimple", "Html5",  11343));
		map1.put(2, new Student1(2, "Alison", "Geology", 2456));
		
		System.out.println(map1.get(4));
		
		Set<Map.Entry<Integer, Student1>> set1 = map1.entrySet();
		for(Map.Entry<Integer, Student1> e1:set1) { //Entry is a generic class. Every element we get from e1.set1 would be of type Map.Entry
			System.out.println(e1.getKey() + "====" + e1.getValue());
		
		}
	}
}
