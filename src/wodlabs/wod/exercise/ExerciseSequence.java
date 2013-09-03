package wodlabs.wod.exercise;

import java.util.ArrayList;

public class ExerciseSequence {
  ArrayList<Exercise> sequence = new ArrayList<Exercise>();

public boolean add(Exercise e) {
	return sequence.add(e);
}

public Exercise get(int index) {
	return sequence.get(index);
}

public int size() {
	return sequence.size();
}
}
