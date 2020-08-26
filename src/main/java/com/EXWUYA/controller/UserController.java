package com.EXWUYA.controller;

import com.EXWUYA.domian.User;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/user")
    public String testHello(@Valid @RequestBody User user, BindingResult bindingResult){
        for (ObjectError error : bindingResult.getAllErrors()) {
            System.out.println(error.getDefaultMessage());
        }
        System.out.println("hello buddy");
        System.out.println("hello buddy");
        System.out.println("hello buddy");
        System.out.println("hello buddy");

        return "user";
    }

    @RequestMapping("/main")
    public String toMain() {
        return "hello";
    }



    @RequestMapping("/test")
    public String toTest(ModelMap modelMap){

        modelMap.addAttribute("one","起飞");
        modelMap.addAttribute("first","难受~");
        modelMap.addAttribute("firstOne","吸血，怎么说，吸血");
        return "test";
    }
    @RequestMapping("/error")
    public String toError(){
        System.out.println("enter error method");
        throw new RuntimeException();

//        return "errorPage";
    }

    @RequestMapping("/preHandle1")
    public void toPreHandle1(ModelMap modelMap){
        System.out.println("enter prehandle1");
        System.out.println(modelMap.getAttribute("key1"));
        System.out.println(modelMap.getAttribute("key2"));

    }

    @RequestMapping("/preHandle2")
    public void toPreHandle2(User user){
        System.out.println("enter prehandle2");
        System.out.println(user);

    }

    /*
    无法完成绑定，因为springMVC中map类型已经被modelMap占用。应该像toPreHandle1一样
    通过modelMap向map类型添加值
     */
    @RequestMapping("/preHandle3")
    public void toPreHandle3(@ModelAttribute("mapTest") Map map){
        System.out.println("enter prehandle3");
        System.out.println(map.get("key2"));

    }

    @RequestMapping("/userTest")
    public String toUserTest(User user, Date date){
        user.setBirthday(date);
        System.out.println(user);

        return "success";
    }

}
