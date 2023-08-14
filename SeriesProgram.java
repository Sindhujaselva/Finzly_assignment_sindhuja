package practiseloop;

public class SeriesProgram {
	void series() {
		for(int i = 2;i<=20;i +=2) {
			System.out.print(" "+i);
			
		}
		
	System.out.println();
		
		for(int i = 5;i<=50;i +=5) {
			System.out.print(" "+i);
			
		}
		
    System.out.println();
		
		for(int i = 10;i<=100;i +=10) {
			System.out.print(" "+i);
			
		}
    System.out.println();
		
		for(int i = 1;i<=10;i++) {
			System.out.print(" "+(9*i));
			
		}
		
    System.out.println();
		
		for(int i = 1;i<=10;i++) {
			System.out.print(" "+i*i);
			
		}
		
    System.out.println();
		
		for(int i = 1;i<=10;i++) {
			System.out.print(" "+i*3);
			
		}
		
	System.out.println();
			
		for(int i = 1;i<=10;i++) {
				System.out.print(" "+i*7);
				
			}
			
	System.out.println();
				
		for(int i = 2;i<=20;i+=2) {
					System.out.print(" "+i*2);
					
				}
		
	System.out.println();
		
		for(int i = 1;i<=10;i++) {
				System.out.print(" "+i*6);
			
		}
     System.out.println();
		
		for(int i = 1;i<=5;i++) {
				System.out.print(" "+i);
				if(i==5) {
					for(int j=4;j>0;j--) {
						System.out.print(j+"");
					}
				}
      System.out.println();
				
				int val = 1;
				
				for(i =1;i<=4;i++) {
					System.out.print(" "+val);
					val *=10;
					
				}
				
				
//	 System.out.println();
//				
//				for(int k = 1;k<=10;k++) {
//					if(k%2!=0) {
//						System.out.print(" "+k);
//					}
//					else {
//						System.out.print(-k);
//					}
//	}
    	}			
				
			
		
		
		
		
	
		
		
		
	}

	public static void main(String[] args) {
		
		SeriesProgram num = new SeriesProgram();
		num.series();
		// TODO Auto-generated method stub

	}

}
