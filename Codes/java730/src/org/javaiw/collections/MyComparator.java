//Used with TreeSetDemo1 
package org.javaiw.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Student1> { //It is comparator and not comparable

	@Override
	public int compare(Student1 arg0, Student1 arg1) { //I want arg0 and arg1 to be compared to rollnos.
		return arg0.rollno - arg1.rollno;
	}
}
