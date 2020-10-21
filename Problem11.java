package hW03;
import java.util.*;

public class Problem11 {

	public static void main(String[] args) {
		Set<Integer>set1 = new HashSet<Integer>();
	
		//add integers to set
		set1.add(1);
		set1.add(4);
		set1.add(7);
		set1.add(9);
		
		//create a set of type integers
		Set<Integer>set2 = new HashSet<Integer>();
		
		//add integers to set
		set2.add(2);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		System.out.println("First set of elements: " + set1);
		System.out.println("Second set elements: " + set2);
		
		Set<Integer>symmetricSet = symmetricSetDifference(set1,set2);
		System.out.println("Symmetric difference set: " + symmetricSet);
	}

	private static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2) {
		//create a set of type of integers
		Set<Integer>intersection = new HashSet<Integer>(set1);
		
		//intersection between set1 and set2
		intersection.retainAll(set2);
		
		//remove intersection set from set1
		set1.removeAll(intersection);
		
		//remove intersection set from set2
		set2.removeAll(intersection);
		
		//union of set1 and set2
		set1.addAll(set2);
		
		//return set1 to main method
		return set1;
	}

}
