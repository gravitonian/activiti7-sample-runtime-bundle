package org.activiti.training.sampleactiviti7runtimebundle;

import org.activiti.cloud.starter.rb.configuration.ActivitiRuntimeBundle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ActivitiRuntimeBundle
public class SampleActiviti7RuntimeBundleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleActiviti7RuntimeBundleApplication.class, args);
	}
}
