public class EmployeeTest
{
	public static void main (String [] args)
	{
		Employee a = new SalariedEmployee("Robert","Kenyon",213123, 80);
		Employee b = new CommissionEmployee("Ben","Park",634565, 5, 23);
		Employee c = new HourlyEmployee ("Michael", "Barmann", 630924, 10,8);
		Employee d = new BasePlusCommissionEmployee("Alex","Stein", 989879, 26, 121, 40);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}