package chapter3;

import java.util.Scanner;

public class afterclassex2 {
	public static void main(String[] args) {
		/*5.企业发放的奖金根据利润提成。利润低于或等于10万元时，奖金可提10%；
		利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
		高于10万元的部分，可提成7.5%；
		20万到40万之间时，高于20万元的部分，可提成5%；
		40万到60万之间时高于40万元的部分，可提成3%；
		60万到100万之间时,高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
		在程序中设定一个变量为当月利润，求应发放奖金总数？*/
		int lirun;int jiangjin = 0;
		System.out.println("请输入利润");
		Scanner scanner=new Scanner(System.in);
		lirun=scanner.nextInt();
		if(lirun<100000){jiangjin=(int) (lirun*(1+0.1));}
		else if(lirun>=100000 && lirun<200000){jiangjin=(int) (100000*(1+0.075)+(lirun-100000)*(1+0.1));}
		else if(lirun>=200000&&lirun<400000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05));}
		else if(lirun>=400000&&lirun<600000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05)+(lirun-400000)*(1+0.03));}
		else if(lirun>=600000&&lirun<1000000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05)+(lirun-400000)*(1+0.03)+(lirun-600000)*(1+0.015));}
		else if(lirun>=1000000){jiangjin=(int)(100000*(1+0.075)+(lirun-100000)*(1+0.1)+(lirun-200000)*(1+0.05)+(lirun-400000)*(1+0.03)+(lirun-600000)*(1+0.015)+(lirun-1000000)*(1+0.01));}
		System.out.println(jiangjin);
		/*//21.由命令行输入一个4位整数，求将该数反转以后的数，如原数为1234，反转后的数位4321。
		int i;int j=0;
		System.out.println("请输入一个四位数字");
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
