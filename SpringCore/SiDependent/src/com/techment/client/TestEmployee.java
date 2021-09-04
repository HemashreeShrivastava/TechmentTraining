package com.techment.client;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Employee;  
public class TestEmployee {
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("object.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee e=(Employee)factory.getBean("obj");  
	    e.displayInfo();  
	      
	}  

}
