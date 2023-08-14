package practiseloop;

public class Problem {

	public static void main(String[] args) {
		int j = 0;
		int c = 0;
		
		for(int i = 1;i<=10;i++) {
			if(i%2==0) {
				j+=i;
			}
			else {
				c += i;
			}
		}
		System.out.print(j+c);
		// TODO Auto-generated method stub

	}

}
