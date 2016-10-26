package 자료구조.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**

Map 컬렉션은 키와 값으로 구성된 Entry 객체를 저장하는 구조를 가지고 있다.
여기서 키와 값은 모두 객체이다.
키는 중복 저장될 수 없지만, 값은 중복 저장될 수 있다.
만약 기존에 저장된 키와 동일한 키로 값을 저장하면, 기존의 값은 없어지고,
새로운 값으로 대치된다.


 */
public class HashMapExample {

	public static void main(String[] args) {
		/* HashMap <키타입, 값타입> */
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("michale", 31);
		hashMap.put("tom", 21);
		hashMap.put("brown", 23);
		hashMap.put("scala", 29);
		System.out.println("총 앤트리 수 : " + hashMap.size());
		
		System.out.println("tom의 나이는 : "+ hashMap.get("tom")); // 키 값으로 값 검색
		
		//객체를 하나씩 처리 1
		Set<String> keySet = hashMap.keySet(); //Key Set얻기
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = hashMap.get(key);
			System.out.println(value);
		}
		
		//객체를 하나씩 처리 2
		Set<Map.Entry<String, Integer>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		
		
		hashMap.clear();//전체 앤트리 삭제
	}

}
