package wodlabs.wod.exercise;

import java.util.ArrayList;

public class Loop implements Exercise {
	ArrayList<Integer> numberOfRep = new ArrayList<Integer>();
	boolean decreasing = false;

	public boolean isDecreasing() {
		return decreasing;
	}

	public void setDecreasing(boolean decreasing) {
		this.decreasing = decreasing;
	}

	public Loop(int numberOfRep) {
		super();
		this.numberOfRep.add(numberOfRep);
	}
	
	public boolean add(Integer e) {
		return numberOfRep.add(e);
	}

	public boolean addExercise(Exercise e) {
		return sequence.add(e);
	}

	public Exercise get(int index) {
		return sequence.get(index);
	}

	public int size() {
		return sequence.size();
	}

	ExerciseSequence sequence = new ExerciseSequence();;

}
