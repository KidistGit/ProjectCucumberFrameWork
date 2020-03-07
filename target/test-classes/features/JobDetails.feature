@sprint1
Feature: Job details

  Background: 
    Given I am logged into HRMS
    And I navigated to Add Employee Page

  Scenario: Add Employee job details
    When I click on job
    And I click on edit button
    Then I entered all the required details
      | Joined Date | Start Date | End Date   | Job Title | Employment Status | Job Category |
      | 2020-02-09  | 2020-02-25 | 2020-04-15 | Developer | Employee          | Technicians  |
    And I click on  save button
