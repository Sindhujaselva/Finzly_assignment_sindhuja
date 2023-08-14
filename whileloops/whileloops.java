package practiseloop;

public class whileloops {
	void method1() {
		int num = 2;
		while (num <= 20) {
		    System.out.print(num + " ");
		    num += 2;
		}
		num = 9;
		while (num <= 90) {
		    System.out.print(num + " ");
		    num += 9;
		}
		 num = 1;
		while (num <= 10) {
		    if (num % 2 == 0) {
		        System.out.print(-num + " ");
		    } else {
		        System.out.print(num + " ");
		    }
		    num++;
		}
		 num = 5;
		while (num <= 50) {
		    System.out.print(num + " ");
		    num += 5;
		}
		int base = 1;
		int power = 0;
		while (power <= 3) {
		    System.out.print(base + " ");
		    base *= 10;
		    power++;
		}
		 num = 1;
		int sum = 0;
		while (num <= 9) {
		    sum += num;
		    System.out.print(sum + " ");
		    num++;
		}
		 num = 8;
		while (num <= 80) {
		    System.out.print(num + " ");
		    num += 8;
		}
		int prev = 0;
		int curr = 1;
		System.out.print(prev + " " + curr + " ");
		int i = 2;
		while (i < 9) {
		    int next = prev + curr;
		    System.out.print(next + " ");
		    prev = curr;
		    curr = next;
		    i++;
		}
		num = 1;
		while (num <= 10) {
		    System.out.print(num * num + " ");
		    num++;
		}
		 num = 3;
		while (num <= 30) {
		    System.out.print(num + " ");
		    num += 3;
		}
		num = 7;
		while (num <= 70) {
		    System.out.print(num + " ");
		    num += 7;
		}
        num = 4;
		while (num <= 40) {
		    System.out.print(num + " ");
		    num += 4;
		}
		num = 10;
		while (num <= 100) {
		    System.out.print(num + " ");
		    num += 10;
		}
		 num = 1;
		while (num <= 5) {
		    System.out.print(num + " ");
		    num++;
		}
		num = 4;
		while (num >= 1) {
		    System.out.print(num + " ");
		    num--;
		}
		num = 6;
		while (num <= 60) {
		    System.out.print(num + " ");
		    num += 6;
		}






		

		

		


		





	}
	public static void main(String[] args) {
		whileloops n1 = new whileloops();
		n1.method1();
		
		
	}

}
