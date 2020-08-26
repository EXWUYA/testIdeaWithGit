package com.EXWUYA.PreHandler;


import com.EXWUYA.domian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Date;
import java.util.Map;


@ControllerAdvice
public class DataPreHandler1 {
    @Autowired
    ApplicationContext ac;

    /*
  无法完成绑定，因为springMVC中map类型已经被modelMap占用。应该像toPreHandle1一样
  通过modelMap向map类型添加值
   */
    @ModelAttribute
    public Map<String,Object> preHandleMap(ModelMap modelMap){
        modelMap.addAttribute("key1","this is value of the key1 ");
        return modelMap;

    }


    @ModelAttribute("mapTest")
    public Map preHandleMap2(){
        return new ModelMap().addAttribute("key2","this is value of the key2");

    }


    @ModelAttribute()
    public User preHandleUser(){
        User user =ac.getBean("user",User.class);
        user.setAge(20);
        user.setBirthday(new Date());
        user.setUserName("测试数据预处理");
        return user;
    }
}
