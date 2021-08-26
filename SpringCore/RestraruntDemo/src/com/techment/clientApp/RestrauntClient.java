package com.techment.clientApp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.techment.modal.Restraunt;



public class RestrauntClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource =new ClassPathResource("object.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);// 
		
        Restraunt restraunt=(Restraunt)beanFactory.getBean("r");
    	restraunt.displayRestrauntDetails();
	}

}
