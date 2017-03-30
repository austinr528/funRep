package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	public static IExpression getExpression(char operator, int val1, int val2){
		
		Literal l1 = new Literal(val1);
		Literal l2 = new Literal(val2);
		BinaryExpression be = new BinaryExpression(l1, l2, operator);
		if(operator == '+');{
			
		}
		return null;
	}

}
