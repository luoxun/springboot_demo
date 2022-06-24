package com.example.hello;

import org.springframework.stereotype.Service;

@Service("try1")
public class TryNumber1 implements InterfaceHello   {

    @Override
    public void says() {
        // TODO Auto-generated method stub
        
        System.out.println("TryNumber1");

    }
    
}
