public class TestProduct
{
	public static void main (String [] args)
	{

		Product p1 = new Product();
		Product p2 = new Product(p1);
		Product p3 = new Product("java","AP-CS",112.95);

		String a = "Awesome stuff";
		p1.setCode(a);
		String b = "Amazing discription";
		p1.setDescription(b);
		double price1 = 9000.1;
		p1.setPrice(price1);
		String c = "Bananas are interesting";
		p2.setCode(c);
		String d = "Dragons are awesome";
		p2.setDescription(d);
		double price2 = 42.42;
		p2.setPrice(price2);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		p3.setDescription(p2.getDescription());

		int z = p1.getQuantity()+p2.getQuantity()+p3.getQuantity();
		System.out.println(z);

	}
}