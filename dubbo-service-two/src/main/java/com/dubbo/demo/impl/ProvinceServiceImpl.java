package com.dubbo.demo.impl;

import java.util.ArrayList;
import java.util.List;

import com.dubbo.demo.ProvinceService;


/**
 * @author Jerry Lee
 */
public class ProvinceServiceImpl implements ProvinceService {

	@Override
	public List<String> provinceList(String name) {
	   if("china".equalsIgnoreCase(name)){
			 ArrayList<String> list = new ArrayList<String>();
			 list.add("hebei");
			 list.add("henan");
			 list.add("hubei");
			 list.add("hunan");
			 return list;
		   
	   }else if("america".equalsIgnoreCase(name)){
			 ArrayList<String> list = new ArrayList<String>();
			 list.add("California");
			 list.add("Florida");
			 list.add("Hawaii");
			 list.add("Mississippi");
			 return list;
		   
	   }else if("japan".equalsIgnoreCase(name)){
			 ArrayList<String> list = new ArrayList<String>();
			 list.add("honsyu");
			 list.add("kyusyu");
			 list.add("hokkaito");
			 list.add("sikoku");
			 return list;
		   
	   }else{
		return null;
	   }
	}

}
