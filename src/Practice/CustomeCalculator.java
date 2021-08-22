package Practice;

class InvalidInputExpection extends Exception {

	@Override
	public String toString() {

		return "cannot add 8 and 9";
	}

	@Override
	public String getMessage() {
		return "I am getMessage()";
	}

}

class CannotDivideByZeroException extends Exception {

	@Override
	public String toString() {

		return "cannot divide by 0";

	}

	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}

class MaxInputExceptionException extends Exception {

	@Override
	public String toString() {

		return "inputs is greater than 100000";

	}

	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}

class MaxMultiplierException extends Exception {

	@Override
	public String toString() {

		return "input to be greater than 7000";

	}

	@Override
	public String getMessage() {
		return "I am getMessage()";
	}
}

class Calculator {

	public double c;

	double Addition(double a, double b) throws InvalidInputExpection, MaxInputExceptionException {

		if (a == 8 || b == 9) {

			throw new InvalidInputExpection();

		} else if (a == 100000 || b == 100000) {

			throw new MaxInputExceptionException();
		}
		System.out.println("Addition of a and b is: " + c);
		c = a + b;

		return c;

	}

	double Subtraction(double a, double b) {

		c = a - b;

		System.out.println("Subtraction of a and b is: " + c);

		return c;

	}

	double Multiplication(double a, double b) throws MaxMultiplierException {

		if (a == 7000 || b == 7000) {

			throw new MaxMultiplierException();

		}

		c = a * b;

		System.out.println("Multiplication of a and b is: " + c);

		return c;

	}

	double Division(double a, double b) throws CannotDivideByZeroException {

		if (b == 0) {
			throw new CannotDivideByZeroException();

		}
		c = a / b;

		System.out.println("Division of a and b is: " + c);

		return c;
	}

}// Calculator

public class CustomeCalculator {

	public static void main(String[] args) throws InvalidInputExpection, CannotDivideByZeroException,
			MaxInputExceptionException, MaxMultiplierException {

		Calculator cal = new Calculator();

		/*
		 * cal.Addition(4, 2); cal.Subtraction(4, 2); cal.Multiplication(4, 2);
		 * cal.Division(4, 2);
		 */
		//
		System.out.println("throwing the following exceptions");

		// cal.Addition(8, 9);
		// cal.Division(4, 0);
		// cal.Addition(100000, 4);
		cal.Multiplication(7000, 2);
		
		
		 /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */

	}

}
