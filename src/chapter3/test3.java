package chapter3;

public class test3 {
	public static void main(String[] args) {
	int num=30;
	if(num%5==0&&num%6==0)
	{
		System.out.println("�ܱ�5��6����");
	}
	else if(num%5==0){
		System.out.println("�ܱ�5����");
	}
	else if(num%6==0){
		System.out.println("�ܱ�6����");
	}
	else{
		System.out.println("�Ȳ��ܱ�5����Ҳ���ܱ�6����");
	}
  }
}
