package basicCoding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractise {



	void colorList() {

		List<String> color = new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Yellow");
		color.add("Brown");

		//System.out.println(color);

		String element = color.get(0);
		System.out.println("First Element is = "+element);
		element = color.get(2);
		System.out.println("Third Element is = "+element);

		color.set(2, "Green");
		System.out.println("Yellow is now getting removed by green");
		System.out.println(color);
		//color.remove(0);
		//System.out.println("Red is getting removed");
		//System.out.println(color);
		


		ListIterator<String> ls = color.listIterator();
		//System.out.println(ls.nextIndex());
		boolean flag = false;
		while (ls.hasNext()) {
			if (ls.next() == "Brown") 
				flag = true;
		}
		if (flag = true) {
			System.out.println("Brown is int the list");
		}else {
			System.out.println("No brown");
		}}

	void sortarraylist() {
		List<String> List_String = new ArrayList<String>();
		List_String.add("Red");
		List_String.add("Yellow");
		List_String.add("Black");
		List_String.add("White");

		System.out.println("List before sorting "+List_String);
		Collections.sort(List_String);
		System.out.println("After sorting "+List_String);

	}

	void sortnumberlist() {
		List<String> List_num = new ArrayList<>();
		List_num.add("1");
		List_num.add("100");
		List_num.add("7");
		List_num.add("4");

		Collections.sort(List_num);
		System.out.println(List_num);
	}

	void copyList() {
		List<String> List_1 = new ArrayList<>();
		List_1.add("A");
		List_1.add("B");
		List_1.add("C");
		List_1.add("D");
		List_1.add("E");
		System.out.println(List_1);
		List<String> List_2 = new ArrayList<>();
		List_2.add("1");
		List_2.add("2");
		List_2.add("3");
		System.out.println(List_2);
		Collections.copy(List_1, List_2);
		System.out.println(List_1);
	}

	void swapelements() {
		List<String> ListA = new ArrayList<>();
		ListA.add("A");
		ListA.add("B");
		ListA.add("C");
		ListA.add("D");
		System.out.println("List of elements before swapping = " +ListA);
		Collections.swap(ListA, 1, 2);
		System.out.println("List of elements after swapping = "+ListA);

	}

	void Joinarraylist() {
		List<String> List_1 = new ArrayList<>();
		List_1.add("A");
		List_1.add("B");
		List_1.add("C");
		List_1.add("D");
		List_1.add("E");
		System.out.println(List_1);
		List<String> List_2 = new ArrayList<>();
		List_2.add("1");
		List_2.add("2");
		List_2.add("3");
		System.out.println(List_2);
		List<String> a = new ArrayList<String>();
		a.addAll(List_1);
		a.addAll(List_2);
		System.out.println(a);
	}

	void CheckEmpty() {
		List<String> ListA = new ArrayList<String>();
		ListA.add("Ram");
		ListA.add("Laxman");
		ListA.add("Bharat");
		ListA.removeAll(ListA);
		System.out.println(ListA.isEmpty());
	}



	public static void main(String[] args) {
		ArrayListPractise obj = new ArrayListPractise();
		obj.colorList();
		obj.sortarraylist();
		obj.sortnumberlist();
		obj.copyList();
		obj.swapelements();
		obj.Joinarraylist();
		obj.CheckEmpty();



	}

}
