package wodlabs.wod;

import wodlabs.wod.exercise.Exercise;
import wodlabs.wod.exercise.ExerciseSequence;

public class WOD {
  ExerciseSequence sequence = new ExerciseSequence();

public boolean add(Exercise e) {
	return sequence.add(e);
}

public Exercise get(int index) {
	return sequence.get(index);
}
}
