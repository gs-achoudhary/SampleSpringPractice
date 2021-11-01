package com.abhi.practice.SpringPractice;

import com.abhi.practice.SpringPractice.basic.BinarySearch;
import com.abhi.practice.SpringPractice.componentscan.ComponentDAO;
import com.abhi.practice.SpringPractice.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPracticeComponentScan {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringPracticeScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(SpringPracticeScopeApplication.class, args);

        ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

        LOGGER.info("{}",componentDAO);
        LOGGER.info("{}",componentDAO.getJdbcConnection());

    }

}
