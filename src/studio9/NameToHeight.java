package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	

	/**
	 * Construct and fill a map with your studio 
	 * group members' names, each
	 * associated with his or her height.
	 * 
	 * 
	 * Construct an ArgsProcessor and loop asking 
	 * the args processor for a name to
	 * lookup the height. When the user cancels 
	 * (that is: when args processor
	 * returns null), break from the loop. Otherwise, 
	 * loop up the name in the map
	 * and output the results. Be sure to handle 
	 * the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Integer> heights = new HashMap<>();
		heights.put("Kieran", 180 );
		heights.put("Jack", 170);
		heights.put("Chris", 200);
		int count = 0;
		while(count==0) {
		System.out.println("What is the name of Person,"
				+ " whose height you are looking for?");
		String name = in.next();
		if(name.equals("Chris")||name.equals("Jack")
				||name.equals("Kieran")) {
			System.out.println(heights.get(name));
			System.out.println("If finished type "
					+ "\"quit\" to end program.");
		}
		else if(name.equals("quit")) {
			count++;
		}
		else {
			System.out.println("ERROR: Name not "
					+ "known or Name not capitalized.");
			System.out.println("If finished type "
					+ "\"quit\" to end program.");
			}
		}
	}
}
