package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ningh
 */
@RestController
public class JedisController {

//    @ResponseBody
    @GetMapping("/set/session")
    public String setSession(String userName,HttpServletRequest request){
        request.getSession().setAttribute("USER_SESSION",userName);
        return "设置session";
    }

}
