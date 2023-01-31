package stringcalculate;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculate {

  public static int splitAndSum(String text) {
    if (isEmptyOrNull(text)) {
      return 0;
    }

    Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
    if (hasCustom(m)) {
      return sum(getNumbers(m));
    }

    if (isSplit(text)) {
      return sum(text.split(",|:"));
    }

    return Integer.parseInt(text);
  }

  private static boolean hasCustom(Matcher m) {
    return m.find();
  }

  private static String[] getNumbers(Matcher m) {
    return m.group(2).split(m.group(1));
  }

  private static boolean isSplit(String text) {
    return text.contains(",") || text.contains(":");
  }

  private static boolean isEmptyOrNull(String text) {
    return text == null || text.isEmpty();
  }

  private static int sum(String[] numbers) {

    if (isNegative(numbers)) {
      throw new RuntimeException();
    }

    int result = 0;
    for (String number : numbers) {
      result += Integer.parseInt(number);
    }
    return result;
  }

  private static boolean isNegative(String[] numbers) {
    Arrays.stream(numbers).filter(number -> Integer.parseInt(number) < 0).findAny().ifPresent(n -> {
      throw new RuntimeException();
    });
    return false;
  }
}
