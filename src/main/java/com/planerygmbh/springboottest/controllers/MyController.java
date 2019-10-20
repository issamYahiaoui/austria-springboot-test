package com.planerygmbh.springboottest.controllers;

import com.planerygmbh.springboottest.models.Request;
import com.planerygmbh.springboottest.models.Response;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@Validated
@RestController
@RequestMapping("/api/v1")
public class MyController {
    @PostMapping(value = "/mul", consumes = "application/json", produces = "application/json")
    public Response multiplyTwoValue(@Valid @RequestBody Request request){
        return new Response(request.getA(),request.getB(),request.getA()*request.getB());
    }
}
