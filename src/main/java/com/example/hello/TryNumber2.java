package com.example.hello;

import org.springframework.stereotype.Service;

@Service("try2")
public class TryNumber2 implements InterfaceHello {

    @Override
    public void says() {
        // TODO Auto-generated method stub
        System.out.println("try___number2___");
    }
    
}
