package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	private int left;
	private int right;
	private char c;
	/**
	 * the constructor
	 * @param left an object of Literal type
	 * @param right an object of Literal type
	 * @param c a char either + or -
	 */
	BinaryExpression(Literal left, Literal right, char c){
		this.left = left.getValue();
		this.right = right.getValue();
		this.c = c;
		
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
