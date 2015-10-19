
public class HelloUser {
	String name = "";
	
	public HelloUser(String userName) {
		name = userName;
	}
	
	public void greetUser() {
		if (name.length() > 30) {
			System.out.println("Fuck you!");
		} else System.out.printf("Hello %s! \n", name);
	}

}
