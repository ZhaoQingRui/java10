package chapter3;

public class chapter3ex {
	public static void main(String[] args) {
		int a;int b;int c; int sum;
		for(int i=100;i<=999;i++){
			a=i/100%10;b=i/10%10;c=i/1%10;
			if (a*a*a+b*b*b+c*c*c==i){
				sum=i;
			System.out.println(sum+"为水仙花数");
			continue;
			}
		}
	}

}
