package leecode;

public class ComplexNumberMultiplication {
	public static void main(String[] args) {
		String a = "1+-1i", b = "1+1i";
		new ComplexNumberMultiplication().complexNumberMultiply(a, b);
	}
	public String complexNumberMultiply(String a, String b) {
		String[] splitA = a.split("\\+");
		String[] splitB = b.split("\\+");

		Integer O1 = Integer.valueOf(splitA[0]) * Integer.valueOf(splitB[0]);
		Integer O2 = Integer.valueOf(splitA[0]) * Integer.valueOf(splitB[1].split("i")[0]);
		Integer O3 = Integer.valueOf(splitA[1].split("i")[0]) * Integer.valueOf(splitB[0]);
		Integer O4 = Integer.valueOf(splitA[1].split("i")[0]) * Integer.valueOf(splitB[1].split("i")[0]);
		O4 = -O4;
		Integer real = O1 + O4;
		Integer imaginerary = O2 + O3;

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(real);
		stringBuilder.append("+");

		stringBuilder.append(imaginerary + "i");
		return stringBuilder.toString();
	}
}
