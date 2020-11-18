/*
 * Main.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Week_05.homework01;

import java.lang.reflect.Proxy;

/**
 * @author changsu
 * @Date: 2020/11/18 17:03
 */
public class Main {
    public static void main(String[] args) {
        AOPTest aopTest = new AOPTest();
        AOPHandle aopHandle = new AOPHandle(aopTest);
        IAOPTest invoke = (IAOPTest) Proxy.newProxyInstance(AOPTest.class.getClassLoader(),
                new Class[]{ IAOPTest.class }, aopHandle);
        invoke.test();
    }
}
