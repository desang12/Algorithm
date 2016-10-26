package 열혈자료구조.chap02;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println(fibo(10));

	}
	
	static int fibo(int num) {
		if(num == 1) {
			return 0;
		} else if (num == 2){
			return 1;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}
}
