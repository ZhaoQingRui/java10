package chapter3;

public class whileex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		double sum=10000;
		int i=3;
		//控制循环次数
		while (i<3)
		{
			sum*=(1+0.04);
			i++;
		}
		System.out.println(sum);

	}

}
