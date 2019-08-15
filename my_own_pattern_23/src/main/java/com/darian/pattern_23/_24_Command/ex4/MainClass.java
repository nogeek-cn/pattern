package com.darian.pattern_23._24_Command.ex4;

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

        waiter.setOrder(appleCommand);
        waiter.setOrder(bananaCommand);

        waiter.removeOrder(appleCommand);

        waiter.sail();
    }
}
