package utility;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import bsh.ParseException;
import io.restassured.path.json.*;
import io.restassured.path.xml.*;
import io.restassured.response.*;

public class CommonMethods {
	
	String propertyFilePath ="./src/Files/Environment.properties";
	String SessionResource="/rest/auth/1/session";
	
	
		public JsonPath rawToJsonData(Response res) {
//			String response = res.asString();
			JsonPath js = res.jsonPath();
			return js;
		}
		
		public Integer timeStampFormater(String timestamp) throws Exception {
			  if(timestamp == null) return null;
			  /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSSZ");
			Date date = sdf.parse(timestamp);
			long epoch = date.getTime();
			return (int)(epoch/1000);*/
			  
			  try {
				    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
				    sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				    Date dt = sdf.parse(timestamp);
				    long epoch = dt.getTime();
				    return (int)(epoch/1000);
				  } catch(Exception e) {
				     return null;
				  }
				 
			}
		
		
		

}
