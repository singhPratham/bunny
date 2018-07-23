package com.bunny.evaluator;

import com.bunny.validator.Validator;

public class Evaluator {
    
    private Validator validator;

    public Evaluator() {
        validator = new Validator();
    }

    public int evaluate (final String query) {
	
	final boolean isValid = validator.validate(query);

	if (isValid) {
	    final String[] tokens = query.split(" ");
	    final int leftOperand = Integer.parseInt(tokens[0]);	    	        
	    final int rightOperand = Integer.parseInt(tokens[2]);
	    final int result = calculate(leftOperand, rightOperand, tokens[1]);
	    return result;
	}

	return 0;
    }


    public calculate (final int leftOperand, final int rightOperand, final String operator) {

	switch (operator) {
	    
            case "+" : return leftOperand + rightOperand;
                       break;

	    case "-" : return leftOperand - rightOperand;
		       break;
	
	    case "*" : return leftOperand * rightOperand;
		       break;

	    case "/" : return leftOperand / rightOperand;
		       break;
            
            default : return 0;
		      break;

	}
    }
}
