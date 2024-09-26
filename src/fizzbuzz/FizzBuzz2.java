package fizzbuzz;

public class FizzBuzz2 {

	public static void main(String[] args) {
		String fizz = " Fizz";
		String buzz = " Buzz";
		for(int i = 1; i <= 100; ++i) {
			System.out.print(i);
			if (isDivisibleBy3(i)) {
					System.out.print(fizz);
				}
			if (isDivisibleBy5(i)) {
					System.out.print(buzz);
				}
			System.out.println();
		}
			
	}
	static boolean isDivisibleBy3(int num) {
		return num % 3 == 0;
	}
	
	static boolean isDivisibleBy5(int num) {
		return num % 5 == 0;
	}

}
