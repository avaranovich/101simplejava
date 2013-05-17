package org.softlang.company.features;

import org.softlang.company.features.recognizer.Parser;

public class Total extends Parser {

    private double total = 0;
    
    public double getTotal() {
        return total;
    }
    
    protected void handleEmployee(boolean isFinal, String name, String address, Double salary) {
        total += salary;
    }

}