public class Eagle extends FlyingBird {
  public Eagle() {
      Zoo.birds.add(this);
  }
  @Override
  public String toString() {
      return this.getClass().getName();
  }
}
