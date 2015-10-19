import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Tobias
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2015 - how are you now? :)");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter your name:");
        	String userEntry = br.readLine();
	        HelloUser newUser = new HelloUser(userEntry);
	        newUser.greetUser();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
