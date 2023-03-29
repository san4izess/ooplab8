package firstlvl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class firstTask {

  public static void main(String[] args) {
    File file = new File("firstlvl/example.txt");
    List<String> lines = new ArrayList<>();

    try (Scanner scanner = new Scanner(file)) {
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lines.add(line);
      }
    } catch (IOException e) {
      System.out.println("Помилка читання файлу: " + e.getMessage());
    }

    // використання масиву строк для зберігання інформації
    String[] array = lines.toArray(new String[0]);
    System.out.println("Масив: " + Arrays.toString(array));
  }
}
