public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
	}
	public StudentAdvance(int d)
	{
		super(d);
		super.price = super.price/2;
	}
	public String toString()
	{
		return super.toString()+"\n(student ID required)";
	}
	public static void main (String [] args)
	{
		Advance a = new Advance(5);
		Advance b = new StudentAdvance(14);

		System.out.println(a);
		System.out.println();
		System.out.println(b);
	}
}
