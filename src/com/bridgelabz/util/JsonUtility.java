package com.bridgelabz.util;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.jsonfile.Person;

public class JsonUtility {
     private static ObjectMapper mapper;
 
     static {
    	 mapper = new ObjectMapper();
     }
     
     public static String convertJavaToJson(Object object) {
    	 String jsonResult="";
    	 
    	 try {
			jsonResult = mapper.writeValueAsString(object);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 return jsonResult;
     }
     
     public static <T> T convertJsonToJava(String jsonPath ,Class<T> cls)
     { {
    	 T readResult=null;
    	 try {
    	 readResult = mapper.readValue(jsonPath, cls);
    	 }catch (JsonParseException e) {
			// TODO: handle exception
		}catch (JsonMappingException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
         Person p = new Person();
         
         
    	 return readResult;
     }
     }
} 
