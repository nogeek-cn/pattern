package com.darian.pattern.singleton.threadLocal;

public class ThreadLocalSingleTon {
    private static final ThreadLocal<ThreadLocalSingleTon> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleTon>() {
                @Override
                protected ThreadLocalSingleTon initialValue() {
                    return new ThreadLocalSingleTon();
                }
            };

    private ThreadLocalSingleTon() {
    }

    ;

    private static ThreadLocalSingleTon getInstance() {
        return threadLocalInstance.get();
    }
}
