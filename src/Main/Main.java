package Main;

import java.util.*;

import Model.ModelQuiz;
import Service.ServiceQuiz;

public class Main {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("===============================");

		System.out.println("WELCOME TO THE TRIVIA QUIZ!");

		System.out.println("===============================");

		String again;

		do {

			System.out
					.println("Choose a category: \n" + "1. Science & Tech \n" + "2. Geography \n" + "3. Pop Culture ");

			
			
			int choice = ServiceQuiz.readChoice(1, 3);

			List<ModelQuiz> quizzes = switch (choice) {

			case 1 -> ModelQuiz.scienceQuiz();

			case 2 -> ModelQuiz.geographyQuiz();

			default -> ModelQuiz.popCultureQuiz();

			};

		ServiceQuiz.playQuiz(quizzes);

			System.out.println("Do you want to continue (y/n) ? :");
		    again=ServiceQuiz.scanner.nextLine();

		} while (again.equalsIgnoreCase("y"));

		System.out.println("Thank for playing.");
		
	     

	}

}
