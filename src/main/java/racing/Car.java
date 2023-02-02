package racing;

public class Car {

  private String name;
  private int position;

  public Car(String name) {
    if (name.length() > 5) {
      throw new IllegalArgumentException();
    }
    this.name = name;
    this.position = 0;
  }

  public String getName() {
    return name;
  }

  public int getPosition() {
    return position;
  }

  public void move() {
    if (isOver4()) {
      position++;
    }
  }

  private boolean isOver4() {
    return (int) (Math.random() * 10) >= 4;
  }
}
