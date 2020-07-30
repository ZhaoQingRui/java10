package chapter3;

public class qiantaoxhex3 {
	public static void main(String[] args) {
		int m=12;
		int n=8;
		int result=m>n?m:n;
		for(int i=result;i<=n;i++){
			if(m%i==0&&n%i==0){
				result=i;
				break;
			}
		}
		System.out.println(m+"和"+n+"的最大公约数为"+result);
	}

}
