package fizzbuzz;

public class FizzBuzz3 {

	public static void main(String[] args) {
		String fizz = " Fizz";
		String buzz = " Buzz";
		String actualSpace = "";
		for (int i = 1; i <= 100; ++i) {
			actualSpace = addSpace(i);
			System.out.print(actualSpace + i);
			if (isDivisibleBy3(i)) {
				System.out.print(fizz);
			}
			if (isDivisibleBy5(i)) {
				System.out.print(buzz);
			}
			System.out.println();
		}
	}
	static String addSpace(int num) {
		if (num < 10) {
			return "  ";
		}
		else if (num < 100) {
			return " ";
		}
		else {
			return "";
		}
	}
	
	static boolean isDivisibleBy3(int num) {
		return num % 3 == 0;
	}
	
	static boolean isDivisibleBy5(int num) {
		return num % 5 == 0;
	}
}
