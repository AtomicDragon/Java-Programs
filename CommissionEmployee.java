public class CommissionEmployee extends Employee
{
	protected int rate;
	protected int sales;

	public CommissionEmployee ()
	{
		rate=0;
		sales=0;
	}
	public CommissionEmployee (String f, String l, int s,int r, int i)
	{
		super(f,l,s);
		rate = r;
		sales=i;
	}
	public void setRate (int r)
	{
		rate = r;
	}
	public void setSales (int s)
	{
		sales = s;
	}
	public int getRate()
	{
		return rate;
	}
	public int getSales()
	{
		return sales;
	}
	public String toString()
	{
		String str;
		str = super.toString()+
		"Commission Rate: "+rate+"\n"+
		"Gross sales: "+sales+"\n";
		return str;
	}
}