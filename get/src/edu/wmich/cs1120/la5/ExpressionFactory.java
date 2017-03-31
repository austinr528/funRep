package edu.wmich.cs1120.la5;

public class ExpressionFactory {
	/**
	 * this makes objects and decides to either add or subtract
	 * @param operator is a char either a + or a -
	 * @param val1 an int 
	 * @param val2 an int
	 * @return an object of type IExpression that has the value of the binary expression
	 */
	public static IExpression getExpression(char operator, int val1, int val2){
		Addition add = new Addition();
		Subtraction sub = new Subtraction();
		int sum;
		Literal l1 = new Literal(val1);
		Literal l2 = new Literal(val2);
		BinaryExpression be = new BinaryExpression(l1, l2, operator);
		
		if(operator =='-'){
			
			sum = sub.perform(l1, l2);
		}
		else{
			
			sum = add.perform(l1, l2);
		}
		
		l1.setValue(sum);
		
		return l1;
	}

}
