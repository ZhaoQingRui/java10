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
		System.out.println("��3�����񱾼���"+sum);
		System.out.println("��3��ÿ����Ϣ"+(sum-1000000)/36);
		//����һ��ȡ��������3%������Ϣ����һ���Ѿ�
		//����4%������Ϣ����Ҫ��������Ϣ����������1000000�ｫ�����Ϣ�۳�������۳�����ͻ���Ǯ
		double sum2 = 1000000;
		int year2=1;
		while(year2<2)
		{
			sum2*=(1+0.003);
			year2++;
		}
		System.out.println("��1��ÿ����Ϣ"+(sum2-1000000)/12);
		System.out.println("��Ϣ���"+((sum-1000000)/36-(sum2-1000000)/12));
		System.out.println("���п۳���"+(1000000+(((sum-1000000)/36-(sum2-1000000)/12))*12));	
	}
}

