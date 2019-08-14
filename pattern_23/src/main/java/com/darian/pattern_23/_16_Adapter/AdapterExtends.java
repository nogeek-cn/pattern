package com.darian.pattern_23._16_Adapter;

public class AdapterExtends extends Current {
    public void use18V() {
        System.out.println("AdapterExtends...use18V...");
        this.use220V();
    }
}
