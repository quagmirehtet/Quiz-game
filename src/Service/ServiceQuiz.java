package Service;

import java.util.*;


import Model.ModelQuiz;

public class ServiceQuiz {

	public static Scanner scanner = new Scanner(System.in);

	public static String gradeResult(double result) {
		if (result >= 67) {
			return "Excellent!";
		} else if (result >= 33) {
			return "Great!";
		} else if (result > 0) {
			return "Good!";
		} else {
			return "Try again";
		}
	}

	public static double calculatePercentage(int score, int totalQuestion) {

		if (totalQuestion == 0) {

			return 0;
		}

		return (score * 100.0) / totalQuestion;

	}

	static String readAnswer() {

		while (true) {
			System.out.print("Your answer (A/B/C/D): ");
			String ans = scanner.nextLine().trim().toUpperCase();
			if (ans.matches("[A-D]")) {
				return ans;
			}

			System.out.println("Please type A, B, C or D.");

		}

	}

	public static void playQuiz(List<ModelQuiz> quiz) {

		int score = 0;

		String letters = "ABCD";

		System.out.println("--------------------------------------------");

		for (int i = 0; i < quiz.size(); i++) {

			ModelQuiz q = quiz.get(i);

			System.out.println(
					"Question " + (i + 1) + " of " + quiz.size() + " ( Difficulty : " + q.getDifficulty() + ")");

			System.out.println(q.getText());

			for (int j = 0; j < q.getChoices().length; j++) {

				System.out.println(letters.charAt(j) + ") " + q.getChoices()[j]);

			}

			String ans = readAnswer();

			if (ans.equals(q.getCorrectAnswer())) {

				System.out.println("---> Correct !");

				score++;

			} else {

				int index = letters.indexOf(q.getCorrectAnswer());

				System.out.println(
						"--> Wrong! The correct answer is: " + q.getCorrectAnswer() + ") " + q.getChoices()[index]);

			}

			System.out.println("--------------------------------------------");
		}

		overallResult(score, quiz.size());

	}

	public static void overallResult(int score, int total) {

		double result = calculatePercentage(score, total);

		System.out.println("======================");

		System.out.println("QUIZ COMPLETE!");

		System.out.println("======================");

		System.out.println("Total Question: " + total);

		System.out.println("Score: " + score + " out of " + total);

		System.out.printf("Percentage : %.0f%%\n", result);

		System.out.println("Rating :" + gradeResult(result));

		System.out.println("======================");

		System.out.println("Thanks for playing!");

	}

	public static int readChoice(int min, int max) {

		while (true) {

			System.out.print("Enter your choice (" + min + "-" + max + "): ");

			String inputNum = scanner.nextLine().trim();

			try {

				int n = Integer.parseInt(inputNum);

				if (n >= min && n <= max) {

					return n;

				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block

			}

			System.out.println("Invalid input , please enter number only.");

		}

	}

}
