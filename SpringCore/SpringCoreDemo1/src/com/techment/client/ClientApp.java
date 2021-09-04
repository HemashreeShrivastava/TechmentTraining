package com.techment.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.Core.Bank;

public class ClientApp {

	public static void main(String[] args) {
		
		Resource resource =new ClassPathResource("object.xml");//point to file
		BeanFactory beanFactory=new XmlBeanFactory(resource);// 
		
		Bank bank=(Bank)beanFactory.getBean("obj");
		bank.displayBankDetail();
		
	}

}
