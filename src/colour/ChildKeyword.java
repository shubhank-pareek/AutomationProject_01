package colour;

public class ChildKeyword extends SuperKeyword{

	
	String we = "Rahulbuddy";

	public void woman() {
		System.out.println(we);
		System.out.println(super.we);;
	}
	
	public ChildKeyword() {
		System.out.println("******************");
	}
	
	public static void main(String[] args) {
     
		ChildKeyword cc = new ChildKeyword();
		cc.woman();

	}

}
