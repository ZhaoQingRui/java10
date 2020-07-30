package chapter3;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i=1;
		do{
			sum+=i;
			i=i+2;	
		}while(i<=100);
		System.out.println("sum="+sum);

	}

}
