package basicCoding;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practise {
	

public static void main(String[] args) {

List<String> state = new ArrayList<String>();

state.add("Karnataka");
state.add("Maharastra");
state.add("Gujarat");

ListIterator<String> ls = state.listIterator();

while(ls.next() != null) {
System.out.println(ls.next());
}
}


public void Addition() {
int a = 10;
int b = 30;
a = a + b;
System.out.println("a:" + a);
}
}