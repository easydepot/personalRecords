package wodlabs;

import wodlabs.wod.ForTime;
import wodlabs.wod.exercise.Loop;
import wodlabs.wod.exercise.bodyWeight.RingDips;
import wodlabs.wod.exercise.bodyWeight.RingPushUp;
import wodlabs.wod.exercise.bodyWeight.Toes2Bar;
import wodlabs.wod.exercise.kettlebell.KBSwing;
import wodlabs.wod.exercise.lifting.DeadLift;
import wodlabs.wod.exercise.lifting.Squat;
import wodlabs.wod.exercise.run.Run;

public class MyProject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Project p = new Project();
		// 21/08/2013
		Loop loop = new Loop(21);
		loop.add(15);
		loop.add(9);
		loop.addExercise(new Squat(40));
		loop.addExercise(new RingPushUp());
		loop = new Loop(9);
		loop.add(15);
		loop.add(21);
		loop.addExercise(new KBSwing());
		loop.addExercise(new Toes2Bar());
		
		ForTime wod = new ForTime();
		wod.add(loop);
		wod.add(new Run(400));
		p.add(wod);
		// ajouter résultat.
		// ajouter cash-in 3*5 strict press
		// ajouter les poids: 40kg pour le squat / 24 pour le kettlebell / 45 pour le cash in
		// ajouter le temps: 20"49
		// ajouter un module pour écrire facilement le log
		// ajouter lien BDD
		// ajouter impression.
		
		// 21/08/2013
		// for rep
		// 2"on 1"off 8 tours
		// 1,2,3,4: 10 pullup 10 burpee 10 KBswing Max SitsUp
		// 5,6,7,8: 5 pullup 5 KBsnatchLeft 5 KBsnatchRight Max Sitsup
		// result 129 sitsup
		// max unbrocken pullup
		p.getPr().setMaxUnbrokenPullUp(10);
		// ajouter le 27/08/2013
		// CashIn push Press 5*3
		// WOD for time
		// 5 HSPU
		// 10 goblet squat
		// 15 Burpees
		// 20 pullup
		// 25 DU unders
		//30 OH lunges
		//35 pushups
		// 40 power clean
		// 45 sit-ups
		// 50 air squat
		
		
		
		// ajouter le 28/08/2013
		// 29/08/2013
		// cashin 10" OTM 10 pistols 5 explosive pushups
		// WOD
		// AMRAP 5mn 200m run 10 snatch à 25kg
		// 1" rest
		// AMRAP 5" 50 DU 10 C&J à 25kg
		// 2 tours / 2 tours.
		
		// ajouter le 29/08/2013
		//  2RM clean @65kg
		// WOD
		// 5 HSPU (à terre)
		// 10 SDLHP
		// 15 jumping squat
		// 20 jumpin Pull.
		p.getPr().setMaxClean(65);
		
		// ajouter le 3 Septembre
		// 10-1
		// OverheadSquat 20kg
		// DeadLift 20kg
		// TOES2BAR
		// RingDips
		wod = new ForTime();
		Loop loopdecreasing = new Loop(10);
		loopdecreasing.setDecreasing(true);
		Squat s = new Squat(20);
		s.setOverheadSquat();
		loopdecreasing.addExercise(s);
		loopdecreasing.addExercise(new DeadLift(20));
		loopdecreasing.addExercise(new Toes2Bar());
		RingDips rd = new RingDips();
		rd.setScaleRed();
		loopdecreasing.addExercise(rd);
		wod.add(loopdecreasing);
		wod.setResultmin(20, 16);
		p.getPr().setOverHeadSquat(25);

	}

}
