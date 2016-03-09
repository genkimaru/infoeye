package com.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "application-context-provider.xml" });
		context.start();

		System.in.read(); // 按任意键退出
	}

}
