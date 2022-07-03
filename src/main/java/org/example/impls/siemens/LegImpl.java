package org.example.impls.siemens;

import org.example.interfaces.Leg;

public class LegImpl implements Leg {
    @Override
    public void move() {
        System.out.println("Move as Siemens");
    }
}
