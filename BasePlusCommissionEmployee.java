public class BasePlusCommissionEmployee extends CommissionEmployee
{
	protected int salary;

	public BasePlusCommissionEmployee ()
	{
		salary=0;
	}
	public BasePlusCommissionEmployee (String f, String l, int s,int r, int i,int b)
	{
		super(f,l,s,r,i);
		salary=b;
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
		"Base Salary: "+salary+"\n";
		return str;
	}
}