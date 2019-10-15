package accsc250p8work;
import java.util.ArrayList;

public class Investment 
{
	ArrayList<Contribution> theContributions;
	
	public Investment()
	{
		this.theContributions = new ArrayList<Contribution>();
	}
	
	void addContribution(Contribution c)
	{
		this.theContributions.add(c);
	}
	
	double getCurrentValue(int afterHowManyMonth)
	{
		//return the current value of this investment taking
		//time and an average 8% yearly or 0.67% monthly return
		//over afterHowManyMonths number of months
		double currentvalue = 0;
		
		for(int i = 0; i < afterHowManyMonth; i++) //Increments months
		{
			// Have to multiply current value by interest rate each time
			// Add value of contributions that were added in this month
			
			currentvalue = currentvalue * 1.0067;
			
			for(int a = 0; a < theContributions.size(); a++)
			{
				if(theContributions.get(a).monthNumber == i)
				{
					currentvalue = currentvalue + theContributions.get(a).amount;
				}
			}
		}
		return currentvalue;
	}
	
	double getTotalContributions()
	{
		//return the total amount ever investment not taking into
		//account interest.
		double totalvalue = 0;
		
		for(int a = 0; a < theContributions.size(); a++)
		{
			totalvalue = totalvalue + theContributions.get(a).amount;
		}
	
		return totalvalue;
	}
	
}
