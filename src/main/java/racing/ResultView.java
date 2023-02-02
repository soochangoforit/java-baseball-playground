package racing;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

  public void printMove(Car car) {
    System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
  }



  public void printPosition(List<Car> cars) {
    for (Car car : cars) {
      printMove(car);
    }
  }

  public void printWinner(List<Car> cars) {
    // pobi, honux가 최종 우승했습니다.
    String result = cars.stream()
        .map(car -> car.getName())
        .collect(Collectors.joining(", "));

    if (result.isEmpty()) {
      System.out.println("우승자가 없습니다.");
      return;
    }
    System.out.println(result + "가 최종 우승했습니다.");
  }

  public void printFinalPosition(List<Car> cars) {
    cars.stream().forEach(car -> printMove(car));
  }





  public void printEmptyLine() {
    System.out.println();
  }

}
