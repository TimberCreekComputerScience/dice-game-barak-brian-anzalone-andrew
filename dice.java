import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean first = true;
		out: while (true) {
			System.out.println("Rolling two dice...");
			int a = (int)(Math.random() * 6) + 1;
			int b = (int)(Math.random() * 6) + 1;
			if (first) {
				System.out.println("Guess the total! You have 3 tries");
				System.out.println("Type 0 to exit");
				first = false;
			}
			for (int i = 0; i < 3; ++i) {
				int guess = scan.nextInt();
				if (guess == 0) return;
				if (guess < a + b) {
					System.out.println("Too low. Try again!");
				}
				else if (guess > a + b) {
					System.out.println("Too high. Try again!");
				}
				else {
					System.out.println("That's right! The total is " + (a + b));
					continue out;
				}
			}
			System.out.println("Nope!");
		}
	}

}
