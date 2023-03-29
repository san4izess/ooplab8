package secondlvl;

import java.io.*;
import java.util.Scanner;

public class secondTask {

  public static void main(String[] args) {
    File file1 = new File("secondlvl/file1.txt");
    File file2 = new File("secondlvl/file2.txt");
    File outputFile = new File("secondlvl/output.txt");

    try (
      Scanner scanner1 = new Scanner(file1);
      Scanner scanner2 = new Scanner(file2);
      PrintWriter writer = new PrintWriter(outputFile)
    ) {
      while (scanner1.hasNextInt() && scanner2.hasNextInt()) {
        int num1 = scanner1.nextInt();
        int num2 = scanner2.nextInt();
        writer.println(num1 * num2);
      }
    } catch (IOException e) {
      System.out.println("Помилка читання/запису файлу: " + e.getMessage());
    }
  }
}
