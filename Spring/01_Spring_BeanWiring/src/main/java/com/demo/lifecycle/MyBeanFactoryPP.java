package com.demo.lifecycle;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPP implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("bean factory post processor");
		
		String names[] = beanFactory.getBeanDefinitionNames();
		List<String> namesList = Arrays.asList(names);
		namesList.forEach(bean -> System.out.println(bean));
		
	}
	

}
