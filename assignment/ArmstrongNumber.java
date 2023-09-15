package assignment;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int num = 153;
		//int leng = 3;
		int sum = 0;
		
		for(int i =num;i>0;i/=10) {
			int rem = i%10;
			int power = 1;
			 for(int j=1;j<=5;j++) {
				 power = power* rem;
				 
			 }
			 sum = sum +power; 
		}
		System.out.println(sum);
		if(sum == num) {
			System.out.println("Given number is Armstrong");
		}else {
			System.out.println("Given number is not Armstrong");
		}
	}

}
