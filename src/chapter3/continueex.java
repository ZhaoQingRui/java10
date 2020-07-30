package chapter3;

public class continueex {
	private void mian() {
		// TODO Auto-generated method stub
		//return（方法结束）、break（结束整个循环），continue（结束本次循环，进入下次循环）
		for(int i=1;i<20;i++){
			if(i%2==0){continue;}
			System.out.println(i);
		}
	}

}
