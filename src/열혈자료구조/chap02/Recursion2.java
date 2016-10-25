package 열혈자료구조.chap02;

public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(9));
		
	}
	
	static int factorial(int num) {
		if(num == 0){
			return 1;
		}
		return num * factorial(num - 1);
	}
}
