package leecode;

public class CountPrimes {

	public static void main(String[] args) {
		//		System.out.println(countPrimes(10));
		//		System.out.println(countPrimes(1));
		//		System.out.println(countPrimes(12));
		System.out.println(countPrimes(2));
		System.out.println(countPrimes(15000));
	}

	public static int countPrimes(int n) {
		boolean[] isPrime = new boolean[n+1];
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime[i] == false) {
				count++;
				for (int j = 2; i*j <= n; j += 1) {
					isPrime[i*j] = true;
				}
			}
		}
		return count;
	}

}
