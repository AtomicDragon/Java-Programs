public class SalariedEmployee extends Employee
{
	protected int salary;

	public SalariedEmployee ()
	{
		salary=0;
	}
	public SalariedEmployee (String f, String l, int s, int i)
	{
		super(f,l,s);
		salary=i;
	}
	public void setSalary (int s)
	{
		salary = s;
	}
	public int getSalary()
	{
		return salary;
	}
	public String toString()
	{
		String str;
		str = super.toString()+
		"Weekly Salary: "+salary+"\n";
		return str;
	}
}