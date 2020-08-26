package com.EXWUYA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
@RequestMapping("/i18n")

public class I18nController {



    @RequestMapping("/")
    public String toInternational(){

        return "international";
    }


}
