package com.service.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * {@code @EnableFeignClients} : FeignClient 활성화
 */
@EnableFeignClients
@SpringBootApplication
public class AApplication {

	public static void main(String[] args) {
		SpringApplication.run(AApplication.class, args);
	}

}
