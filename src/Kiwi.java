public class Kiwi extends NonFlyingBird {

    public Kiwi() {
        Zoo.birds.add(this);
  }

  @Override
  public String toString() {
      return this.getClass().getName();
  }
}
