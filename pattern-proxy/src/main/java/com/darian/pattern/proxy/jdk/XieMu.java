package com.darian.pattern.proxy.jdk;

import com.darian.pattern.staticed.Person;

/**
 * <br>
 * <br>Darian
 **/
public class XieMu implements Person {
    public void findLove(){
        System.out.println(">>>>>高富帅");
        System.out.println(">>>>>身高180");
        System.out.println(">>>>>胸大，6块腹肌");
    }

    public void zuFangZi() {
        System.out.println(">>>>>租房子");
    }

    public void buy() {
        System.out.println(">>>>>买东西");
    }
    public void findJob() {
        System.out.println(">>>>>月薪20K");
        System.out.println(">>>>>找工作");
    }
}
