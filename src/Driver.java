package accsc250p8work;
public class Driver 
{
	public static void main(String[] args) 
	{
		Investment a = new Investment();
		Investment b = new Investment();
		Investment c = new Investment();
		
		a.addContribution(new Contribution(1200, 1)); 
		int month = 1;
		for(int i = 0; i < 12; i++)
		{
			b.addContribution(new Contribution(100, month));
		    month = month + 12;
		}
		
		c.addContribution(new Contribution(202, 1));
		
		int totalInvestmentTime = 4; //How long the investment will last in terms of months
		
		//The results from 4 months causes 1.0067 to times and add for two times from investment functions for $1200 
		System.out.println(a.getCurrentValue(totalInvestmentTime));
		System.out.println(b.getCurrentValue(totalInvestmentTime));
		System.out.println(c.getCurrentValue(totalInvestmentTime));
	}
}
