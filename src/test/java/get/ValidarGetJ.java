package get;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ValidarGetJ {
	
	Response response;
	
@Before
public void iniciar() {
	response = RestAssured.get("https://api.trello.com/1/actions/592f11060f95a3d3d46a987a/list"); 
}
@Test
public void jsonConsole() {
  
		
 System.out.println(response.asPrettyString());
 		
}

@Test 
public void getStatusCode() { 
		System.out.println(response.getStatusCode());
	
	
}

@Test
public void validarStatuscode() {
		int code = response.getStatusCode();
	    assertEquals(200, code);
	
}
	
@Test
public void validarNameList() {
		assertTrue(response.asString().contains("Professional")); 
	
	
	
}
@Test
public void somenteList() {
		System.out.println(response.asPrettyString());
	
	
	
}

@Test
public void capturarSomenteName() {
	String nome = response.jsonPath().getString("name");
	System.out.println( nome);
		
	
}

@Test
public void validarONomeCapturado() {
	String nome = response.jsonPath().getString("name");
	assertEquals(nome,"Professional");
	
	
	
}

@Test
public void capturarID() {
	// capturar somente o ID sem usar o jsonPath
	
	
}




	


}


