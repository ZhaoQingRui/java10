package com.neuedu.com.chapter2;

public class JavaLesson3 {
public static void main(String[] args) {
	/* int a=5;
	 int b=2;
	 double c=(double)(5/2);
	 //a+b的和是？=>变量拼接
	 System.out.println("a+b的和"+(a+b));
	 System.out.println("a-b的差是"+(a-b));
	 System.out.println("a×b的积是"+(a*b));
	 System.out.println(c);*/
	 //打印出？是班长
	 String str="毛毛";
	 System.out.println(str+"是班长");
	 int money=5000;
	 //我有？钱
	 System.out.println("我有"+money+"钱");
	 //除法中的负数
	 System.out.println(5/2);//结果与正常计算一样
	 System.out.println(5/-2);
	 System.out.println(-5/2);
	 System.out.println(-5/-2);
	 
	 System.out.println(5%2);//结果与被除数正负有关
	 System.out.println(5%-2);
	 System.out.println(-5%2);
	 System.out.println(-5%-2);
	 //自增、自减
	 int x=1;
	 //先用后加
	 //x++;
	 //先加后用
	 //++x;
	 int y=++x;
	 System.out.println(x);
	 System.out.println(y);
	 int h=1;
	 h=h++;
	 System.out.println(h);
	 
	 int x1=3;
	 int y1=5;
	 int r1=++x1+x1*y1;
	 System.err.println("x1="+x1+"y1="+y1+"r1="+r1);
	 /*char c = 'a';
	    String s = "hello";
	    int i = 100;
	    float f = 2.15f;
	    double d = 5.7;
	    boolean b = true;
	    System.out.println("c=" + c);
	    System.out.println("s=" + s);
	    System.out.println("i=" + i);
	    System.out.println("f=" + f);
	    System.out.println("d=" + d);
	    System.out.println("b=" + b);
	    */
	 //赋值运算符
	 int a=100;
	 int b=2;
	 b+=a;//b=b+a
	 b-=a;//b=b-a
	 b*=a;//b=b*a
	 b/=a;//b=b/a
	 b%=a;//b=b%a
	 //关系运算符
	 //>、>=、<、<=、==、!=
	 //关系运算的结果是boolean
	 System.out.println(a>b);
	 boolean flag= a==b;
	 
	 //逻辑运算符
	 boolean x3=true;
	 boolean y3=false;
	 System.out.println(x3&&y3);//false
	 System.out.println(x3||y3);//true
	 System.out.println(!x3);//false
	 System.out.println(!y3);//true
	 System.out.println(x3^y3);//相同为false，不同为true
	 
	 int a1=100;
	 int b1=200;
	 int c1=300;
	 //&& ||短路运算
	 boolean flag1=a1<b1  &&  b1++<c1;
	 System.out.println(b1);
	 boolean flag2=a1<b1  ||  b1++>c1;
	 System.out.println(b1);
     //&、|不短路运算
	 int x2=200;
	 int y2=300;
	 int z2=400;
	 boolean b2= x2>y2&y2++<z2;
	 System.out.println(y2);
	 //三目运算符
	 char sex='F';
	 String str1 =sex=='F'?"女":"男";
	 System.out.println(str);
	 int xx=10;int yy=20;int zz=30;
	 int max=xx>yy?xx:yy;
	 max=max>zz?max:zz;
	 System.out.println(max);
}
}
