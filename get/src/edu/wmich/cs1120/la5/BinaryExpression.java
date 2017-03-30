package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	private int left;
	private int right;
	private char c;
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
