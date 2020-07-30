package chapter3;

public class afterclassex 
{

	public static void main(String[] args) 
	{
		double sum=1000000;
		int year=1;
		while (year<4)
		{
			sum*=(1+0.04);
			year++;
		}
		System.out.println("存3年所获本加利"+sum);
		System.out.println("存3年每月利息"+(sum-1000000)/36);
		//若存一年取出来，则按3%计算利息，第一年已经
		//按照4%计算利息则需要计算差额利息，银行则在1000000里将差额利息扣除，计算扣除后给客户的钱
		double sum2 = 1000000;
		int year2=1;
		while(year2<2)
		{
			sum2*=(1+0.003);
			year2++;
		}
		System.out.println("存1年每月利息"+(sum2-1000000)/12);
		System.out.println("利息差额"+((sum-1000000)/36-(sum2-1000000)/12));
		System.out.println("银行扣除后"+(1000000+(((sum-1000000)/36-(sum2-1000000)/12))*12));	
	}
}

