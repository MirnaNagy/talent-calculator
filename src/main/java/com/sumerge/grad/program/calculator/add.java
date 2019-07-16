package com.sumerge.grad.program.calculator;

import com.sumerge.grad.program.operation.ArithmeticOperation;

public class add implements ArithmeticOperation {

    public Double performOperation(Double n1, Double n2) {
        return n1+n2;
    }

}
