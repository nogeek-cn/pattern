package com.darian.pattern.proxy.custom;

import java.lang.reflect.Method;

/**
 * <br>
 * <br>Darian
 **/
public interface DarianInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)throws Throwable;
}
