package com.darian.pattern_23._22_Memento.darian;

public class MainClass {
    public static void main(String[] args) {
        Person per = new Person("lifengxing", "男", 24);

//		Memento memento = per.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(per.createMemento());

        per.display();

        per.setName("beifeng");
        per.setSex("女");
        per.setAge(1);

        per.display();

        per.setMemento(caretaker.getMemento());
        per.display();

    }
}
