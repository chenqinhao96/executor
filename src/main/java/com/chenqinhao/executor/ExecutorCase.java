package com.chenqinhao.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by chenqinhao on 2018/1/4.
 */
public class ExecutorCase {

    private static Executor executor = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            executor.execute(new Task());
        }
    }

    static class Task implements Runnable {

        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

}
