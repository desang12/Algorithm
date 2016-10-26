package 열혈자료구조.chap01;

public class BinaryRecursion {

	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 7, 8, 10};
		int target = 8;
		int index = binaryResursion(arr, 0, arr.length - 1, target);
		System.out.println(target + "의 인덱스 번호 : " + index);
	}
	
	static int binaryResursion(int [] arr, int first, int last, int target) {
		
		int mid;
		
		if(first > last) {
			return -1;
		}
		
		mid = (first + last) / 2;
		if(arr[mid] == target) {
			return mid;
		} else if(target < arr[mid]) {
			return binaryResursion(arr, first, mid - 1, target);
		} else {
			return binaryResursion(arr, mid + 1, last, target);
		}
	}
}
