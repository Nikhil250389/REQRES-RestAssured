package reqresTest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import REST.demo.PayLoad;
import REST.demo.Resource;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.CommonMethods;


public class CreateMultipleUsersTest {
	
	CommonMethods commonMethod= new CommonMethods();
	PayLoad pData= new PayLoad();
	Resource res = new Resource();
	
	@Test
	public void createUser() {
		ArrayList ls= new ArrayList();
		ls.add("Nikhil");
		ls.add("dhruv");
		ls.add("Rahul");
		ls.add("Ravi");
		ls.add("Abhi");
		
		Resource res = new Resource();
		RestAssured.baseURI=res.baseURI();
		Response resp=null;
		
		for(int i=0;i<=4;i++) {
			 resp = given().
					header("Content-Type", "application/json").
			body(pData.createUserBody(ls.get(i))).log().all().
			when().
			post(res.createUser()).
			then().assertThat().statusCode(201).and().log().all().
			extract().response();
			
		}
	
		System.out.println("Response of Create user :-->"+resp);	
	}
	
	@Test
	public void updateUser() {
		ArrayList ls= new ArrayList();
		ls.add("Neha");
		ls.add("Juhi");
		ls.add("Rupi");
		ls.add("Sheela");
		
		Resource res = new Resource();
		RestAssured.baseURI=res.baseURI();
		Response resp=null;
		
		for(int i=0;i<=3;i++) {
			 resp = given().
					header("Content-Type", "application/json").
			body(pData.updateUserBody(ls.get(i))).log().all().
			when().
			post(res.updateUser()).
			then().assertThat().statusCode(201).and().log().all().
			extract().response();	
		}
		System.out.println("Response of update user :-->"+resp);	
	}
	
}
