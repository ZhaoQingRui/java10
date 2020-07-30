package chapter3;

public class qiantaoxhex2 {
	public static void main(String[] args) {
		int num=9;
		int i=2;
		for(;i<num-1;i++)
			if(num%i==0){
				System.out.println("不是质数");
				break;
			}
		if(i==num){
			System.out.println("是质数");
		}
		
		
		/*for(int num=200;;num++)
		{
			boolean flag = true;//是质数 
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					flag = false;//不是质数
					//整除了
					//System.out.println("不是质数");
					break;
				}
			}
			
			if(flag)//一个都没整除
			{
				//break到这了
				//System.out.println("是质数");
				//找到了
				System.out.println(num);
				break;
			}
		}*/
		
			
		/*int num=9;
		boolean flag=true;
		for(int i=2;i<num-1;i++)
			if(num%i==0){
				flag=false;
				System.out.println("不是质数");
				break;
			}
		if(flag){
			System.out.println("是质数");
		}*/
	}

}
