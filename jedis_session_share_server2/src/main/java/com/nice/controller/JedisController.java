package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ningh
 */
@RestController
public class JedisController {

    @GetMapping("/get/session")
    public String getSession(HttpServletRequest request){
        return (String) request.getSession().getAttribute("USER_SESSION");
    }

}
