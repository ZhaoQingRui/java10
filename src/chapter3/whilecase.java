package chapter3;

public class whilecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		while(x<3)
		{
			System.out.println("x="+x);
			x++;
		}
		int x2=1;
		int sum=0;
		while(x2<=100){
			sum+=x2;
			x2++;
		}
		System.out.println("sum="+sum);
		int x3=8;
		int sum2=1;
		while(x3>0){
			sum2*=x3;
		    x3--;	
		}
		System.out.println("sum2="+sum2);
		double sum3=0;
		double i=1;
		while(i<=100){
			sum3+=1/i;
			i++;
		}
		System.out.println("sum="+sum3);
			
	}

}
