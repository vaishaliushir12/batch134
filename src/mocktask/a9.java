package mocktask;

import java.util.ArrayList;
import java.util.List;

public class a9 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(20);
		list.add(60);
		list.add(50);
		list.add('c');
		list.add(20);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);

	}

}
