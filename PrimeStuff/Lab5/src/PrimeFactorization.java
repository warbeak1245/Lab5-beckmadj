import java.util.ArrayList;


public class PrimeFactorization {

	public static ArrayList<Integer> generatePrimes(int n){
		ArrayList<Integer> ls = new ArrayList<Integer>();
		if (n == 0){
			return ls;
		}
		while(n%2 == 0)
		{
			ls.add(2);
			n = n/2;
		}
			
		if (n > 1)
			ls.add(n);
		return ls;
			
	}

}
