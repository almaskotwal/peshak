package booleanInJava;

public class BooleanInJava {
	
	public static void main (String [] args) {
				
		boolean targetHit = true;
		boolean targetMissed = true;
		boolean targetDestroyed = false;
		
		int bulletCountDown = 30;
		int targetGoal = 3;
		int shotCount = 0;
		int shotsRemaining = targetGoal - shotCount;
		
		
		if (targetHit ) {
			System.out.println("Target hit, good job!" );
			-- bulletCountDown;
			System.out.println("You have " + bulletCountDown + " bullets left.");	
			++ shotCount;
			System.out.println("You have hit the target " + shotCount + " time. You have " + (targetGoal - shotCount) + " more left to destroy target!" );
		  }	
		
		if (targetMissed) {
			System.out.println("\nOops, you missed the target, aim better.");
			-- bulletCountDown;
			System.out.println("You have " + bulletCountDown + " bullets left." );
		}
		
		if (targetMissed) {
			System.out.println("\nOops, you missed the target, aim better.");
			-- bulletCountDown;
			System.out.println("You have " + bulletCountDown + " bullets left." );
		}
		
		
		if (targetHit ) {
			System.out.println("\nTarget hit, good job!" );
			-- bulletCountDown;
			System.out.println("You have " + bulletCountDown + " bullets left.");
			++ shotCount;
			System.out.println("You have hit the target " + shotCount + " time. You have" + (targetGoal - shotCount) + " more left to destroy target!" );

		}
		if (targetHit ) {
			System.out.println("\nTarget hit, good job!" );
			-- bulletCountDown;  
			System.out.println("You have " + bulletCountDown + " bullets left.");
			++ shotCount; 
			System.out.println("You have hit the target " + shotCount + " time. You have " + (targetGoal - shotCount) + " more left to destroy target!" );

		}
		if (shotCount == targetGoal) {
			targetDestroyed = true;
		}
		if (targetDestroyed) {
			System.out.println("\nCongratulations! You have destroyed the target!");
		}
		
	}

}
