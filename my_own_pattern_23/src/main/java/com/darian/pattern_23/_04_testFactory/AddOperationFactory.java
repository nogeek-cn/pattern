package com.darian.pattern_23._04_testFactory;

public class AddOperationFactory implements OperationFactory {

    public Operation getOperation() {
        return new AddOperation();
    }

}
