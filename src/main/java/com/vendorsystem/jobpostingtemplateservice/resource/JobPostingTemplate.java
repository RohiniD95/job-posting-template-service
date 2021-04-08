package com.vendorsystem.jobpostingtemplateservice.resource;

public class JobPostingTemplate {

	private String jptId;
	private String title;
	private String description;
	private String location;
	private String salaryId;
	
	public JobPostingTemplate() {
		super();
	}
	public String getJptId() {
		return jptId;
	}
	public void setJptId(String jptId) {
		this.jptId = jptId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(String salaryId) {
		this.salaryId = salaryId;
	}
	
	
}
