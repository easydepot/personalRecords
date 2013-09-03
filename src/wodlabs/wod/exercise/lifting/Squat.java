package wodlabs.wod.exercise.lifting;

import wodlabs.wod.exercise.Exercise;


public class Squat implements Exercise {
	String type = "front";
	int weight = 10;
	
	public void setFrontSquat(){
		type = "front";
	}
	
	public void setOverheadSquat(){
		type = "overhead";
	}

	public Squat(int weight) {
		super();
		this.weight = weight;
	}
	

}
