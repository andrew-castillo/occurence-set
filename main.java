import java.util.ArrayList;
import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
	OccurrenceSet<Integer> intSet = new OccurrenceSet<Integer>();
	intSet.add(1);
	intSet.add(3);
	intSet.add(5);
	intSet.add(5);
	intSet.add(3);
	intSet.add(3);
	intSet.add(3);
	System.out.println(intSet);
	OccurrenceSet<String> stringSet = new OccurrenceSet<String>();
	stringSet.add("hello");
	stringSet.add("hello");
	stringSet.add("world");
	stringSet.add("world");
	stringSet.add("world");
	stringSet.add("here");
	System.out.println(stringSet);
	ArrayList<Integer> intl = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 7, 9, 10, 23));
	intSet.retainAll(intl);	

	}
		

	}
	