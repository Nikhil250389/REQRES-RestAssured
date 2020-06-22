package reqresTest;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import REST.demo.PayLoad;
import REST.demo.Resource;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.CommonMethods;


public class DeleteUser {
	
	CommonMethods commonMethod= new CommonMethods();
	PayLoad pData= new PayLoad();
	Resource res = new Resource();
	
	
	@Test
	public void deleteUser() {
		Resource res = new Resource();
		RestAssured.baseURI=res.baseURI();
		Response resp = given().
				header("Content-Type", "application/json").
		body(pData.registerUserBody()).log().all().
		when().
		delete(res.deleteUser()).
		then().assertThat().statusCode(204).and().log().all().
		extract().response();
		System.out.println("Response of Register User :-->"+resp);
		
	}
	
	
	

}
