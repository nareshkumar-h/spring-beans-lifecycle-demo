package com.naresh.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class AwareBean implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {

	public AwareBean() {
		System.out.println("AwareBean->Instantiate");
	}
	
	public void hello() {
		System.out.println("AwareBean->Business Method");
	}

	public void setBeanName(String name) {
		System.out.println("AwareBean->setBeanName:" + name);
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("AwareBean->setApplicationContext");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		System.out.println("AwareBean->setBeanFactory");
	}

}
