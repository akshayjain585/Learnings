package day1.InterfaceExplanation;

public class NokiaPhone implements Phone {

	@Override
	public void call() {
		System.out.println("Nokia Phone calling");
		
	}

	@Override
	public void msg() {
		System.out.println("Nokia Phone messaging");
		
	}
	
	public void Switchoff(){           // This function is local to the NokiaPhone class and is not inherited from Interface "Phone 
		System.out.println("Nokia Phone Switching off");
	}

}
