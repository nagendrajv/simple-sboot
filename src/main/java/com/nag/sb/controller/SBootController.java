package com.nag.sb.controller;

import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping(value="/things")
public class SBootController {

    final Logger logger = LogManager.getLogger(SBootController.class);

    @RequestMapping(value="/ping", method=RequestMethod.GET)
    public String requestMethodName() throws Exception {

        InetAddress inet = InetAddress.getLocalHost();
        logger.debug(inet.getHostName()+" >> "+inet.getHostAddress());

        return inet.getHostName()+" >> "+inet.getHostAddress();
    }
    
}

