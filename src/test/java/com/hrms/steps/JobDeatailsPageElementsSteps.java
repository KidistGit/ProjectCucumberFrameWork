package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

//public class JobDeatailsPageElementsSteps extends CommonMethods {

//	@When("I click on job")
//	public void i_click_on_job() {
//		click(add.Job);
//
//	}
//
//	@When("I click on edit button")
//	public void i_click_on_edit_button() {
//		click(jobDeatil.edit);
//	}
//
//	@When("I entered all the required details")
//	public void i_entered_all_the_required_details(DataTable jobDetails) {
//		List<Map<String, String>> jobDetailList = jobDetails.asMaps();
//
//		for (Map<String, String> map : jobDetailList) {
//			sendText(jobDeatil.joinedDate, map.get("Joined Date"));
//			sendText(jobDeatil.startDate, map.get("Start Date"));
//			sendText(jobDeatil.endDate, map.get(" End Date "));
//
//			selectDdValue(jobDeatil.jobTitle,map.get("Developer"));
//			selectDdValue(jobDeatil.empStatus,map.get("Employee "));
//			selectDdValue(jobDeatil.jobCategory,map.get("Technicians"));
//
//		}
//	}
//
//	@Then("I click on  save button")
//	public void i_click_on_save_button() {
//		click(jobDeatil.btnSave);
//	}
//
//}
