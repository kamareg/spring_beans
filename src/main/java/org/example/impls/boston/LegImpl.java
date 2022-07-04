package org.example.impls.boston;

import org.example.interfaces.Leg;
import org.springframework.stereotype.Component;

@Component("bLeg")
public class LegImpl implements Leg {
    @Override
    public void move() {
        System.out.println("Move as Boston");
    }
}
