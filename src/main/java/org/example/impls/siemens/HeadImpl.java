package org.example.impls.siemens;

import org.example.interfaces.Head;

public class HeadImpl implements Head {
    @Override
    public void think() {
        System.out.println("Think as Siemens");
    }
}
