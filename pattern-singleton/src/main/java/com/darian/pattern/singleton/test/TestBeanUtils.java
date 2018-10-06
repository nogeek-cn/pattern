package com.darian.pattern.singleton.test;

import com.darian.pattern.singleton.TestBeanUtilsObject;
import org.springframework.beans.BeanUtils;

import java.lang.reflect.InvocationTargetException;


/**
 * <br>
 * <br>Darian
 **/
public class TestBeanUtils {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestBeanUtilsObject testBeanUtilsObject1_a = new TestBeanUtilsObject();
        testBeanUtilsObject1_a.setName("aaa");
        TestBeanUtilsObject testBeanUtilsObject1_b = new TestBeanUtilsObject();
        // springframework -> copyProperties ( source -> target )
        // 源信息 -> 复制品
        org.springframework.beans.BeanUtils.copyProperties(testBeanUtilsObject1_a, testBeanUtilsObject1_b);
        System.out.println(testBeanUtilsObject1_b);

        TestBeanUtilsObject testBeanUtilsObject2_a = new TestBeanUtilsObject();
        testBeanUtilsObject2_a.setName("bbb");
        TestBeanUtilsObject testBeanUtilsObject2_b = new TestBeanUtilsObject();
        // apache -> copyProperties ( dest ->  orig)
        // 复制品 -> 源信息
        org.apache.commons.beanutils.BeanUtils.copyProperties(testBeanUtilsObject2_b,  testBeanUtilsObject2_a);
        System.out.println(testBeanUtilsObject2_b);
    }
}
