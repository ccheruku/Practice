
public class PrimeNumberTest {

	public static void checkPrime(int n) {
		boolean flag = false;
		int m = n / 2;
		if( n == 0 || n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for(int i = 2; i <= m; i++) {
				if(n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = true;
					break;
				}
			}
			if (flag == false) {
				System.out.println(n + " is prime number");
			}
/*			1 is not prime number
			3 is prime number
			17 is prime number
			20 is not prime number
*/
		}
	}
	public static void main(String args[]) {
		checkPrime(1);
		checkPrime(3);
		checkPrime(17);
		checkPrime(20);
	}
}
