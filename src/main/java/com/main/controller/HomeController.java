package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created with IDEA
 * @author:zhongxiaowa
 * @Date:2018/7/19
 * @Time:15:02
 */
@Controller

public class HomeController {
    @RequestMapping(value = "/firstpage" ,method = RequestMethod.GET)
    public String Welcome(){
        return "Welcome";
    }
}
