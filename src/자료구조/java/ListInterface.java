package 자료구조.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 
 컬렉션 프레임워크
 
 자바 컬렉션은 객체를 수집해서 저장하는 역할 수행.
 프레임워크란 사용방법을 미리 정해 놓은 라이브러리를 말한다.
 
 
 
 */
public class ListInterface {

	public static void main(String[] args) {
		
		/* ArrayList */
		List<String> arrayList = new ArrayList<String>(); //기본적으로 10개의 값이 저장되는 공간 생성
		List<String> arrayList2 = new ArrayList<String>(40); //공간의 크기 지정 가능
		List<String> arrayList3 = Arrays.asList("A", "B", "C"); // 고정된 객체들로 구성된 List생성		
	
		//자바5부터 제네릭을 도입하여 ArrayList객체를 생성할 때 타입 파라미터로 저장할 객체의 타입을 지정하여
		//불필요한 타입 변환을 하지 않도록 했다.
		
		// 빈번한 객체 삭제와 삽입이 일어나는 곳에서는 ArrayList를 사용하는 것이 바람직하지 않다.
		// 이런 경우 LinkedList를 사용하는 것이 좋다.

		
		/* Vector 
		 - ArrayList와 다른 점은 vector는 동기화된 메소드로 구성되어 있어 멀티 스레드가 동시에 이 메소드를 실행할 수 없고,
		 하나의 스레드가 실행을 완료해야만 다른 스레드를 실행할 수 있다.
		 그래서 멀티 스레드 환경에서 안전하게 객체를 추가, 삭제할 수 있다.(Thread Safe)
		 */
		List<Board> vectorList = new Vector<Board>();
		vectorList.add(new Board("제목1", "내용1", "작성자1"));
		vectorList.add(new Board("제목2", "내용2", "작성자2"));
		
		for(int i = 0; i < vectorList.size(); i++) {
			Board board = vectorList.get(i);
			System.out.println(board.subject + " " + board.content + " " + board.writer);
		}
		
		/* LinkedList 
		 
		 인접 참조를 링크해서 체인처럼 관리.
		 
		 */
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("김현우");
		System.out.println(linkedList.get(0));
		
	}

}

class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
