package baseballSecond;

import java.util.List;

public class Referee {
  public String compare(List<Integer> computer, List<Integer> players) {
    Judgment judgment = new Judgment();
    int correctCount = judgment.correctCount(computer, players);

    if (correctCount == 0) {
      return "낫싱";
    }

    int strikeCount = 0;
    for (int i = 0; i < players.size(); i++) {
      if (judgment.hasPlace(computer, i, players.get(i))) {
        strikeCount++;
      }
    }

    int ball = correctCount - strikeCount;



    return strikeCount + " 스트라이크 " + ball + " 볼";
  }
}
