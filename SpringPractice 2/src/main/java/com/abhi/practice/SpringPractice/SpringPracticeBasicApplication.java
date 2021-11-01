package com.abhi.practice.SpringPractice;

import com.abhi.practice.SpringPractice.basic.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPracticeBasicApplication {

	public static void main(String[] args) {

		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringPracticeBasicApplication.class, args);

		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		BinarySearch binarySearch1 = applicationContext.getBean(BinarySearch.class);

		int result = binarySearch.binarySearch(new int[] {12, 4, 6, 3}, 3);

		System.out.println(result);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);

	}

}