package wodlabs;

import java.util.ArrayList;

import wodlabs.wod.WOD;

public class Project {
	PersonalRecords pr = new PersonalRecords();
	ArrayList<WOD> listOfWorkout = new ArrayList<WOD>();

	public boolean add(WOD e) {
		return listOfWorkout.add(e);
	}

	public WOD get(int index) {
		return listOfWorkout.get(index);
	}

	public int size() {
		return listOfWorkout.size();
	}

	public PersonalRecords getPr() {
		return pr;
	}

}
