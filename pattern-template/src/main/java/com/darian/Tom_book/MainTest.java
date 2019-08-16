package com.darian.Tom_book;

public class MainTest {
    public static void main(String[] args) {
        NetworkSourseInterface nsInterface = new NetworkSourse();
        nsInterface.doWork();
    }
}

interface NetworkSourseInterface {

    default void doWork() {
    }

    default void work() {
        System.out.println("NetworkSourseInterface.work...");
    }

    default void beforeWork() {
        System.out.println("NetworkSourseInterface.beforeWork...");
    }

    default void afterWork() {
        System.out.println("NetworkSourseInterface.afterWork...");
    }

    default boolean needDoWork() {
        return false;
    }
}

abstract class AbstractNetworkSourse implements NetworkSourseInterface {

    @Override
    public final void doWork() {
        if (!needDoWork()) {
            return;
        }
        beforeWork();
        work();
        afterWork();
    }
}

class NetworkSourse extends AbstractNetworkSourse {

    @Override
    public boolean needDoWork() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("Override  >>>>>  NetworkSourse.work.....");
    }
}
