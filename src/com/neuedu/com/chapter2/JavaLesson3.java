package com.neuedu.com.chapter2;

public class JavaLesson3 {
public static void main(String[] args) {
	/* int a=5;
	 int b=2;
	 double c=(double)(5/2);
	 //a+b�ĺ��ǣ�=>����ƴ��
	 System.out.println("a+b�ĺ�"+(a+b));
	 System.out.println("a-b�Ĳ���"+(a-b));
	 System.out.println("a��b�Ļ���"+(a*b));
	 System.out.println(c);*/
	 //��ӡ�����ǰ೤
	 String str="ëë";
	 System.out.println(str+"�ǰ೤");
	 int money=5000;
	 //���У�Ǯ
	 System.out.println("����"+money+"Ǯ");
	 //�����еĸ���
	 System.out.println(5/2);//�������������һ��
	 System.out.println(5/-2);
	 System.out.println(-5/2);
	 System.out.println(-5/-2);
	 
	 System.out.println(5%2);//����뱻���������й�
	 System.out.println(5%-2);
	 System.out.println(-5%2);
	 System.out.println(-5%-2);
	 //�������Լ�
	 int x=1;
	 //���ú��
	 //x++;
	 //�ȼӺ���
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
	 //��ֵ�����
	 int a=100;
	 int b=2;
	 b+=a;//b=b+a
	 b-=a;//b=b-a
	 b*=a;//b=b*a
	 b/=a;//b=b/a
	 b%=a;//b=b%a
	 //��ϵ�����
	 //>��>=��<��<=��==��!=
	 //��ϵ����Ľ����boolean
	 System.out.println(a>b);
	 boolean flag= a==b;
	 
	 //�߼������
	 boolean x3=true;
	 boolean y3=false;
	 System.out.println(x3&&y3);//false
	 System.out.println(x3||y3);//true
	 System.out.println(!x3);//false
	 System.out.println(!y3);//true
	 System.out.println(x3^y3);//��ͬΪfalse����ͬΪtrue
	 
	 int a1=100;
	 int b1=200;
	 int c1=300;
	 //&& ||��·����
	 boolean flag1=a1<b1  &&  b1++<c1;
	 System.out.println(b1);
	 boolean flag2=a1<b1  ||  b1++>c1;
	 System.out.println(b1);
     //&��|����·����
	 int x2=200;
	 int y2=300;
	 int z2=400;
	 boolean b2= x2>y2&y2++<z2;
	 System.out.println(y2);
	 //��Ŀ�����
	 char sex='F';
	 String str1 =sex=='F'?"Ů":"��";
	 System.out.println(str);
	 int xx=10;int yy=20;int zz=30;
	 int max=xx>yy?xx:yy;
	 max=max>zz?max:zz;
	 System.out.println(max);
}
}
