package com.wipro.mvn_project;

import java.util.jar.Attributes.Name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Phone iPhone = (Phone)app.getBean("phone");
        iPhone.Call();
        System.out.println(iPhone);
        
        Phone mi = app.getBean(Phone.class);
        mi.Call();
    }
}
