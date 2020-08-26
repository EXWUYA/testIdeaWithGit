package com.EXWUYA.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class CustomLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        System.out.println("CustomLocaleResolver生效");
        String ln=request.getParameter("ln");
        Locale locale=null;
        if (!StringUtils.isEmpty(ln)){

            String[] members=ln.split("_");
            if (members.length==2){
                locale=new Locale(members[0],members[1]);
            }
            if (members.length==1){
                locale=new Locale(members[0]);
            }
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {}
}
