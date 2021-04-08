package com.vendorsystem.jobpostingtemplateservice.service;

import com.vendorsystem.jobpostingtemplateservice.resource.JobPostingTemplate;

import org.springframework.beans.factory.annotation.Autowired;

public class JobPostingTemplateService {
	
	@Autowired
	public JobPostingTemplate jobPostingTemplate;

	public JobPostingTemplate getTemplate(String templateId) {
		if(templateId.equals(templateId)) {
			jobPostingTemplate.setDescription("Java Developer who can work on springboot");
			jobPostingTemplate.setJptId(templateId);
			jobPostingTemplate.setLocation("Pune");
			jobPostingTemplate.setSalaryId("Z123");
			jobPostingTemplate.setTitle("SDE-II Java Developer");
			
		}
		return jobPostingTemplate;
	}
	
	

}
