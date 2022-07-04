package org.example.impls.boston;

import org.example.interfaces.Head;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("bHead")
@Primary
public class HeadImpl implements Head {
    @Override
    public void think() {
        System.out.println("Think as Boston");
    }
}
