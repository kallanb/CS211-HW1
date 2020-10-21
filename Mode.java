package hW03;
import java.util.*;

public class Mode {

	public static void main(String[] args) {
		List<Integer> list = (List<Integer>) new ArrayList<Integer>();

		//list of random integers to compute the max occurrence
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(7);
		

		System.out.println(new Mode().maxOccurrences(list));
	}

	public int maxOccurrences(List<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int returnVal = 0;
		if (list.size() == 0) {
			return returnVal;
		} else {
			for (int i = 0; i < list.size(); i++) {
				if (map.containsKey(list.get(i))) {
					int temp = map.get(list.get(i));
					temp++;
					map.put(list.get(i), temp);
				} else {
					map.put(list.get(i), 1);
				}
			}
			Set<Integer> set = new TreeSet<Integer>(map.values());
			Iterator<Integer> i = set.iterator();
			while (i.hasNext()) {
				returnVal = (int) i.next();
			}
		}
		return returnVal;
		
	}
}