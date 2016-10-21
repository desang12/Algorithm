package 열혈자료구조.chap01;

public class LinearSearch {

	public static void main(String[] args) {
		int [] array= {3, 5, 2, 4, 9};
		int index;
		index = LinearSearch(array, array.length, 4);
		if(index == -1){
			System.out.println("탐색 실패");
		} else {
			System.out.println("타겟 저장 인덱스: "+ index);
		}

	}
	
	static int LinearSearch(int [] array, int length, int target) {
		int i;
		
		for(i = 0; i < length; i++){
			if(array[i] == target)
				return i; //찾은 대상의 인덱스 값 반환
		}
		return -1; //찾지 못했음을 의미하는 값 반환
	}
}
