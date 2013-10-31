package com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BPBean implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String bn)
			throws BeansException {
		
		System.out.println("postProcessAfterInitialization beanname: "+bn+" "+bean.getClass().getCanonicalName());
			
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String bn)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization beanname: "+bn+" "+bean.getClass().getCanonicalName());
		return bean;
	}

}
