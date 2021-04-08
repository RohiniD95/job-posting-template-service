package com.vendorsystem.jobpostingtemplateservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vendorsystem.jobpostingtemplateservice.resource.JobPostingTemplate;
import com.vendorsystem.jobpostingtemplateservice.service.JobPostingTemplateService;

@Configuration
public class BeanConfiguration {

	@Bean
	public JobPostingTemplate getJobPostingTemplate() {
		return new JobPostingTemplate();
	}
	
	@Bean
	public JobPostingTemplateService getJobPostingTemplateService() {
		return new JobPostingTemplateService();
	}
}
