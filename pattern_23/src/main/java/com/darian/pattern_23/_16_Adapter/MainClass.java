package com.darian.pattern_23._16_Adapter;

public class MainClass {
    public static void main(String[] args) {
//		Current current = new Current();
//		current.use220V();

        AdapterExtends adapterExtends = new AdapterExtends();
        adapterExtends.use18V();

        AdapterDispater adapter = new AdapterDispater(new Current());
        adapter.use18V();
    }
}
