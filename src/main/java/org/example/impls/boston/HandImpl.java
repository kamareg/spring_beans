package org.example.impls.boston;

import org.example.interfaces.Hand;
import org.springframework.stereotype.Component;

@Component("bHand")
public class HandImpl  implements Hand {
    @Override
    public void push() {
        System.out.println("Push as Boston");
    }
}
