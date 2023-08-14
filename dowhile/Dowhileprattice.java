package practiseloop;

public class Dowhileprattice {
	    void Number() {
	        int i = 0;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 25);
	        System.out.println("*********");

	        i = 25;
	        do {
	            System.out.println(i);
	            i--;
	        } while (i >= 0);
	        System.out.println("*********");

	        i = 0;
	        do {
	            if (i % 2 == 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= 100);
	        System.out.println("*********");

	        i = 0;
	        do {
	            if (i % 2 != 0) {
	                System.out.println(i);
	            }
	            i++;
	        } while (i <= 100);
	        System.out.println("*********");

	        i = -45;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 45);
	        System.out.println("*********");

	        i = 50;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 100);
	        System.out.println("*********");

	        i = 30;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 50);
	        System.out.println("*********");

	        i = 1;
	        do {
	            System.out.println(i);
	            i++;
	        } while (i <= 100);
	        System.out.println("*********");

	        i = 100;
	        do {
	            System.out.println(i);
	            i--;
	        } while (i >= 1);
	        System.out.println("*********");

	        int c = 0;
	        int a = 0;
	        i = 1;
	        do {
	            if (i % 2 != 0) {
	                c++;
	            } else {
	                a++;
	            }
	            i++;
	        } while (i <= 25);
	        System.out.println("odd no:" + c);
	        System.out.println("even no " + a);
	        System.out.println("************************************");

	        int b = 0;
	        i = 1;
	        do {
	            if (i % 2 == 0) {
	                b = b + i;
	            } else {
	                a = a + i;
	            }
	            i++;
	        } while (i <= 50);
	        System.out.println("sum of no:" + b);
	        System.out.println("sum of odd: " + a);
	    }

public static void main(String[] args) {
	        Dowhileprattice n = new Dowhileprattice();
	        n.Number();
	    }
	}



