package studio9;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

import assignment7.Student;

public class UniversityDatabase {
	//TODO: Complete this class according to the studio instructions
	private final Map<String, Student> dataBase = new HashMap<>();
	
	public UniversityDatabase() {
		
	}
	
	
	
	public void addStudent(String accountName, Student student) {
		dataBase.put(accountName, student);
	}

	public int getStudentCount() {
		int size = dataBase.size();
		return size;
	}

	public String lookupFullName(String accountName) {
			if(dataBase.containsKey(accountName)) {
				return dataBase.get(accountName).getFullName();
			}
			else {
				return null;
			}
	}

	public double getTotalBearBucks() {
		double value=0;
		for(String name : dataBase.keySet()) {
			value = dataBase.get(name).getBearBucksBalance()+value;
		}
		return value;
	}
}
