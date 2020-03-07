package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class JobDeatailsPageElements extends CommonMethods {
	
	@FindBy(linkText="Job")
	public WebElement Job ;
	
	
	@FindBy(id="btnSave")
	public WebElement edit;
	
	@FindBy(id = " job_job_title")
	public WebElement jobTitle ;

	@FindBy(id = " job_emp_status")
	public WebElement empStatus ;

	@FindBy(xpath = "//select[@id='job_eeo_category'] ")
	public WebElement  jobCategory;

	@FindBy(xpath = " //input[@id='job_joined_date']")
	public WebElement joinedDate;

	@FindBy(id = "job_sub_unit ")
	public WebElement  subUnit;

	@FindBy(id = "job_location ")
	public WebElement Location;

	@FindBy(xpath = " //input[@id='job_contract_start_date']")
	public WebElement startDate ;

	@FindBy(xpath = "//input[@id='job_contract_end_date'] ")
	public WebElement endDate;

	@FindBy(id = "id=\"job_contract_file\" ")
	public WebElement contractDetails ;
	
	
	@FindBy(id = " btnSave")
	public WebElement  btnSave;
	
	@FindBy(id = "btnAddAttachment ")
	public  WebElement  Add;
	
	@FindBy(id = "ufile ")
	public  WebElement  selectFile;
	@FindBy(id="txtAttDesc ")
	public WebElement  comment ;
	
	@FindBy(id="btnSaveAttachment")
	public WebElement Upload;
	
	public  void JobDeatailsPageElements(){
		PageFactory.initElements( BaseClass.driver, this);
	}
	
	
}
