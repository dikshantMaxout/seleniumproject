package basicCoding;

import java.util.LinkedList;

public class LinkedListPractise {
	
	void PrintLinkedList() {
		LinkedList<String> ListA = new LinkedList<String>();
		ListA.add("Red");
		ListA.add("Blue");
		ListA.add("Yellow");
		ListA.add("Green");
		for (String a : ListA) {
			System.out.println(a);
			
		}
	}

	public static void main(String[] args) {
		LinkedListPractise obj = new LinkedListPractise();
		obj.PrintLinkedList();

	}

}
