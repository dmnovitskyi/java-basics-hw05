public class Penguin extends NonFlyingBird{

  public Penguin() {
      Zoo.birds.add(this);
  }

  @Override
  public String toString() {
      return this.getClass().getName();
  }
}
