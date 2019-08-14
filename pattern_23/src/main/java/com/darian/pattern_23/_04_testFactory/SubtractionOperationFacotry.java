package com.darian.pattern_23._04_testFactory;

public class SubtractionOperationFacotry implements OperationFactory{
    @Override
    public Operation getOperation() {
        return new SubtractionOperation();
    }
}
