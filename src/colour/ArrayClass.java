package colour;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ArrayClass {

	
	public ArrayClass() {
		System.out.println("I am the default one");
	}
	
	public ArrayClass(String str) {
		System.out.println(str);
		System.out.println("I am the parameter one");
	}
	public static void main(String[] args) {
            
		ArrayClass ar = new ArrayClass();
		ArrayClass ar1 = new ArrayClass("hello");
		
		
		
		
	
}
}