package com.spring.SpringIntro.SpringIntro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanConfigurationAnnotation.ConfigurationTest;
import beanConfigurationAnnotation.Test;
import beanConfigurationComponent.TestComponent;
import beanConfigurationXML.TestXML;

@SpringBootApplication
public class SpringIntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroApplication.class, args);
	
		//configBean();
		//configXML();
		configComponent();
	}

	
//metodo per configurazione con CLASS CONFIGURATION
	public static void configBean() {
	
	//i bean si trovano in un contenitore quindi devo crearlo
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext(ConfigurationTest.class);
	
	//Creo bean
	Test t1 =(Test) appContext.getBean("test");
	System.out.println(	t1.readTxt());
	
	Test t2 =(Test) appContext.getBean("testparam", "Titolo bean", "Testo bean");
	System.out.println(	t2.readTxt());
	
	appContext.close();

	}
	
//metodo per configurazione con FILE XML
	public static void configXML() {
		ClassPathXmlApplicationContext appContext=new ClassPathXmlApplicationContext("beans.xml");
		
		TestXML t1 = (TestXML) appContext.getBean("testXML");
		System.out.println(t1.readTxt());
		
		TestXML t2 = (TestXML) appContext.getBean("testXMLparams");
		System.out.println(t2.readTxt());
		
		appContext.close();
	}
	
//metodo per configurazione con FILE COMPONENT
	public static void configComponent() {
		
		//i bean si trovano in un contenitore quindi devo crearlo
		AnnotationConfigApplicationContext appContext=new AnnotationConfigApplicationContext();
		
		appContext.scan("beanConfigurationComponent");
		appContext.refresh();
		
	//recupero bean tramile il component @Component("TestComponent")
		TestComponent t1 = (TestComponent ) appContext.getBean("TestComponent");
		t1.setTitle(" primo bean component");
		t1.setTxt("testo primo bean");
		System.out.println(t1.readTxt());
		
		TestComponent t2 = (TestComponent ) appContext.getBean("TestComponent", "secondo beand component", "testo secondo bean");
		System.out.println(t2.readTxt());
		
		appContext.close();
	}
}
