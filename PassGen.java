
import java.util.*;

public class PassGen {

	 //Legal characters for generated password. 
	static final String legalValues = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	
	public static void main(String[] args) {
		
		//Password length set here
		int length = 8; 
		//Generate and return password
		System.out.println("Your random password is: ");
		System.out.println(generate(length));
	

	}
	/*
	 * Method to generate password
	 * 
	 * Static; no specific instance necessary
	 */
	static char[] generate(int length) {
		
		char[] password = new char[length];
		
		//Construct generator, very likely to have distinct seed
		Random rng = new Random();
		
		for (int i = 0; i < length; i++) {
			password[i] = legalValues.charAt(rng.nextInt(legalValues.length()));
		}
		return password;
	}
	
}


