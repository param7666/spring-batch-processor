package com.nt.operation;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.nt.entity.Employee;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
	// reader object
	@Bean
	public FlatFileItemReader<Employee> reader(){
		FlatFileItemReader<Employee> reader=new FlatFileItemReader<Employee>();
		reader.setResource(new ClassPathResource("employee.csv")); // src/main/resource
		return reader;
	}
	
	//proccesor object
	@Bean
	public ItemProcessor<Employee, Employee> proccessor(){
		
	}
	
	// writer object
	@Bean
	public JdbcBatchItemWriter<Employee> writer(){
		return null;
		
	}
	
	//listerner object
	@Bean
	public JobExecutionListener listener() {
		return null;
	}
	
	
	//autowire step builder factory
	@Autowired
	private StepBuilder sf;
	
	
	//step object
	@Bean
	public Step stepObject() {
		return null;
	}
	
	
	// autowire job builder factory
	private JobBuilder jb;
	
	
	// job object
	
	@Bean
	public Job jobObj() {
		return null;
	}
}
