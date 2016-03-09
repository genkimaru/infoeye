package com.dubbo.demo.impl;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.ProvinceService;

public class InvokeOtherService {
	
	
	public static List<String> provincesByCountry(String country) {
		
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
        classPathXmlApplicationContext.start();

        ProvinceService provinceService = (ProvinceService) classPathXmlApplicationContext.getBean("provinceService");
        List<String> provinceList = provinceService.provinceList(country);
        return provinceList;
	}

}
