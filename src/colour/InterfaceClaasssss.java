package colour;

public class InterfaceClaasssss implements Dummyinterface, Dummy2interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dummyinterface  a = new InterfaceClaasssss();
		a.red();
		a.green();
		InterfaceClaasssss i = new InterfaceClaasssss();
		i.queue();
		
		Dummy2interface o = new InterfaceClaasssss();
		o.horse();
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red method");
	}
	
	public void queue() {
		System.out.println("queue method");
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green method");
	}

	@Override
	public void yellow() {
		// TODO Auto-generated method stub
		System.out.println("yellow method");
	}

	@Override
	public void blue() {
		// TODO Auto-generated method stub
	System.out.println("blue method");	
	}

	@Override
	public void orange() {
		// TODO Auto-generated method stub
		System.out.println("orange method");
	}

	@Override
	public void horse() {
		// TODO Auto-generated method stub
		System.out.println("horse method");
	}

}
