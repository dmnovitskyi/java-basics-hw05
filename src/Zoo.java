import java.util.List;
import java.util.ArrayList;


public class Zoo {

  static ArrayList<Bird> birds = new ArrayList<>();

  public static void feed(List<? extends Bird> list) {
    System.out.println("Throwing seeds");
    for (Bird value : list) {
      value.eat();
    }
  }

  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    System.out.println("Interviewing a bird");
    bird.checkWings();
    list.add(bird);
    System.out.println(list);
  }

  public static void registerBird(List<Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    System.out.println(list);
  }
}