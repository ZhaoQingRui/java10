package chapter3;

public class chapter3ex2 {
public static void main(String[] args) {
	/*for(int i=0;i<=100;i++){
		for(int j=0;j<=100;j++){
			for(int k=0;k<=100;k++){
				if(i+j+k==100&&3*i+4*j+0.5*k==100){
					System.out.println("母鸡"+i+"只,公鸡"+j+"只，小鸡"+k+"只");
				}
			}
		}
	}*/
	for(int i=0;i<=33;i++){
		for(int j=0;j<=25;j++)
		{
			int k=100-i-j;
			if(3*i+5*j+0.5*k==100){
				System.out.println("母鸡"+i+"只,公鸡"+j+"只，小鸡"+k+"只");
			}
		}
	}
	
}
}
