package com.darian.pattern.singleton.lazy;

/**
 *
 **/
public class LazyThreeStatic {

    public static final LazyThreeStatic getInstence() {
        return LazyHolder.LAZY_THRER_STATIC;
    }

    private static class LazyHolder {
        private static final LazyThreeStatic LAZY_THRER_STATIC = new LazyThreeStatic();
    }
}
