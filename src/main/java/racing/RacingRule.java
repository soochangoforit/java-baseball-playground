package racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingRule {

  int winnerPosition = 5;
  private List<Car> cars = new ArrayList<>();

  private ResultView resultView = new ResultView();



  public void getCarFromString(String carNames) {
    String[] names = carNames.split(",");
    addCars(names);
  }

  private void addCars(String[] names) {
    for (String name : names) {
      cars.add(new Car(name));
    }
  }

  public List<Car> getCars() {
    return cars;
  }

  public void moveCars() {
    for (Car car : cars) {
      car.move();
    }
  }

  public List<Car> getWinner() {
    return this.cars.stream()
        .filter(car -> car.getPosition() >= winnerPosition)
        .collect(Collectors.toList());
  }


  public void startGame(int moveCount) {
    System.out.println("실행 결과");
    for (int i = 0; i < moveCount; i++) {
      moveCars();
      resultView.printPosition(cars);
      resultView.printEmptyLine();
    }
  }


}
