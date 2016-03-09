package com.dubbo.demo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.demo.CountryService;
import com.dubbo.demo.ProvinceService;

public class CountryServiceImpl implements CountryService {

	@Override
	public List<String> countryList() {
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("china");
		 list.add("america");
		 list.add("japan");
	
		 List<String> provincelist = InvokeOtherService.provincesByCountry("china");
		 System.out.println("***************");
		 System.out.println(provincelist);
		 System.out.println("***************");
		return list;
	}
	

}
