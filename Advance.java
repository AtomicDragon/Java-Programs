public class Advance extends Ticket
{
	protected int price;

	public Advance()
	{
		price=0;
	}
	public Advance(int d)
	{
		if(d >=10)
		{
			price = 30;
		}
		else if(d>=0)
		{
			price = 40;
		}
		else
		{
			price = 50;
		}
	}
	public double getPrice()
	{
		return price;
	}
}
