/*
 * AOPHandle.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Week_05.homework01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author changsu
 * @Date: 2020/11/18 17:00
 */
public class AOPHandle implements InvocationHandler {

    private Object object;

    AOPHandle(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args)
            throws Throwable {
        //before
        System.out.println("AOPTest Before");
        Object ref = method.invoke(object, args);
        //after
        System.out.println("AOPTest After");
        return ref;
    }
}
