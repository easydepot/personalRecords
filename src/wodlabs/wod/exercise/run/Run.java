package wodlabs.wod.exercise.run;

import wodlabs.wod.exercise.Exercise;

public class Run implements Exercise{
	  int distance;
	
	  
	  
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public Run(int distance) {
		super();
		this.distance = distance;
	}

}
