package chapter3;

public class chapter3ex8 {
	public static void main(String[] args) {
		//���ӵ�һ��ժ�����ɸ����ӣ�
		//��������һ�룬����񫣬�ֶ����һ����
		//�ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ����
		//�Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
		//����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶���
		/*int peachnum=1;
		for(int day=0;day<9;day++)
		{
			peachnum=(peachnum+1)*2;
		}
		System.out.println(peachnum);*/
		
		
		
		//��90�ֽ��������2*3*3*5
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
		}System.out.println("����Ϊ"+j+"λ��");
   }
}
