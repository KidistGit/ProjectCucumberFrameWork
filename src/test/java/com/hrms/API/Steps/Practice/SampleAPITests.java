package com.hrms.API.Steps.Practice;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITests {
	 //@Test
	public void getAllJobTitles() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5MzE5MTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzA0NzExMywidXNlcklkIjoiMjM0In0.8cVZ6Ih7-d--db2cIzMTs4s3v37qbsyHx3WxsRCMcUc")
				.when().get("http://18.232.148.34/syntaxapi/api/jobTitle.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);

	}

	// @Test
	public void getOneEmployee() {
		Response response = RestAssured.given().param("employee_id", "3447").contentType("application/json").header(
				"Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5MzE5MTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzA0NzExMywidXNlcklkIjoiMjM0In0.8cVZ6Ih7-d--db2cIzMTs4s3v37qbsyHx3WxsRCMcUc")
				.when().get("http://18.232.148.34/syntaxapi/api/getOneEmployee.php");
		response.prettyPrint();
		System.out.println(response);

	}

	/*
	 * TASK: getAllEmployeeStatus pretty print print status code
	 * 
	 */
	// @Test
	public void getAllEmployeeStatus() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5MzE5MTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzA0NzExMywidXNlcklkIjoiMjM0In0.8cVZ6Ih7-d--db2cIzMTs4s3v37qbsyHx3WxsRCMcUc")
				.when().get("http://18.232.148.34/syntaxapi/api/getAllEmployees.php");

		response.prettyPrint();

		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);
	}

	@Test
	public void createEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization",
				"Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI5MzE5MTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MzA0NzExMywidXNlcklkIjoiMjM0In0.8cVZ6Ih7-d--db2cIzMTs4s3v37qbsyHx3WxsRCMcUc")
				.body("{\n    \"emp_firstname\": \"Bella\",\n    \"emp_lastname\": \"Hiro\",\n    \"emp_middle_name\": \"w\",\n    \"emp_gender\": \"2\",\n    \"emp_birthday\": \"2020-02-25\",\n    \"emp_status\": \"Worker\",\n    \"emp_job_title\": \"Developer\"\n}")

			
				.when().post("http://18.232.148.34/syntaxapi/api/createEmployee.php");

		response.prettyPrint();

		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);
	

	}
}
