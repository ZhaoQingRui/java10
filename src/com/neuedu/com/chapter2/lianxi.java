package com.neuedu.com.chapter2;

public class lianxi {

	public static void main(String[] args) {
		//1.��֪a,b�������ͱ�����д����a,b���������е�ֵ�����ĳ���
		int a =10; int b=20;
		int c = 0;
		c=b;
		b=a;
		a=c;
		System.out.println(a);
		System.out.println(b);
		//2.����һ��0��1000�����������λ���ĺͣ�����345�Ľ����3+4+5��12ע���ֽ����ּȿ����ȳ���ģҲ������ģ�����
		//��ʽ���ȳ���ģa/λ��%10
		
        int a1=416; int b1=416/100; int c1=416/10%10; int d1=416%10;
        System.out.println(b1+c1+d1);
		//3.�����¶Ⱥ������¶Ȼ���ת����
        //�ӻ��϶ȱ�����϶���ֻҪ��ȥ32������5�ٳ���9
        //�����ˣ������϶�ת�ɻ��϶ȣ�ֱ�ӳ���9������5���ټ���32���С�
        double C=32.5;
        double F=C*9/5+32;
        double C1=(F-32)*5/9; 
        System.out.println(F);
        System.out.println(C1);
		//4.����һ������Ĵ�д��ĸA~Z��ת��ΪСд��ĸ��
        char BigLetter= 'A';
        char SmallLetter= (char)(BigLetter+32);
        System.out.println(SmallLetter);

	}

}
