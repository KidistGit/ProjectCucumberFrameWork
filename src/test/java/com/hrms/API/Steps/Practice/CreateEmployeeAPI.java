package com.hrms.API.Steps.Practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.equalTo;

import com.hrms.utils.CommonMethods;

public class CreateEmployeeAPI {

	private static RequestSpecification request;
	private Response response;

	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {
		// Write code here that turns the phrase above into concrete actions

		request = given().header("Content-Type", "application/json").header("Authorization",
				SyntaxAPIAuthenticationSteps.Token);

		request.body(CommonMethods.readJson(
				"C:\\Users\\kidyg\\eclipse-workspace\\HrmsCucumberFrameworkProject\\src\\test\\resources\\JOSNFiles\\CreateEmployee.json"));

	}

	@When("User retrieves response")
	public void user_retrieves_response() {
		// Write code here that turns the phrase above into concrete actions

		response = request.post("http://18.232.148.34/syntaxapi/api/createEmployee.php");
	}

	@Then("status code is {int}")
	public void status_code_is(Integer int1) {
		/**
		 * we are using then() method to perform assertions below are two ways to assert
		 */

		/**
		 * Asserting using Assert class from JUnit and using assertEquals() method
		 */
		//Assert.assertEquals(int1, response.getStatusCode());

		/**
		 * Preferred way to assert because we can use then() method
		 */
		//response.then().assertThat().statusCode(int1);
		
		


	}

	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {
		/**
		 * we are using then() method to perform assertions below are two ways to assert
		 */

		/**
		 * Asserting using Assert class from JUnit and using assertEquals() method
		 */
		//response.then().body("Message", equalTo("Entry Created"));
		/**
		 * Preferred way to assert because we can use then() method
		 */
		//response.then().body("Employee[0].emp_firstname", equalTo("Bella"));
		
		
	}
	
	
	
	

}
