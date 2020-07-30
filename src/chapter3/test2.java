package chapter3;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4年一润。百年不润，400年再闰
		int year =2556;
		if (year%400==0){
			System.out.println("该年是闰年");
		}
		else if (year%4==0&&year %100!=0)
		{
			System.out.println("该年是闰年");
		}
		else{
			System.out.println("该年不是是闰年");
		}

	}

}
