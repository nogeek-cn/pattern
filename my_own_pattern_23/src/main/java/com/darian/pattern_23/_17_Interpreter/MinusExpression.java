package com.darian.pattern_23._17_Interpreter;

public class MinusExpression extends Expression {

    public void interpret(Context context) {
        System.out.println("MinusExpression.interpret....");
        String input = context.getInput();
        int inInput = Integer.parseInt(input);
        // inInput--;
        --inInput;
        context.setInput(String.valueOf(inInput));
        context.setOutput(inInput);
    }

}
