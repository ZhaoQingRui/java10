package com.neuedu.com.chapter2;

public class lianxi {

	public static void main(String[] args) {
		//1.已知a,b均是整型变量，写出将a,b两个变量中的值互换的程序。
		int a =10; int b=20;
		int c = 0;
		c=b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);
		//2.给定一个0～1000的整数，求各位数的和，例如345的结果是3+4+5＝12注：分解数字既可以先除后模也可以先模后除。
		//公式：先除后模a/位数%10
		
        int a1=416; int b1=416/100; int c1=416/10%10; int d1=416%10;
        System.out.println(b1+c1+d1);
		//3.华氏温度和摄氏温度互相转换，
        //从华氏度变成摄氏度你只要减去32，乘以5再除以9
        //就行了，将摄氏度转成华氏度，直接乘以9，除以5，再加上32即行。
        double C=32.5;
        double F=C*9/5+32;
        double C1=(F-32)*5/9; 
        System.out.println(F);
        System.out.println(C1);
		//4.给定一个任意的大写字母A~Z，转换为小写字母。
        char BigLetter= 'A';
        char SmallLetter= (char)(BigLetter+32);
        System.out.println(SmallLetter);

	}

}
