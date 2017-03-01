public class Employee
{
	protected String first;
	protected String last;
	protected int security;

	public Employee ()
	{
		first = "";
		last = "";
		security =0;
	}
	public Employee (String f, String l, int s)
	{
		first = f;
		last = l;
		security = s;
	}
	public void setFirst(String f)
	{
		first = f;
	}
	public void setLast(String l)
	{
		last = l;
	}
	public void setSecurity (int s)
	{
		security = s;
	}
	public String getFirst()
	{
		return first;
	}
	public String getLast()
	{
		return last;
	}
	public int getSecurity()
	{
		return security;
	}
	public String toString()
	{
		String str;
		str = "First Name: "+first+"\n"+
		"Last Name: "+last+"\n"+
		"Social Security: "+security+"\n";
		return str;
	}
}