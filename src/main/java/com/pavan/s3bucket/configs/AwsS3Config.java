package com.pavan.s3bucket.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AwsS3Config {

	@Bean
	public AmazonS3 s3bucket() {
		AWSCredentials awsCredentials = new BasicAWSCredentials("AKIA4F2JMQJXSDSPP26R",
				"bBrWORkWTQQjl/GCFiWQyu1or8cZiVWx5hDcBkZN");
		return  AmazonS3ClientBuilder.
				standard().
				withRegion("ap-south-1").
				withCredentials(new AWSStaticCredentialsProvider(awsCredentials)).
				build();				
	}
}
