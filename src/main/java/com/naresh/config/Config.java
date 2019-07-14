package com.naresh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.naresh.beans.UserBean;

@Configuration
@ComponentScan("com.naresh")
public class Config {

	@Bean(initMethod = "customInit", destroyMethod ="customDestroy")
	//@Bean
	public UserBean userBean() {
		UserBean userBean = new UserBean();
		userBean.setName("naresh");
		return userBean;
	}
}
