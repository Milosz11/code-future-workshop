// Functional Robot class for Workshop 6: Object-Oriented Programming

public class OutlineClass {
	public static void main(String[] args) {

		class Robot {
			private String name = "";
			public boolean isPoweredOn;

			public Robot(String inputName) {
				name = inputName;
				isPoweredOn = true;
			}
		}

		Robot robot1 = new Robot("Sparky");

	}
}
