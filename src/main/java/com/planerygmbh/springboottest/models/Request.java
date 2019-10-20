package com.planerygmbh.springboottest.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Request {

    @NotNull(message = "Please provide a value A")
    private Float a;

    @NotNull(message = "Please provide a value B")
    private Float b;

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }


}
