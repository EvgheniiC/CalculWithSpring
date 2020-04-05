package com.evghenii;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalcul {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        Geometry geometry = context.getBean(Geometry.class);

        System.out.println(geometry.cos(0));
/*
        Programmer programmer = context.getBean(Programmer.class);

        System.out.println(programmer.getMathematician().sqrt(81));*/

    }

}

class TestAutowiring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        Geometry geometry = context.getBean(Geometry.class);

        System.out.println(geometry.cos(0));


    }

}

class TestViaJava {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);


    }

}
