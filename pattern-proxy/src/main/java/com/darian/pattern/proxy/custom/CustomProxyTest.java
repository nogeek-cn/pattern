package com.darian.pattern.proxy.custom;


import com.darian.pattern.proxy.jdk.XieMu;
import com.darian.pattern.staticed.Person;

/**
 * <br>
 * <br>Darian
 **/
public class CustomProxyTest {
    public static void main(String[] args) throws Exception {
//        Person person = (Person)new JDKMeiPo().getInstence(new XieMu());
//        person.findLove();
        Person person = (Person) new CustomMeipo().getInstence(new XieMu());
        System.out.println(person.getClass());
        person.findJob();
    }
}
