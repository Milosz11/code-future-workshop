//Java Workshop 6: Object-Oriented Programming
/*KEY
+ Concept -> Make sure to read these out loud
@ Code Explanation -> Paraphrase these as necessary
& Interaction with Students -> These are suggestions, interact with students based on your best judgement
! Run the Code -> Press the run button and examine the output with students
*/

// SPECIAL NOTE TO INSTRUCTOR: This workshop has several steps, each of which you should add
// on to the previous in your code. The way this file is written can't run because it has redundant
// repeating syntax to easily show step discrepencies

public class Workshop {
	public static void main(String[] args) {

		/*+ Java is an object-oriented programming language. This means, if you're not working with your
			standard primitive types like Strings, booleans, ints, you're probably working with objects.
			Objects are instances, or entities, or manifestations, (however you like to think of it) of any
			thing you can think of. The way we define our objects, or write our blueprint for our object,
			is through creating a class. This way we're able to give our object state (variables) and
			behavior (functions/methods). */

		// Step 1 - create the class
		class Robot {

		}
		//@ Here we create a class called Robot. Right now it doesn't have any functionality or state.

		Robot ourRobot = new Robot();
		//+

		Robot ourOtherRobot;
		ourOtherRobot = new Robot();

		// Step 2 - add an empty constructor
		class Robot {
			public Robot() {}
			//+ This is the constructor method. It's a special method because it has the same name as the
			//+ class it's in. This is how we can create an instance of our Robot class. Even if you don't
			//+ write a constructor, Java just uses an empty constructor like we just wrote, which is why
			//+ we were able to write line 29_______________________________________________________
			//@ Remember that the constructor is a method, albeit a special one. Currently it is taking
			//@ no parameters
		}

		// Step 3 - add a private variable and initialize it through constructor
		class Robot {
			private String name;
			//+ Here we give our Robot class its first state. It's simply a String variable that represents
			//+ the robot's name. Know that this variable is attached to every instance of a Robot we create.
			//+ This means everytime we use the 'new' keyword to create a new Robot, that's how many
			//+ unique names we can have, because each Robot instance has its own unique String name

			public Robot(String inputName) {
				//+

				name = inputName;
				//
			}
		}

		//Step 4 - create a method to retrieve the name
		class Robot {
			private String name;

			public Robot(String inputName) {
				name = inputName;
			}

			public String getName() {
				return name;
			}
			//+ This method the name of the Robot instance you cast it on
			//@ We will soon see that this method is unique for every instance of the Robot class because
			//@ it returns a different name
		}

		Robot robot1 = new Robot("Sparky");

		System.out.println(robot1.getName());
		//& Ask the students what they think will get printed
		//!

		Robot robot2 = new Robot("Bop");

		System.out.println(robot2.getName());
		//& Ask the students what they think will get printed
		//!

		// Step 5 - creating a method to set the name
		class Robot {
			private String name;

			public Robot(String inputName) {
				name = inputName;
			}

			public String getName() {
				return name;
			}

			public void setName(String newName) {
				name = newName;
			}
			//+
		}

		robot2.setName("Zap");
		//+

		System.out.println(robot1.getName());
		//+
		System.out.println(robot2.getName());
		//+

		// Step 6
		class Robot {
			private String name;
			private boolean isPoweredOn;
			//+

			public Robot(String inputName) {
				name = inputName;
				isPoweredOn = true;
				//+
			}

			public String getName() {
				return name;
			}

			public void setName(String newName) {
				name = newName;
			}

			public boolean isPoweredOn() {
				return isPoweredOn;
			}

			public void powerUp() {
				isPoweredOn = true;
			}

			public void powerDown() {
				isPoweredOn = false;
			}
		}

		robot2.powerDown();
		//+

	}
}
