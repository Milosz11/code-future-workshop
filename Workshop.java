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

		Robot ourRobot;
		//+ Just like with variables, when we create objects in Java, we state the type and then the name.
		//@ Likewise with primitive types, we need to declare the variable with a name and type; in this
		//@ case, the name is 'ourRobot' and the type is Robot.

		ourRobot = new Robot();
		//+ When we initialize an object in Java, we need to use the 'new' keyword followed by a constructor
		//@ A constructor is a method that returns an instance of a Robot; we will cover it in the next step

		Robot ourOtherRobot = new Robot();
		//@ Like with primitive types, we can declare and initialize objects on the same line.
		//@ On the left side, we create our Robot variable named 'ourOtherRobot' and on the right side
		//@ we initialize it to a new instance of a Robot.

		// Step 2 - add an empty constructor
		class Robot {
			public Robot() {}
			//+ This is the constructor method. It's a special method because it has the same name as the
			//+ class it's in. This is how we can create an instance of our Robot class. Even if you don't
			//+ write a constructor, Java just uses an empty constructor like we just wrote, which is why
			//+ we were able to write lines 34 and 38.
			//@ Remember that the constructor is a method, albeit a special one. Currently it is taking
			//@ no parameters
		}

		// Step 3 - add a private variable and initialize it through constructor
		class Robot {
			private String name;
			//+ Here we give our Robot class its first state. It's simply a String variable that represents
			//+ the robot's name. Know that this variable is attached to every instance of a Robot we create.
			//+ This means everytime we use the 'new' keyword to create a new Robot, that's how many
			//+ unique names we can have, because each Robot instance has its own unique String name.
			//@ Notice that we use the keyword 'private' before creating our String. Variables and methods
			//@ can have accessibility modifiers attached to them which is the 'public' and 'private'
			//@ keywords you see. Private access to a varaible means it can only be accessed inside the class,
			//@ while public access means it can be accessed from outside. This could be a bad thing that
			//@ causes our code to crash in some cases because of varaibles being set outside of the class to
			//@ things we may not have forseenplenty of times

			public Robot(String inputName) {
				//+ When we create our Robot, we want to be able to give it a name by assigning a String to
				//+ the name class variable. We can do this by passing it through the constructor. Just with
				//+ as any other method, we pass something in as a parameter with its type and a name we refer
				//+ to that parameter as.

				name = inputName;
				//+ Here we assign whatever String the parameter is to the class variable called 'name'.
				//@ Now when we create a new Robot, we'll have to pass in a String parameter into the constructor
				//@ for its name. We'll make a method to retrieve the name next so we can see this in action.
			}
		}

		// Step 4 - create a method to retrieve the name
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
			//+

			public void powerUp() {
				isPoweredOn = true;
			}
			//+

			public void powerDown() {
				isPoweredOn = false;
			}
			//+
		}

		// Step 7
		class Robot {
			private String name;
			private boolean isPoweredOn;

			public Robot(String inputName) {
				name = inputName;
				isPoweredOn = true;
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

			public void liftRightArm() {
				if (isPoweredOn) {
					System.out.println(name + " lifts its right arm.");
				} else {
					System.out.println(name + " is powered off!");
				}
			}

		}

		robot2.powerDown();
		//+

		robot2.liftRightArm();
		//+

		Robot robot3 = new Robot("Scrapper");
		//+

		robot3.liftRightArm();
		//+

		if (robot3.isPoweredOn()) {
			robot3.powerDown();
		} else {
			robot3.powerUp();
		}
		//+

		robot3.liftRightArm();
		//+

	}
}
