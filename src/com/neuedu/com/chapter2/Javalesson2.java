package com.neuedu.com.chapter2;

public class Javalesson2 {
/*public static void main(String[] args) {
	//十进制
	int a=10;
	
	//十六进制
	int b=0X10;
	//八进制
	int c=010;
	//八进制
	int d=0B100;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	//进制互转
	//十进制转十六、八、二(短除法)
	//十六、八、二转十进制(权加法)
	//十六进制与二进制互转、八进制与二进制互转
	
	//十进制转换其他进制
	System.out.println(Integer.toBinaryString(100));
	System.out.println(Integer.toHexString(100));
	System.out.println(Integer.toOctalString(100));
}*/
/*public static void main(String[] args) {
	float a = -3.12525114254e+38f;
	double b=3.14;
	double c=314.0;
	double d=.314;
	
	double e=3.124e2;
	double f=3.14e-1;
	System.out.println(a);
	System.out.println(e);
	System.out.println(f);
	double x=0.1;
	double y=0.1;
	System.out.println(x*y);
	//如果需要计算浮点数计算绝对精确，BigDecimal
	
}*/
/*public static void main(String[] args) {
	
	 *\r回到行首
	 *\n换行
	 *在eclipse工具中两个效果一样
	 *
	 *\b退格
	 *\t表示一个tab空格
	 *在eclipse测试不出来
	 * 
	 * 0-9:十进制48
	 * A-Z:十进制65
	 * a-z:十进制97
	 * 
	
	 
	 
	char a ='a';
	char b='中';
	char c='\u03A6';
	char d='\t';
	char e='\'';
	char f='\\';
	String g="\"";
	System.out.println(a);
	System.out.println(b);
	System.out.println('\b');
	System.out.println(c);
	System.out.println(d);
	System.out.println('\r');
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	boolean flag =true;
	boolean flag2=false;
}
}*/
public static void main(String[] args) {
	//a目标类型 100源类型
	//隐式类型转换
	double a=100;
	int x=100;
	//隐式类型转换
	long y=200;
	double z=12.34;
	//在数学运算时，也有类型转换
	System.out.println(x+y+z);
	int i=5;
	//数据溢出
	byte j=(byte)i;
	System.out.println(j);
	char c='a';
	int k=c;
	System.out.println(k);
	int kk=97;
	char cc=(char)kk;
	long xx=88;
	int yy=(int)xx;
	System.out.println(cc);
}
}