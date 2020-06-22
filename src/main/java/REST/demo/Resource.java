package REST.demo;

public class Resource {
	
	public String baseURI() {
		String base="https://reqres.in/";
		return base;
	}
	
	public String registerUser() {
		String resource ="api/register";
		return resource;
		
	}
	public String login() {
		String resource ="api/login";
		return resource;
		
	}
	public String createUser() {
		String resource="api/users";
		return resource;
		
	}
	public String updateUser() {
		String resource="api/users/2";
		return resource;
		
	}
	public String deleteUser() {
		String resource="api/users/2";
		return resource;
		
	}


}
