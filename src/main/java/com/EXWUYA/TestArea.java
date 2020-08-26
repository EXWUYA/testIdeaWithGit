package com.EXWUYA;

import com.EXWUYA.domian.User;
import com.EXWUYA.test1.ForValidationTest;
import com.EXWUYA.test1.Getter;
import org.apache.logging.slf4j.SLF4JLogger;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.http.HttpProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@MapperScans({@MapperScan("com.EXWUYA.dao.mapper")})
@SpringBootApplication
public class TestArea {

    static public void main(String[] args){


        System.out.println("main start");
      ConfigurableApplicationContext cac = SpringApplication.run(TestArea.class,args);
     System.out.println(  cac.getBean("getter",Getter.class).getForValidationTest().toString());
//throw new RuntimeException();



//        SpringApplication ac=new SpringApplication();
   // ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
  //Validator validator = factory.getValidator();
//        ForValidationTest forValidation=new ForValidationTest();
//        forValidation.setAge(22);
//   Set<ConstraintViolation<ForValidationTest>> constraintViolationSet= validator.validate(forValidation);
//        for (ConstraintViolation<ForValidationTest> violation : constraintViolationSet) {
//            System.out.println(violation.getMessage());
//        }
//        constraintViolationSet= validator.validate(forValidation);
//        for (ConstraintViolation<ForValidationTest> violation : constraintViolationSet) {
//            System.out.println(violation.getMessage());
//        }
        System.out.println("main end");
    }
}
