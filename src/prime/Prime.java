package prime;

public class Prime{
	public boolean isPrime(int number) {
		boolean flag_nonprime = false;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				flag_nonprime = true;
				break;
			}
		}
		return !flag_nonprime;
	}
}