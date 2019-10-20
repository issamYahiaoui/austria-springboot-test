package com.planerygmbh.springboottest.models;

public class Response {
    private Float a;
    private Float b;
    private Float res;

    public Response(Float a, Float b, Float res) {
        this.a = a;
        this.b = b;
        this.res = res;
    }

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

    public Float getRes() {
        return res;
    }

    public void setRes(Float res) {
        this.res = res;
    }
}
