package hW03;

import java.util.*;

public class Problem5 {

	public static void main (String [] args) {
		Set<Integer>setList = new HashSet<Integer>();
		setList.add(7);
		setList.add(4);
		setList.add(-9);
		setList.add(4);
		setList.add(15);
		setList.add(8);
		setList.add(27);
		setList.add(7);
		setList.add(11);
		setList.add(-5);
		setList.add(32);
		setList.add(-9);
		setList.add(-9);
		System.out.println("Before"); 
		System.out.println(setList);
		Set<Integer>sortedSet = sortAndRemoveDuplicates(setList);
		System.out.println();
		System.out.println("After");
		//print elements after sorting
		for (Integer i : sortedSet)
			System.out.print(i + " ");
	}

	private static Set<Integer> sortAndRemoveDuplicates(Set<Integer> setList) {
		//create a TreeSet class containing set elements
		Set<Integer>sortedSet = new TreeSet<Integer>(setList);
		return sortedSet;
	}
}
