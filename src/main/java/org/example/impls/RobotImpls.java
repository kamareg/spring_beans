package org.example.impls;

import org.example.interfaces.Hand;
import org.example.interfaces.Head;
import org.example.interfaces.Leg;
import org.example.interfaces.Robot;

public class RobotImpls implements Robot {
    private Head head;
    private Hand hand;
    private Leg leg;
    private String name;
    private int memory;

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
}
