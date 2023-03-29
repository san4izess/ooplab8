package secondlvl;

import java.nio.file.Path;
import java.nio.file.Paths;

public class firstTask {

  public static void main(String[] args) {
    Path path1 = Paths.get("C:/Users/Саша/Desktop");
    Path path2 = Paths.get("C:/Users/Саша/Desktop/ooplab8/secondlvl");

    Path commonPath = path1.relativize(path2).getName(0);
    System.out.println(commonPath);
  }
}
