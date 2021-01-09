package nature;

public class StaticKeyWord {

	
	String city;
	String address;
	int sector;
	int i =0;
    static int pincode = 302001;
   static int bnnumber = 23145;
    
    
	//int pincode = 302001;
	
	public StaticKeyWord(String city, String address, int sector) {
		this.city = city;
		this.address = address;
		this.sector = sector;
		
		
	}
	
	public void addressprint() {
		System.out.println(address+" "+pincode+" "+bnnumber);
		//syso
	}
	
	public static void main(String[] args) {
		StaticKeyWord ss = new StaticKeyWord("Jaipur", "klnagar", 45);
		StaticKeyWord ss1 = new StaticKeyWord("Jodhpur", "klnagars", 46);
		ss.addressprint();
		ss1.addressprint();
		
		
		
		

		
		

	}

}
