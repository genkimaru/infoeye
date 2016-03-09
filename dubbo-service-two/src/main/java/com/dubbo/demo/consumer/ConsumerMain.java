package com.dubbo.demo.consumer;

import java.util.List;

import com.dubbo.demo.ProvinceService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Jerry Lee
 */
public class ConsumerMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context-consumer.xml");
        classPathXmlApplicationContext.start();

        ProvinceService provinceService = (ProvinceService) classPathXmlApplicationContext.getBean("provinceService");
        List<String> provinceList = provinceService.provinceList("china");

        System.out.println("=====================================");
        System.out.println(provinceList);
        System.out.println("=====================================");
    }
}
