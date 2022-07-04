package org.example;

import org.example.impls.RobotImpls;
import org.example.impls.siemens.HandImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@ComponentScan(basePackages = )
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


/* RobotImpls r3d3 = context.getBean("R3D3", RobotImpls.class);
        System.out.println("r3d3" + r3d3);
        r3d3.action();

        RobotImpls r4d4 = context.getBean("R3D3", RobotImpls.class);
        System.out.println("r4d4" + r4d4);
        r4d4.setHand(context.getBean("siemensHand", HandImpl.class));
        r4d4.action();

        System.out.println("After: ");
        System.out.println("r3d3" + r3d3);
        System.out.println("r4d4" + r4d4);*/


    }
}
