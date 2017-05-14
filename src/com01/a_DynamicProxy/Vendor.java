package com01.a_DynamicProxy;

public class Vendor implements Sell {
    public void sell() {
        System.out.println("In sell method");
    }
    public void ad() {
        System.out.println("ad method");
    }
}
