import java.util.ArrayList;

public class PrimeGeneration {
	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ls = new ArrayList<Integer>();
		if(n<=2)
			return ls;
		for(int i = 2; i < n; i++){
			if(isPrime(i)){
				ls.add(i);
			}
		}
		return ls;
	}

	public static boolean isPrime(int n) {
		int nbegin = n;
		for (int x = 2; x <= Math.sqrt(nbegin); x++) {
			while (n % x == 0) {
				n = n / x;
				return false;
			}
		}
		return true;
	}

}
