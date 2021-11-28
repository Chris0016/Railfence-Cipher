public class Main{
	
	public static void main(String[] args){
		String plaintext = "Hello";
		int rails = 3;


		Railfence rFence = new Railfence();
		
		System.out.println("Railfence : " + rFence.railfenceEncrypt(plaintext, rails));
	}
}