Feature: Validating Syntax HRMS API's for class
Background:
Given user generates token for class
@ForClass
Scenario: This test will check to see if an Employee is created fro class
Given user calls createEmployee API fro class
When User retrieves response fro class
Then status code is 200 fro class
Then user validates employee is created fro class