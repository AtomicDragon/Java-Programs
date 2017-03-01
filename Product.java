public class Product
{
	private String code;
	private String description;
	private double price;

	private static int quantity;

	public static int getQuantity()
	{
		return quantity;
	}
	public Product()
	{
		this.code="";
		this.description="";
		this.price=0.0;
		this.quantity++;
	}
	public Product(String c, String d, double p)
	{
		this.code = c;
		this.description = d;
		this.price = p;
		this.quantity++;
	}
	public Product(Product p)
	{
		this.code = p.code;
		this.description = p.description;
		this.price = p.price;
		this.quantity++;
	}
	public String getCode()
	{
		return code;
	}
	public String getDescription()
	{
		return description;
	}
	public double getPrice()
	{
		return price;
	}
	public void setCode(String c)
	{
		this.code = c;
	}
	public void setDescription(String d)
	{
		this.description = d;
	}
	public void setPrice(double p)
	{
		this.price = p;
	}
	public String toString()
	{
		String str;
		str = "Code: " + code + "\n"+"Description:"+description+"\n"+
		"Price:"+price+"\n";
		return str;
	}
}