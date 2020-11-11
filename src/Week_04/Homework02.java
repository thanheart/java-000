/*
 * Homework02.java
 * Copyright 2020 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package Week_04;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author changsu
 * @Date: 2020/11/11 16:49
 */
public class Homework02 {

    public static void main(String[] args)
            throws InterruptedException, ExecutionException, TimeoutException {
        CompletableFuture<Boolean> future = CompletableFuture.supplyAsync(() -> print());
        Boolean result = future.get(2, TimeUnit.SECONDS);
        if (result) {
            System.out.println("---异步接口结果返回---");
        }

        System.out.println("---main方法结束---");
        //结束main 方法
    }

    public static Boolean print() {
        System.out.println("---print开始执行---");
        try {
            Thread.sleep(1000);
        } catch (final Exception e) {

        }
        System.out.println("---print结束执行---");
        return true;
    }
}
