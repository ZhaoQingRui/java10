package chapter3;

public class qiantaoxhex2 {
	public static void main(String[] args) {
		int num=9;
		int i=2;
		for(;i<num-1;i++)
			if(num%i==0){
				System.out.println("��������");
				break;
			}
		if(i==num){
			System.out.println("������");
		}
		
		
		/*for(int num=200;;num++)
		{
			boolean flag = true;//������ 
			for(int i=2;i<=num-1;i++)
			{
				if(num%i==0)
				{
					flag = false;//��������
					//������
					//System.out.println("��������");
					break;
				}
			}
			
			if(flag)//һ����û����
			{
				//break������
				//System.out.println("������");
				//�ҵ���
				System.out.println(num);
				break;
			}
		}*/
		
			
		/*int num=9;
		boolean flag=true;
		for(int i=2;i<num-1;i++)
			if(num%i==0){
				flag=false;
				System.out.println("��������");
				break;
			}
		if(flag){
			System.out.println("������");
		}*/
	}

}
