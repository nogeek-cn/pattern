package com.darian.pattern_23._24_Command.ex3;

public class MainClass {
    public static void main(String[] args) {
        Peddler peddler = new Peddler();
//		peddler.sailApple();
//		peddler.sailBanana();

        Command appleCommand = new AppleCommand(peddler);
        Command bananaCommand = new BananaCommand(peddler);
//		appleCommand.sail();
//		bananaCommand.sail();
        Waiter waiter = new Waiter();
        waiter.setCommand(appleCommand);
        waiter.sail();
        waiter.setCommand(bananaCommand);
        waiter.sail();
    }
}
