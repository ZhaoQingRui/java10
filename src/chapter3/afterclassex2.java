package chapter3;

import java.util.Scanner;

public class afterclassex2 {
	public static void main(String[] args) {
		/*5.��ҵ���ŵĽ������������ɡ�������ڻ����10��Ԫʱ���������10%��
		�������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�
		����10��Ԫ�Ĳ��֣������7.5%��
		20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��
		40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
		60��100��֮��ʱ,����60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
		�ڳ������趨һ������Ϊ����������Ӧ���Ž���������*/
		int lirun;int jiangjin = 0;
		System.out.println("����������");
		Scanner scanner=new Scanner(System.in);
		lirun=scanner.nextInt();
		if(lirun<100000){jiangjin=(int) (lirun*(1+0.1));}
		else if(lirun>=100000 && lirun<200000){jiangjin=(int) (100000*(1+0.075)+(lirun-100000)*(1+0.1));}
		else if(lirun>=200000&&lirun<400000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05));}
		else if(lirun>=400000&&lirun<600000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05)+(lirun-400000)*(1+0.03));}
		else if(lirun>=600000&&lirun<1000000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05)+(lirun-400000)*(1+0.03)+(lirun-600000)*(1+0.015));}
		else if(lirun>=1000000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05)+(lirun-400000)*(1+0.03)+(lirun-600000)*(1+0.015)+(lirun-1000000)*(1+0.01));}
		System.out.println(jiangjin);
		/*//21.������������һ��4λ�������󽫸�����ת�Ժ��������ԭ��Ϊ1234����ת�����λ4321��
		int i;int j=0;
		System.out.println("������һ����λ����");
		Scanner scanner1=new Scanner(System.in);
		i=scanner.nextInt();
		for(;i>0;)
		{
			j=i%10;
			i=i/10;
			  if(j>0)
			  {
			    System.out.print(j);
			  }
		}*/
	}

}
