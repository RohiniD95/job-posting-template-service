package com.vendorsystem.jobpostingtemplateservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vendorsystem.jobpostingtemplateservice.resource.JobPostingTemplate;
import com.vendorsystem.jobpostingtemplateservice.service.JobPostingTemplateService;

@RestController
@RequestMapping("/jobpostingtemplate")
public class JobPostingTemplateController {
	@Autowired
	public JobPostingTemplateService jobPostingTemplateService;
	
	@RequestMapping("/{templateId}")
	public JobPostingTemplate getTemplate(@PathVariable("templateId") String templateId) {
		
		JobPostingTemplate jobPostingTemplate = jobPostingTemplateService.getTemplate(templateId);
		
		return jobPostingTemplate;
	}

}
