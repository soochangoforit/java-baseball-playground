package baseballSecond;

import java.util.List;

public class Judgment {

  public int correctCount(List<Integer> computer, List<Integer> players) {

    int count = 0;
    for (Integer number : players) {
      if (computer.contains(number)) {
        count++;
      }
    }

    return count;
  }

  public boolean hasPlace(List<Integer> computer, List<Integer> players) {
    return false;
  }

}
