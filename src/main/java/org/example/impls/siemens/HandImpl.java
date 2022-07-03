package org.example.impls.siemens;

import org.example.interfaces.Hand;

public class HandImpl  implements Hand {
    @Override
    public void push() {
        System.out.println("Push as Siemens");
    }
}
