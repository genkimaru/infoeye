package com.dubbo.demo.consumer;

import java.util.List;

import com.dubbo.demo.CountryService;
import com.dubbo.demo.ProvinceService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
        classPathXmlApplicationContext.start();

        CountryService countryService = (CountryService) classPathXmlApplicationContext.getBean("countryService");
        
        ProvinceService provinceService = (ProvinceService) classPathXmlApplicationContext.getBean("provinceService");

        List<String> countryList = countryService.countryList();

        System.out.println("=====================================");
        System.out.println(countryList);
        System.out.println("=====================================");
    }
}
