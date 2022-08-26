public class Swallow extends FlyingBird {

  public Swallow() {
      Zoo.birds.add(this);
  }

  @Override
  public String toString() {
      return this.getClass().getName();
  }
}
