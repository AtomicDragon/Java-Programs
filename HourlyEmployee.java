public class HourlyEmployee extends Employee
{
	protected int wage;
	protected int hours;

	public HourlyEmployee ()
	{
		wage=0;
		hours=0;
	}
	public HourlyEmployee (String f, String l, int s, int r, int i)
	{
		super(f,l,s);
		wage = r;
		hours= i;
	}
	public void setWage (int r)
	{
		wage = r;
	}
	public void setHours (int s)
	{
		hours = s;
	}
	public int getWage()
	{
		return wage;
	}
	public int getHours()
	{
		return hours;
	}
	public String toString()
	{
		String str;
		str = super.toString()+
		"Wage: "+wage+"\n"+
		"Hours worked: "+hours+"\n";
		return str;
	}
}