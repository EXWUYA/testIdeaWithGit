package com.EXWUYA.test1;

import com.EXWUYA.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



@Component("forValidationTest")
public class ForValidationTest {

    @Value("#{user}")
   private User user;

    @Max(value = 18)
    @Min(value = 18)
    @NotNull
    private Integer age=null;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ForValidationTest{" +
                "user=" + user +
                '}';
    }
//    public void testDI(){
//        user.toString();
//    }


}
