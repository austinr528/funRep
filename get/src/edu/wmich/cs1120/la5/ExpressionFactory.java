package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	
	public static IExpression getExpression(char operator, int val1, int val2){
		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		int sum;
		Literal l1 = new Literal(val1);
		Literal l2 = new Literal(val2);
		BinaryExpression be = new BinaryExpression(l1, l2, operator);
		if(operator == '+'){
			sum = add.perform(l1, l2);
		}
		else{
			sum = sub.perform(l1, l2);
		}
		l1.setValue(sum);
		
		return l1;
	}

}
