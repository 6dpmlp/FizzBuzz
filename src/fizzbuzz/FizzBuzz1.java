package fizzbuzz;

public class FizzBuzz1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; ++i) {
			System.out.print(i);
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(" can be divided by 15");
			}
			else if (i % 3 == 0) {
				System.out.print(" can be divided by 3");
				
			}
			else if (i % 5 == 0) {
				System.out.print(" can be divided by 5");
			}
			System.out.println();
		}
	}
}
