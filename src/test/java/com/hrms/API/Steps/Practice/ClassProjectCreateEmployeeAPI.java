package com.hrms.API.Steps.Practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import com.hrms.utils.APIConstants;
import com.hrms.utils.CommonMethods;
import static org.hamcrest.Matchers.equalTo;
public class ClassProjectCreateEmployeeAPI {
	private static RequestSpecification request;
	private Response response;
	public static Object employee_ID;
	
	
	@Given("user generates token for class")
	public void user_generates_token_for_class() {
	
	}

	@Given("user calls createEmployee API fro class")
	public void user_calls_createEmployee_API_fro_class() {
		response=request.when().post(APIConstants.CREATE_EMPLOYEE_URI);
			response.prettyPrint(); 
	}

	@When("User retrieves response fro class")
	public void user_retrieves_response_fro_class() {
		request=given().header("Content-Type","application/json").header("Authorization",SyntaxAPIAuthenticationSteps.Token);
		request.body(CommonMethods.readJson(APIConstants.CREATE_EMPLOYEE_JSON));
		
	}

	@Then("status code is {int} fro class")
	public void status_code_is_fro_class(Integer int1) {
		response.then().assertThat().statusCode(int1);
	}

	@Then("user validates employee is created fro class")
	public void user_validates_employee_is_created_fro_class() {
		response.then().body("Message" , equalTo("Entry Created"));
		   response.then().body("Employee[0].emp_firstname", equalTo("Natinal"));
		    JsonPath jsonPathEvaluator =response.jsonPath();
		    String employee_id=jsonPathEvaluator.get("Employee[0].employee_id");
		    System.out.println("Employee ID is : " + employee_id);
	}


}