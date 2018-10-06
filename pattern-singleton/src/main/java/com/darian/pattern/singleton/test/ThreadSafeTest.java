package com.darian.pattern.singleton.test;

import com.darian.pattern.singleton.lazy.LazyOne;
import com.darian.pattern.singleton.lazy.LazyThreeStatic;
import com.darian.pattern.singleton.lazy.LazyTwo;
import com.darian.pattern.singleton.register.BeanFactory;


import java.util.concurrent.CountDownLatch;


/**
 * <br>
 * <br>Darian
 **/
public class ThreadSafeTest {

    public static void main(String[] args) {
        int count = 100;
        // 发令枪,
        final CountDownLatch countDownLatch = new CountDownLatch(count);
        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    // 如果相同时间点，打出来的实例是一样的，表示线程安全
                    try {
                        // 阻塞
                        // count = 0 ,就会释放所有的共享锁
                        // 万箭齐发
                        countDownLatch.await();
                        Object obj = LazyOne.getInstence();
//                        Object obj = LazyTwo.getInstence();
                        // 必然会调用，可能忽悠很多线程去同时覅访问 getInstance()
//                        Object obj = LazyThreeStatic.getInstence();
//                        Object obj = BeanFactory.getBean("com.darian.pattern.singleton.test.Pojo");
                        System.out.println(System.currentTimeMillis() + ":" + obj);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }.start();// 每循环一次，就启动一个线程
            // 每次启动一个线程，count--
            countDownLatch.countDown();
        }
    }
}
