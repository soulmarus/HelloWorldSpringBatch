package com.apress.springbatch.chapter2;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorld implements Tasklet {
	private static final String HELLO_WORLD = "Hello, %s!";
	private String name;
	
	public RepeatStatus execute( StepContribution step, ChunkContext context ) throws Exception
	{
		System.out.println(String.format(HELLO_WORLD,name));
		return RepeatStatus.FINISHED;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}