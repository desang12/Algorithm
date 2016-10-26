package 자료구조.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 
 List 컬렉션은 저장 순서를 유지하지만 Set 컬렉션은 저장 순서가 유지되지 않는다.
 또한 객체를 중복해서 저장할 수 없고, 하나의 null만 저장할 수 있다.
 수학의 집합에 비유될 수 있다.
 집합은 순서와 상관없고 중복이 허용되지 않기 때문이다.
 
 인덱스로 관리하지 않기 때문에 인덱스를 매개값으로 갖는 메소드가 없다.
 대신 전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자(Iterator)를 제공한다.
 
 */
public class SetInterface {

	public static void main(String[] args) {
		/* HashSet 
		 
		 HashSet는 객체를 저장하기 전에 먼저 객체의 hashCode() 메서드를 호출해서 해시코드를 얻어낸다.
		 그리고 이미 저장되어 있는 객체들의 해시코드와 비교해서, 만약 동일한 해시코드가 있다면,
		 다시 equals() 메서드로 두 객체를 비교해서 true가 나오면 동일한 객체로 판단하고 중복 저장을 하지 않는다.
		 
		 */
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("Spring");
		hashSet.add("Java");
		hashSet.add("ibatis");
		hashSet.add("Java");
		
		int size = hashSet.size();
		System.out.println("총 객체 수 : " + size); //중복값은 하나만 저장됨.
		
		Iterator<String> iterator = hashSet.iterator(); //반복자 얻기
		while(iterator.hasNext()) {
			String element = iterator.next(); //한 개의 객체를 가져온다.
			System.out.println(element);
		}
	}

}
