package org.example.impls.boston;

import org.example.interfaces.Leg;

public class LegImpl implements Leg {
    @Override
    public void move() {
        System.out.println("Move as Boston");
    }
}
