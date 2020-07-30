package chapter3;

public class chapter3ex8 {
	public static void main(String[] args) {
		//猴子第一天摘下若干个桃子，
		//当即吃了一半，还不瘾，又多吃了一个，
		//第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
		//以后每天早上都吃了前一天剩下的一半零一个。
		//到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少
		/*int peachnum=1;
		for(int day=0;day<9;day++)
		{
			peachnum=(peachnum+1)*2;
		}
		System.out.println(peachnum);*/
		
		
		
		//将90分解成质因数2*3*3*5
		/*int param=120;
		for(int i=2;i<=param;i++){
			while(param!=i){
				if(param%i==0){
					System.out.println(i+"*");
					param=param/i;
				}
				else{
					break;
				}
			}
		}*/
		int i=12345;int j = 1;
		 while(i/10>0){
			j++;
			i=i/10;
			if(i<1)
			{
				break;
			}	
		}System.out.println("该数为"+j+"位数");
   }
}
