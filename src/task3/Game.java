package task3;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Game {
  public static final int MAX_ANSWERS_COUNT = 4;

  private List<Question> questions = new ArrayList<>();
  private List<Integer> answers = new ArrayList<>();
  private int i = 0;

  public void addQuestion(@NotNull String question,
                          int correctAnswer, @NotNull String... answers) {
    questions.add(new Question(question, answers));
    this.answers.add(correctAnswer);
  }

  public Question getNextQuestion() {
    if (i != questions.size()) {
      return questions.get(i++);
    } else {
      return null;
    }
  }

  public boolean checkAnswer(Question q, int answer) {
    return answers.get(questions.indexOf(q)).equals(answer-1);
  }
}
