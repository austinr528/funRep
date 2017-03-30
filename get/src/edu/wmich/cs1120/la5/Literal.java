package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	private int num;
	Literal(int num){
		this.num = num;
	}

	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return num;
	}
	public void setValue(int num){
		this.num = num;
	}

}
