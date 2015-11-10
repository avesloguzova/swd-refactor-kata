package task3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by av on 11/10/15.
 */
public class GameTest {
  public static final String QUESTION = "q1";
  public static final String a0 = "1";
  public static final String a1 = "2";
  public static final String a2 = "3";
  public static final String a3 = "4";
  private Game game;

  @Before
  public void initGame() {
    game = new Game();
  }

  @Test
  public void addQuestionTest() throws Exception {
    game.addQuestion(QUESTION, 0, a0, a1, a2, a3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void addEmptyQuestionTest() throws Exception {
    game.addQuestion("", 0, "", "", "", "");
  }

  @Test(expected = IllegalArgumentException.class)
  public void addLessThenFourAnswers() throws Exception {
    game.addQuestion(QUESTION, 0, "", "", "");

  }

  @Test(expected = IllegalArgumentException.class)
  public void addMoreThenFourAnswers() throws Exception {
    game.addQuestion(QUESTION, 0, "", "", "", "", "");
  }

  @Test
  public void testGetNextQuestion() throws Exception {
    game.addQuestion(QUESTION, 0, a0, a1, a2, a3);
    Question nextQuestion = game.getNextQuestion();
    assertNull(game.getNextQuestion());
    assertEquals(QUESTION, nextQuestion.getQuestion());
  }

  @Test
  public void testCheckAnswer() throws Exception {
    game.addQuestion(QUESTION, 0, a0, a1, a2, a3);
    Question nextQuestion = game.getNextQuestion();
    assertTrue(game.checkAnswer(nextQuestion, 1));
  }
}