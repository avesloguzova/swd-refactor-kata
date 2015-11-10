package task3;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class Question {
  private final String q;
  private final String[] answers;


  public Question(@NotNull String q, String... answers) {
    if (q.isEmpty()) {
      throw new IllegalArgumentException("Question can't be empty");
    }
    if (answers.length != Game.MAX_ANSWERS_COUNT) {
      throw new IllegalArgumentException("Wrong answers count");
    }
    for (String answer : answers) {
      if (answer.isEmpty()) {
        throw new IllegalArgumentException("Answer can't be empty");
      }
    }
    this.q = q;
    this.answers = answers;

  }

  public String getQuestion() {
    return q;
  }

  public String getAnswer(int number) {
    return answers[number];
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Question question = (Question) o;

    if (!q.equals(question.q)) return false;
    // Probably incorrect - comparing Object[] arrays with Arrays.equals
    return Arrays.equals(answers, question.answers);

  }

  @Override
  public int hashCode() {
    int result = q.hashCode();
    result = 31 * result + Arrays.hashCode(answers);
    return result;
  }
}
