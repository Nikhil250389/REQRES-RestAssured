package REST.demo;

public class PayLoad {
		
	public String registerUserBody() {
		
		String bd="{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"pistol\"\r\n" + 
				"}";
		return bd;
	}
	
	public String loginBody() {
		String lb="{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}";
		return lb;
	}
	
	public String createUserBody(Object object) {
		String userB="{\r\n" + 
				"    \"name\": \""+object+"\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
		
		return userB;
	}
	public String updateUserBody(Object object) {
		String userB="{\r\n" + 
				"    \"name\": \""+object+"\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		
		return userB;
	}
	
	
	

}
