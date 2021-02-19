package logic;

public class CashierController {
	//The parameter a is what you have to pay
	//The parameter b is what you give
	//The return is the change
	public String transactionWithChange(double a, double b) {
		if(a<0)
			a=-a;
		if(b<0)
			b=-b;
		if(b-a<0)
			return "Not enough money, you need "+String.valueOf(a-b);
		else
			return "Here is your change: "+String.valueOf(b-a);
	}
}
