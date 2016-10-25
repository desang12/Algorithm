package 열혈자료구조.chap02;

public class Recursion {

	public static void main(String[] args) {
		
		recursive(3);

	}
	
	static void recursive(int num) {
		if(num <= 0){
			return;
		}
		System.out.println("Recursive call " + num);
		recursive(num - 1);
	}

}
