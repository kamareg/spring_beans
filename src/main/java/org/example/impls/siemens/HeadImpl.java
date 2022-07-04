package org.example.impls.siemens;

import org.example.interfaces.Head;
import org.springframework.stereotype.Component;

@Component("sHead")
public class HeadImpl implements Head {
    @Override
    public void think() {
        System.out.println("Think as Siemens");
    }
}
