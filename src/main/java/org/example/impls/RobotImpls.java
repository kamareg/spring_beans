package org.example.impls;

import org.example.impls.boston.HandImpl;
import org.example.impls.boston.HeadImpl;
import org.example.impls.boston.LegImpl;
import org.example.interfaces.Hand;
import org.example.interfaces.Head;
import org.example.interfaces.Leg;
import org.example.interfaces.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("R2D2")
public class RobotImpls implements Robot {
    @Autowired
    private Head head;
    @Autowired
    @Qualifier("sHand")
    private Hand hand;
    @Autowired
    @Qualifier("sLeg")
    private Leg leg;
    @Value("R5D5")
    private String name;
    @Value("500")
    private int memory;
    public RobotImpls() {
    super();
        System.out.println("Default constructor");
    }
    public RobotImpls(Head head, Hand hand, Leg leg, String name, int memory) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.name = name;
        this.memory = memory;
        System.out.println("Constructor with parameters");
    }

    @Override
    public void action() {
head.think();
leg.move();
hand.push();
    }

    @Override
    public String toString() {
        return "RobotImpls{" +
                "head=" + head +
                ", hand=" + hand +
                ", leg=" + leg +
                ", name='" + name + '\'' +
                ", memory=" + memory +
                '}';
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void initialize () {
        System.out.println("Init method");
    }

    public void finitialize () {
        System.out.println("Finish method");
    }
}
