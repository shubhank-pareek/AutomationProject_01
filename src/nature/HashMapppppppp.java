package nature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapppppppp {

	public static void main(String[] args) {


		HashMap<Integer, String> nb = new HashMap<Integer, String>();
		nb.put(0, "Java");
		nb.put(1, "Javas");
		nb.put(2, "Javass");
		nb.put(3, "Javassss");
		nb.put(4, "Javassssss");
		nb.put(5, "Javassssssssssssssss");
		nb.put(6, "Javasssssssssssssssssssssss");
		nb.put(7, "Javasssssssssssssssssssssssssssssssssss");
		
		Set<Entry<Integer, String>> vv = nb.entrySet();
       Iterator<Entry<Integer, String>> avc =  vv.iterator();
       System.out.println(avc.next());
       
       while(avc.hasNext())
       {
    	   System.out.println(avc.next());
    	   break;
       }
        
		
	}

}
