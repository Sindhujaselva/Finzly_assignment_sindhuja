package practiseloop;

public class Sample {
	void Number() {
		for (int i = 0; i <= 25; i++) {
			System.out.println(i);
		}
		System.out.println("*********");

		for (int i = 25; i >= 0; i--) {
			System.out.println(i);
		}
		System.out.println("*********");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}
		System.out.println("*********");

		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

		System.out.println("*********");

		for (int i = -45; i <= 45; i++) {
			System.out.println(i);

		}

		System.out.println("*********");

		for (int i = 50; i <= 100; i++) {
			System.out.println(i);

		}
		System.out.println("*********");

		for (int i = 30; i <= 50; i++) {
			System.out.println(i);

		}

		System.out.println("*********");

		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

		}
		System.out.println("*********");

		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
			// System.out.println("hello");

		}

		System.out.println("*********");
		int c = 0;
		int a = 0;

		for (int i = 1; i <= 25; i++) {

			if (i % 2 != 0) {
				c++;
				// System.out.println(i);
			} else {
				a++;

			}

		}
		System.out.println("odd no:" + c);
		System.out.println("even no " + a);

		System.out.println("************************************");
		int b = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				b = b + i;
			} else {
				a = a + i;
			}
		}
		System.out.println("sum of no:" + b);
		System.out.println("sum of odd: " + a);

	}

	public static void main(String[] args) {
		Sample n = new Sample();
		n.Number();
	}
}

// TODO Auto-generated method stub
