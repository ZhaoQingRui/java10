package chapter3;

public class SwitchCase3 {
	public static void main(String[] args) {
		int score=55;
		if(score<0&&score>100){
			System.out.println("输入不合法");
			return;
		}
		switch (score/10){
		case 10:
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;
		}
			
	}

}
