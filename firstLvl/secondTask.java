package firstlvl;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class secondTask {

  public static void main(String[] args) {
    File file = new File("firstlvl/example.txt");
    int count = 0;

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        scanner.nextLine();
        count++;
      }
    } catch (IOException e) {
      System.out.println("Помилка читання файлу: " + e.getMessage());
    }

    System.out.println("Кiлькiсть рядкiв: " + count);
  }
}
