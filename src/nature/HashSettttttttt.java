package nature;

import java.util.HashSet;
import java.util.Iterator;

public class HashSettttttttt {

	public static void main(String[] args) {

           
		HashSet<String> hh = new HashSet<String>();
		hh.add("Java");
		hh.add("Python");
		hh.add("Angular");
		hh.add("Ndejs");
		hh.add("ReactJs");
		hh.add("RPA");
		hh.add("Salesforce");
		hh.add("Selenium");
		hh.add("C#");
		hh.add("Ruby");
		hh.add("Backend");
		hh.add("Frontend");
		hh.remove("C#");
		
		Iterator<String> ui = hh.iterator();
		
		System.out.println(ui.next());
		//System.out.println(ui.next());
		while(ui.hasNext()) {
			System.out.println(ui.next());
		}

		//System.out.println(hh);
	}

}
