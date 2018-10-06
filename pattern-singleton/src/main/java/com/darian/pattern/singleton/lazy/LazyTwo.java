package com.darian.pattern.singleton.lazy;

/**
 * <br>
 * <br>Darian
 **/
public class LazyTwo {
    private LazyTwo() {
    }
    private static LazyTwo lazy = null;

    public static synchronized LazyTwo getInstence(){
        if(lazy == null){
            lazy = new LazyTwo();
        }
        return lazy;
    }
}
