
public class HelloUser {
	String name;
	
	public HelloUser(String userName) {
		name = userName;
	}
	
	public void greetUser() {
		System.out.printf("Hello %s", name);
	}

}
