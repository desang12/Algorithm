package 열혈자료구조.chap01;

/**
 
 배열에 저장된 데이터는 정렬 되어 있어야 한다.
 이진 탐색 알고리즘은 정렬된 데이터가 아니면 적용이 불가능하다.
 
 
 
 */

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {1, 3, 5, 7, 9};
		int index;
		
		index = binarySearch(arr, arr.length, 7);
		if(index == -1) {
			System.out.println("탐색 실패");
		} else {
			System.out.println("타겟 저장 인덱스 : " + index);
		}
	}
	
	static int binarySearch(int [] arr, int len, int target) {
		int first = 0;
		int last = len - 1;
		int mid;
		
		while(first <= last) {
			mid = (first + last) / 2;  // 탐색 대상의 중앙을 찾는다.
			
			if(target == arr[mid]) { // 중앙에 저장된 값이 타겟이라면
				return mid;
			} else { // 타겟이 아니라면
				if(target < arr[mid]) {
					last = mid - 1;
				} else {
					first = mid + 1;
				}
			}
		}
		return -1;
	}

	
}
