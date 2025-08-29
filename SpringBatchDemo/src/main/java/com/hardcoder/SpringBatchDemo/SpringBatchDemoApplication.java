package com.hardcoder.SpringBatchDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchDemoApplication {

/*	If you don't want Spring Batch to create the default batch tables, you can disable the table creation by excluding the BatchAutoConfiguration class:

	@SpringBootApplication(exclude = {BatchAutoConfiguration.class})

	Alternatively, you can configure a custom JobRepository and disable schema initialization in your database settings:

	spring.batch.initialize-schema: never
	Then, you can manually create or customize the batch tables as needed.*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchDemoApplication.class, args);
	}

}
