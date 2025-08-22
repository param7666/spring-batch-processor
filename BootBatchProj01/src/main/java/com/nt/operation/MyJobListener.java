package com.nt.operation;

import java.time.LocalDateTime;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class MyJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution je) {
		System.out.println("MyJobListener.beforeJob() "+je.getStartTime());
		System.out.println("Job Status "+je.getStatus());
	}
	
	
	@Override
	public void afterJob(JobExecution je) {
		System.out.println("MyJobListener.afterJob() "+je.getEndTime());
	}
}
