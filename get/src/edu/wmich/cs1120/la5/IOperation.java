package edu.wmich.cs1120.la5;

public interface IOperation {
	/**
	 * this method takes and does either addition or subtraction with the parameters values
	 * @param left an object that implements IExpression 
	 * @param right an object that implements IExpression 
	 * @return returns the sum of the expression as an integer
	 */
	Integer perform(IExpression left, IExpression right);

}
