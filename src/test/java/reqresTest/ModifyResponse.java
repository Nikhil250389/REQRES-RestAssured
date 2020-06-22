package reqresTest;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import REST.demo.PayLoad;
import REST.demo.Resource;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.CommonMethods;


public class ModifyResponse {
	
	CommonMethods commonMethod= new CommonMethods();
	PayLoad pData= new PayLoad();
	Resource res = new Resource();
	
	
	@Test
	public void createUserAndModifyRespose() throws Exception {
		Resource res = new Resource();
		RestAssured.baseURI=res.baseURI();
		Response resp=null;
			 resp = given().
					header("Content-Type", "application/json").
			body(pData.createUserBody("Raghu")).log().all().
			when().
			post(res.createUser()).
			then().assertThat().statusCode(201).and().log().all().
			extract().response();
		System.out.println("Response of Create user :-->"+resp);	
		String v = commonMethod.rawToJsonData(resp).get("createdAt");
		System.out.println("&&%&^$%$@$#____--->>"+v);
		Integer ss = commonMethod.timeStampFormater(v);
		System.out.println(ss);	
	}
	

	

}
