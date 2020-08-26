package com.EXWUYA.controller;


import com.EXWUYA.dao.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {


@RequestMapping("/enter")
public String enterPage(){

    return "upload";
}


@RequestMapping("/fileUpload")
    public String testFileUpload(@RequestParam(value = "file") MultipartFile file
         ,HttpServletRequest request ){

    // 文件不为空
    if(!file.isEmpty()) {
        // 文件存放路径
        String path = request.getSession().getServletContext().getRealPath("/");
        System.out.println(path);
        // 文件名称
        String name = String.valueOf(new Date().getTime()+"_"+file.getOriginalFilename());
//        File destFile = new File(path,name);
        File file1 =new File(path+"kekekeke");
        File destFile;
        if (file1.isDirectory()){
            destFile =new File(file1,name);
        }else {
            file1.mkdir();
            destFile =new File(file1,name);
        }


        // 转存文件

        try {
            file.transferTo(destFile);
        } catch (IllegalStateException | IOException e) {
            e.printStackTrace();
        }
        // 访问的url
        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                + request.getContextPath() + "/" + name;
        System.out.println(url);
    }

    return "success";
}

}
