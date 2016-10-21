package 열혈자료구조.chap01;

/**
	알고리즘의 성능 분석 방법
	
	1. 시간복잡도와 공간복잡도
	
	속도 관련 - 수행시간 분석결과 : 시간 복잡도
	메모리 사용량 관련 분석 결과 : 공간 복잡도
	
	
	알고리즘의 수행 속도를 평가하는 방법
	- 연산의 횟수 셈
	- 처리해야 할 데이터의 수 n에 대한 연산횟수의 함수 T(n)을 구성
	
	y축을 연산횟수 T(n)으로 x축을 데이터의 수 n으로 하는 그래프.



*/



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



