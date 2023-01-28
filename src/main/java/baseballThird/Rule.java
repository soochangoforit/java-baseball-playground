package baseballThird;

import java.util.List;

/**
 * 컴퓨터가 제공한 숫자와 사용자가 입력한 숫자를 비교하여
 * 스트라이크와 볼의 개수를 제공한다.
 */
public class Rule {

  public int correctStrike(List<Integer> computer, List<Integer> player) {
    int count = 0;
    for (int i = 0; i < computer.size(); i++) {
      count = plusStrike(computer, player, count, i);
    }
    return count;
  }

  private static int plusStrike(List<Integer> computer, List<Integer> player, int count, int i) {
    if (computer.get(i) == player.get(i)) {
      count++;
    }
    return count;
  }


  public int hasNumberCount(List<Integer> computer, List<Integer> player) {
    return (int) player.stream()
        .filter(number -> computer.contains(number))
        .count();
  }



}
