package org.example.impls.boston;

import org.example.interfaces.Head;

public class HeadImpl implements Head {
    @Override
    public void think() {
        System.out.println("Think as Boston");
    }
}
