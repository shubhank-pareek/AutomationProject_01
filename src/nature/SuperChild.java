package nature;

public class SuperChild extends SuperParent {

	String rt = "Ram is not good";
	
	int a = 5;
	
	public void getsum() {
		int a = 6;
		int c = a+this.a;
		System.out.println(c);
		
		
		System.out.println(a);
		System.out.println(this.a);
	}
	public SuperChild() {
		super();
		System.out.println("defgh");
	}
	
	public void growth()
	{
		super.growth();
		System.out.println("Growth is mandatory");
	}

	public static void main(String[] args) {

		SuperChild ss = new SuperChild();
		//System.out.println(super.ss.rt);
		System.out.println(ss.rt);
		
		ss.growth();
		
	}

}
