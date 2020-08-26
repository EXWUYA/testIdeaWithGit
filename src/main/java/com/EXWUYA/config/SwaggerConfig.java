package com.EXWUYA.config;

import io.swagger.models.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApliInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.EXWUYA"))
                .build();
    }


public ApiInfo getApliInfo(){

        return new ApiInfo("spring_boot 测试swagger",
                "这是一个测试",
                "1.0v",
                "",
                getContact(),"","",new ArrayList<>());
}

public Contact getContact(){

        return new Contact("EXWUYA","","764315535@qq.com");
}

}
