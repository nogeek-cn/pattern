package com.darian.pattern_23._29_DIP;


public class Computer {
    private MainBoard mainBoard;
    private Memory memory;
    private HardDisk harddisk;

    public MainBoard getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(MainBoard mainBoard) {
        this.mainBoard = mainBoard;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public HardDisk getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(HardDisk harddisk) {
        this.harddisk = harddisk;
    }

    public void display() {
        mainBoard.doSomething();
        memory.doSomething();
        harddisk.doSomething();
    }
}
