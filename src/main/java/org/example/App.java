package org.example;

import org.example.impls.RobotImpls;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        final ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/demo.xml");
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                context.close();    }});

Object r2d2 = context.getBean("R2D2");
        RobotImpls r2d21 = (RobotImpls) r2d2;
        System.out.println("r2d2" + r2d21);
r2d21.action();


RobotImpls r3d3 = context.getBean("R2D3", RobotImpls.class);
        System.out.println("r3d3" + r3d3);
        r3d3.action();
    }
}
