package com.darian.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <br>
 * <br>Darian
 **/
public class CloneTest {
    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.setName("Darian");


        try {
            Prototype obj = (Prototype) prototype.clone();
            System.out.println(obj.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }
}
