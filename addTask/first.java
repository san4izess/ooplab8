package addTask;

import java.util.Scanner;

public class first {

  public static void main(String[] args) {
    // Заголовок теста
    System.out.println("Тест з програмування:");

    // Спосіб 1: тест з вбудованими питаннями та варіантами відповіді
    String[] questions = {
      "Який тип даних використовується для зберігання цілих чисел?",
      "Що таке оператор if-else?",
      "Яке ключове слово використовується для створення нового об'єкту в Java?",
      "Що таке масив?",
      "Що таке метод?",
    };
    String[][] options = {
      { "int", "double", "float", "char" },
      { "цикл", "вираз", "розгалуження", "операція присвоєння" },
      { "new", "create", "instance", "allocate" },
      {
        "тип даних",
        "колекція",
        "структура даних",
        "множина значень одного типу даних",
      },
      { "об'єкт", "клас", "функція", "змінна" },
    };
    int[] answers = { 0, 2, 0, 3, 2 };
    int score = runTest(questions, options, answers);
    System.out.println(
      "Результат: " + score + " з " + questions.length + " балів."
    );
  }

  public static int runTest(
    String[] questions,
    String[][] options,
    int[] answers
  ) {
    Scanner scanner = new Scanner(System.in);
    int score = 0;
    for (int i = 0; i < questions.length; i++) {
      // Print the question
      System.out.println(questions[i]);

      // Print the answer options
      for (int j = 0; j < options[i].length; j++) {
        System.out.println((j + 1) + ". " + options[i][j]);
      }

      // Get the user's answer
      System.out.print("Введіть номер відповіді: ");
      int userAnswer = scanner.nextInt() - 1;

      // Check if the user's answer is correct
      if (userAnswer == answers[i]) {
        System.out.println("Правильно!");
        score++;
      } else {
        System.out.println(
          "Неправильно. Правильна відповідь: " + (answers[i] + 1)
        );
      }

      System.out.println();
    }
    scanner.close();
    return score;
  }
}
