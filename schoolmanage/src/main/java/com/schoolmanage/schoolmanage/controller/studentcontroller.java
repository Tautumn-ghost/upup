package com.schoolmanage.schoolmanage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class studentcontroller {
    @RequestMapping("/test")
    public int test(@PathParam("a") int a, @PathParam("b") int b) {
        return a + b;
    }
}
