package leetcode.string;

public class IntegertoRoman {
  public String intToRoman(int num) {
    if (num <= 10) {
      return toRoman(num);
    }
    StringBuilder builder = new StringBuilder();
    int thousands = num / 1000;
    for (int i = 0; i < thousands; i++) {
      builder.append(toRoman(1000));
    }
    num = num - thousands * 1000;
    int hundreds = num / 100;
    if (isSubtraction(hundreds)) {
      builder.append(toRoman(hundreds * 100));
    } else {
      if (hundreds < 5) {
        for (int i = 0; i < hundreds; i++) {
          builder.append(toRoman(100));
        }
      } else {
        builder.append(toRoman(500));
        for (int i = 0; i < hundreds - 5; i++) {
          builder.append(toRoman(100));
        }
      }
    }
    num = num - hundreds * 100;
    int tens = num / 10;
    if (isSubtraction(tens)) {
      builder.append(toRoman(tens * 10));
    } else {
      if (tens < 5) {
        for (int i = 0; i < tens; i++) {
          builder.append(toRoman(10));
        }
      } else {
        builder.append(toRoman(50));
        for (int i = 0; i < tens - 5; i++) {
          builder.append(toRoman(10));
        }
      }
    }
    num = num - tens * 10;

    builder.append(toRoman(num));

    return builder.toString();
  }

  public String toRoman(int num) {
    switch (num) {
      case 1:
        return "I";
      case 2:
        return "II";
      case 3:
        return "III";
      case 4:
        return "IV";
      case 5:
        return "V";
      case 6:
        return "VI";
      case 7:
        return "VII";
      case 8:
        return "VIII";
      case 9:
        return "IX";
      case 10:
        return "X";
      case 40:
        return "XL";
      case 50:
        return "L";
      case 90:
        return "XC";
      case 100:
        return "C";
      case 400:
        return "CD";
      case 500:
        return "D";
      case 900:
        return "CM";
      case 1000:
        return "M";
      default:
        return "";
    }
  }

  boolean isSubtraction(int num) {
    return num == 4 || num == 9;
  }
}
