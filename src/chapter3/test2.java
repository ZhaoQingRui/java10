package chapter3;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4��һ�󡣰��겻��400������
		int year =2556;
		if (year%400==0){
			System.out.println("����������");
		}
		else if (year%4==0&&year %100!=0)
		{
			System.out.println("����������");
		}
		else{
			System.out.println("���겻��������");
		}

	}

}
