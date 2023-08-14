package practiseloop;

public class praticeloop1 {
	void series() {
		int i = 2;
		do {
			System.out.print(" " + i);
			i += 2;
		} while (i <= 20);

		System.out.println();

		i = 5;
		do {
			System.out.print(" " + i);
			i += 5;
		} while (i <= 50);

		System.out.println();

		i = 10;
		do {
			System.out.print(" " + i);
			i += 10;
		} while (i <= 100);

		System.out.println();

		int num = 1;
		i = 1;
		do {
			System.out.print(" " + (9 * i));
			i++;
		} while (i <= 10);

		System.out.println();

		i = 1;
		do {
			System.out.print(" " + i * i);
			i++;
		} while (i <= 10);

		System.out.println();

		i = 1;
		do {
			System.out.print(" " + i * 3);
			i++;
		} while (i <= 10);

		System.out.println();

		i = 1;
		do {
			System.out.print(" " + i * 7);
			i++;
		} while (i <= 10);

		System.out.println();

		i = 2;
		do {
			System.out.print(" " + i * 2);
			i += 2;
		} while (i <= 20);

		System.out.println();

		i = 1;
		do {
			System.out.print(" " + i * 6);
			i++;
		} while (i <= 10);

		System.out.println();

		i = 1;
		do {
			System.out.print(" " + i);
			i++;
		} while (i <= 5);
		i = 4;
		do {
			System.out.print(i + "");
			i--;
		} while (i >= 1);

		System.out.println();

		int x = 1;
		int r = 1;
		do {
			r *= 10;
			System.out.print(" " + x);
			x++;
		} while (r < 50);

		System.out.println();

		int k = 1;
		do {
			if (k % 2 != 0) {
				System.out.print(" " + k);
			} else {
				System.out.print(" -" + k); // -k
			}
			k++;
		} while (k <= 10);
	}

	public static void main(String[] args) {
		praticeloop1 num = new praticeloop1();
		num.series();
	}
}
