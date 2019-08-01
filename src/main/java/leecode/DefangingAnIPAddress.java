package leecode;

public class DefangingAnIPAddress {
  public static String defangIPaddr(String address) {
    StringBuilder builder = new StringBuilder();

    char[] chars = address.toCharArray();

    for (char ch: chars) {
      if (ch == '.') {
        builder.append("[");
        builder.append(ch);
        builder.append("]");
      } else {
        builder.append(ch);
      }
    }

    return builder.toString();
  }

  public static void main(String[] args) {
    assert defangIPaddr("1.1.1.1").equals("1[.]1[.]1[.]1");
  }
}
