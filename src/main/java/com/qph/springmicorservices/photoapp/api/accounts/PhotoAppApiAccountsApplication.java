package com.qph.springmicorservices.photoapp.api.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppApiAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppApiAccountsApplication.class, args);
	}

}
