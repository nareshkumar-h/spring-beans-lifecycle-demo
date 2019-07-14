package com.naresh.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class UserBean implements InitializingBean, DisposableBean,BeanNameAware,BeanFactoryAware,ApplicationContextAware {

	public UserBean() {
		System.out.println("UserBean->Instantiate");
	}
	
	public void destroy() throws Exception {
		System.out.println("UserBean->Destroy");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("UserBean->afterPropertiesSet");
	}
	
	public void hello() {
		System.out.println("UserBean->Business Method");
	}

	public void setBeanName(String name) {
		System.out.println("UserBean->setBeanName:" + name);
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("UserBean->setApplicationContext");
	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

		System.out.println("UserBean->setBeanFactory");
	}
	
	public void customInit() {
		System.out.println("UserBean->customInit");
	}
	
	public void customDestroy() {
		System.out.println("UserBean->customDestroy");
	}

}
