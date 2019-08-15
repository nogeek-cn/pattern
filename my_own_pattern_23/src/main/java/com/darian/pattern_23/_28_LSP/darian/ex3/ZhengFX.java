package com.darian.pattern_23._28_LSP.darian.ex3;

public class ZhengFX implements Sibianxing {
    private long side;

    public long getHeight() {
        return this.getSide();
    }

    public long getWidth() {
        return this.getSide();
    }

    public void setHeight(long height) {
        this.setSide(height);
    }

    public void setWidth(long width) {
        this.setSide(width);
    }

    public long getSide() {
        return side;
    }

    public void setSide(long side) {
        this.side = side;
    }
}
