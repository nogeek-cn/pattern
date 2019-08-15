package com.darian.pattern_23._28_LSP.darian.ex3;

public class MainClass {
    public static void main(String[] args) {
        ChangFX changfx = new ChangFX();
        changfx.setHeight(10);
        changfx.setWidth(20);
        test(changfx);

        ZhengFX zhengfx = new ZhengFX();
        zhengfx.setHeight(10);
        test(zhengfx);
    }

    public static void test(Sibianxing sibianxing) {
        System.out.println(sibianxing.getHeight());
        System.out.println(sibianxing.getWidth());
    }

//	public static void resize(Sibianxing sibianxing) {
//		while(sibianxing.getHeight() <= sibianxing.getWidth()) {
//			sibianxing.setHeight(sibianxing.getHeight() + 1);
//			test(sibianxing);
//		}
//	}
}
