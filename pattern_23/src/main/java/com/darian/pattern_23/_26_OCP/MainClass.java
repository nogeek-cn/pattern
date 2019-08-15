package com.darian.pattern_23._26_OCP;

public class MainClass {
    public static void main(String[] args) {
        BankWorker bankWorker = new BankWorker();
        bankWorker.saving();
        bankWorker.drawing();

        bankWorker.zhuanzhang();

        bankWorker.jijin();
    }
}
