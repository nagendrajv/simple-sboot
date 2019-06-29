package com.nag.sb.controller;

import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/things")
public class SBootController {

    @RequestMapping(value="/ping", method=RequestMethod.GET)
    public String requestMethodName() throws Exception {
        InetAddress inet = InetAddress.getLocalHost();
        return inet.getHostName()+" >> "+inet.getHostAddress();
    }
    
}

