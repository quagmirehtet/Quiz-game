package Model;

import java.util.List;

public class ModelQuiz {

	private String text;

	private String[] choices;

	private String correctAnswer;

	private String difficulty;

	public ModelQuiz(String text, String[] choices, String correctAnswer, String difficulty) {

		this.text = text;

		this.choices = choices;

		this.correctAnswer = correctAnswer;

		this.difficulty = difficulty;

	}

	public static List<ModelQuiz> scienceQuiz() {
		return List.of(
				new ModelQuiz("What is the chemical symbol for Gold?", new String[] { "Ag", "Au", "Gd", "Go" }, "B",
						"Easy"),
				new ModelQuiz("Which planet is the closest to the Sun?",
						new String[] { "Venus", "Earth", "Mercury", "Mars" }, "C", "Medium"),
				new ModelQuiz("Who developed the theory of general relativity?",
						new String[] { "Isaac Newton", "Nikola Tesla", "Albert Einstein", "Galileo Galilei" }, "C",
						"Hard"));
	}

	public static List<ModelQuiz> geographyQuiz() {
		return List.of(new ModelQuiz("Which ocean is the largest on Earth by both surface area and volume?",
				new String[] { "Pacific Ocean", "Atlantic Ocean", "Indian Ocean", "Arctic Ocean" }, "A", "Easy"),
				new ModelQuiz("What is the official capital city of Australia?",
						new String[] { "Sydney", "Melbourne", "Canberra", "Brisbane" }, "C", "Medium"),
				new ModelQuiz("What is the longest continental mountain range in the world?",
						new String[] { "The Himalayas", "The Andes", "The Rocky Mountains", "The Alps" }, "B", "Hard"));
	}

	public static List<ModelQuiz> popCultureQuiz() {
		return List.of(new ModelQuiz("Which film won Best Picture at the 96th Academy Awards in March 2024?",
				new String[] { "Barbie", "Poor Things", "Oppenheimer", "Killers of the Flower Moon" }, "C", "Easy"),
				new ModelQuiz("In Zootopia 2, Judy and Nick go undercover to track down which new reptile species?",
						new String[] { "Chameleons", "Geckos", "Komodo dragons", "Snakes" }, "D", "Medium"),
				new ModelQuiz("Which superstar won Album of the Year for Cowboy Carter?",
						new String[] { "Taylor Swift", "Beyoncé", "Kacey Musgraves", "Chappell Roan" }, "B", "Hard"));
	}

	public String getText() {
		return text;
	}

	public String[] getChoices() {
		return choices;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public String getDifficulty() {
		return difficulty;
	}

}
