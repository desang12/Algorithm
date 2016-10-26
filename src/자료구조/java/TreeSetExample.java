package 자료구조.java;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String [] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("tom");
		treeSet.add("atom");
		treeSet.add("brown");
		treeSet.add("cathey");
		
		String name = treeSet.first(); //제일 낮은 객체 리턴
		System.out.println(name);
		name = treeSet.last(); //제일 높은 객체 리턴
		System.out.println(name);
		
		
	}
}
