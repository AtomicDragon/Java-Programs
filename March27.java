public class March27
{
	public static void main(String [] args)
	{
		String [] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String [] newmonths = changeMonths(months);
		for (int j = 0; j<newmonths.length;j++)
		{
			System.out.println(newmonths[j]);
		}
	}


	public static String[] changeMonths(String [] array)
	{
		for (int i = 0; i<array.length; i++)
		{
			String  a = array [i];
			if(a.substring(a.length()-3).equals("ary"))
			{
				array[i] = a.substring(0,a.length()-3)+"ber";
			}
			else if(a.substring(a.length()-3).equals("ber"))
			{
				array[i] = a.substring(0,a.length()-3)+"ary";
			}
		}
		return array;
	}

	public static int[] changeArray(int[] array)
	{
		int count;
		for (int k = 0; k<array.length;k++)
		{
			if (array[k]%2 == 1)
			{
				count++;
			}
		}
		int [] b = new int [array.length+count];
		for(int l=0; l<b.length;l++)
		{
			if(array[l]%2 == 1)
			{
				if(array[l]>0)
				{
					b[l] = array[l]+1;
					b[l+1] = (array[l]+1)*-1;
					l++;
				}
				else
				{
					b[l] = array[l]-1;
					b[l+1] = (array[l]-1)*-1;
					l++;
				}
			}
			else
			{
				b[l] = array [l];
			}
		}
		return b;
	}
	ArrayList <int> x = new ArrayList <int> ()
	System.out.println("Old array: " );
	for(int i = 0; i< x . size(); i++)
	{
		System.out.println(x[i]);
	}

	for(int i = 0; i< x . size(); i++)
	{
		if (x [ i ] >= 0 )
		{
			if ( (x [ i ] / 2) != 0)
			{
				x.add( i , x[ i ] +1);
				x.add( i , x[ i ] +1);
			}
		}
		else
		{
			if (( x [ i ] / 2) != 0)
			{
				x.add( i , x[ i ] -1);
				x.add( i , x[ i ] -1);
			}
		}
	}
	System.out.println("\nNew Array: ");
	for(int i = 0; i< x . size(); i++)
	{
		System.out.println(x[i]);
	}
}