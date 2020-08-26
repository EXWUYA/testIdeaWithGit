package com.EXWUYA.Converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class StringToDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String source) {
System.out.println("converting");
        if (source!=null){
            try {
                SimpleDateFormat spf=new SimpleDateFormat("y-M-d");
                return spf.parse(source);
            }catch (Exception e){
                e.getStackTrace();
            }
        }else {
            throw new RuntimeException("请求参数为空！");

        }
        return null;
    }
    }

