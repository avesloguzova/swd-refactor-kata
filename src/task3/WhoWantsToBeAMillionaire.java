package task3;

import java.util.Scanner;

/**
 * Simplify and make Game API more robust where possible
 */
public class WhoWantsToBeAMillionaire {
  public static void main(String[] args) {
    Game game = new Game();
    game.addQuestion("What is the Capital of Great Britain?", 3, "Paris", "Karaganda", "Dublin", "London");
    game.addQuestion("Who is the author of Godfather novel?", 1, "Hemingway", "Puzo", "Vonnegut", "Tolstoy");
    game.addQuestion("What is the distance to the Moon?", 2, "156 000 km", "384 000 km", "432 000 km", "521 000 km");

    Scanner scanner = new Scanner(System.in);
    for (Question q = game.getNextQuestion(); q != null; q = game.getNextQuestion()) {
      System.out.println(q.getQuestion());
      for (int i = 0; i < Game.MAX_ANSWERS_COUNT; i++) {
        System.out.println("1. " + q.getAnswer(i));

      }

      int playerGuess = scanner.nextInt();
      if (!game.checkAnswer(q, playerGuess)) {
        throw new RuntimeException("You failed!");
      }
      System.out.println("Correct!");
    }

    System.out.println("Take your Million!");
  }
}
