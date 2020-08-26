package com.EXWUYA.domian;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;


@PropertySource("classpath:test.properties")
@ConfigurationProperties(prefix = "user")
@Validated
@Component("user")
@ApiModel(value = "用户类",description = "封装了用户相关信息")
public class User {

    @NotNull
//    @ApiModelProperty(value ="用户名")
    private String userName;

    @NotNull
//    @ApiModelProperty(value = "用户生日")
    private Date   birthday;

    @NotNull
    @Min(18)
    private int  age;


    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                '}';
    }
}
