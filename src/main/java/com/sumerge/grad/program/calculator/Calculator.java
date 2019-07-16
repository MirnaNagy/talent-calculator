package com.sumerge.grad.program.calculator;

import com.sumerge.grad.program.operation.ArithmeticOperation;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Calculator {

    private ArithmeticOperation operation;

    public Double add(Double n1, Double n2) {
        operation = new add();
        return operation.performOperation(n1,n2);
    }

    public Double subtract(Double n1, Double n2) {
        operation = new subtract();
        return operation.performOperation(n1,n2);

    }
    public Double multiply(Double n1, Double n2) {
        operation = new multiply();
        return operation.performOperation(n1,n2);

    }
    public Double divide(Double n1, Double n2) {
        operation = new divide();
        return operation.performOperation(n1,n2);
    }

}
