package com.darian.pattern_23._24_Command.ex3;

public class BananaCommand extends Command {

    public BananaCommand(Peddler peddler) {
        super(peddler);
    }

    public void sail() {
        this.getPeddler().sailBanana();
    }

}
