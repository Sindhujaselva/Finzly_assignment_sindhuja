package practiseloop;

public class WhileLoop {
	void method() {
		int i = 1;
		while (i <= 25) {
			System.out.println(i);
			i++;
		}
		 i = 25;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		 i = 1;
		while (i <= 100) {
			System.out.println(i);
			i += 2;
		}
		 i = 2;
		while (i <= 100) {
			System.out.println(i);
			i += 2;
		}
		int sumOdd = 0;
		 i = 1;
		while (i <= 50) {
			sumOdd += i;
			i += 2;
		}
		System.out.println("Sum of odd numbers: " + sumOdd);
		int sumEven = 0;
		 i = 2;
		while (i <= 50) {
			sumEven += i;
			i += 2;
		}
		System.out.println("Sum of even numbers: " + sumEven);
		 i = -45;
		while (i <= 45) {
			System.out.println(i);
			i++;
		}
		 i = 50;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		 sumOdd = 0;
		 sumEven = 0;
		i = 1;
		while (i <= 100) {
			if (i % 2 == 0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
			i++;
		}
		System.out.println("Sum of odd numbers: " + sumOdd);
		System.out.println("Sum of even numbers: " + sumEven);
		 i = 1;
		while (i <= 25) {
			if (i % 2 == 0) {
				System.out.println(i + " is even");
			} else {
				System.out.println(i + " is odd");
			}
			i++;
		}
	     i = 1;
		while (i <= 100) {
			System.out.println(i);
			i++;
		}
		 i = 100;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		i = 30;
		while (i <= 50) {
			System.out.println(i);
			i++;
		}
		int countEven = 0;
		 i = 1;
		while (i <= 25) {
			if (i % 2 == 0) {
				countEven++;
			}
			i++;
		}
		System.out.println("Count of even numbers: " + countEven);
		int countOdd = 0;
		int num = 1;
		while (num <= 25) {
			if (num % 2 != 0) {
				countOdd++;
			}
			num++;
		}
		System.out.println("Count of odd numbers: " + countOdd);

	}

}
