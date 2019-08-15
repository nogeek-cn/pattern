package com.darian.pattern_23._24_Command.ex2;

public class AppleCommand extends Command {

    public AppleCommand(Peddler peddler) {
        super(peddler);
    }

    public void sail() {
        this.getPeddler().sailApple();
    }

}
