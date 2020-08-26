package com.EXWUYA.test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Getter implements Runnable{

    @Autowired
    private ForValidationTest forValidationTest;

    public ForValidationTest getForValidationTest(){
        return forValidationTest;

    }

    public void setForValidationTest(ForValidationTest forValidationTest) {
        this.forValidationTest = forValidationTest;
    }

    public void run() {
        System.out.println("start run");
      forValidationTest.toString();
      System.out.println("end run");
    }
}
