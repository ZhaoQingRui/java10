package chapter3;

public class forex2 {
	public static void main(String[] args) {
		int n=179;
		for(int i=2;i<n;i++){
			if(n%i==0){
				System.out.println("��������");
				return;
			}
		}
		System.out.println("������");
	}

}
