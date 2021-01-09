package nature;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {


		ArrayList<String> aa = new ArrayList<String>();
		aa.add("Java");
		aa.add("Jmeter");
		aa.add("JDK");
		aa.add("GKSS");
		
		System.out.println(aa.get(0));
	    System.out.println(aa.contains("Jmeter"));
	}

}
