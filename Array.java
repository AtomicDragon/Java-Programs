import java.util.ArrayList;

public class Array
{
public static void main ( String args[])
{
ArrayList<String> x = new ArrayList<String>();
x.add("5");
x.add("-2");
x.add("20");
x.add("-7");
x.add("0");
x.add("10");
System.out.println("Old array: " );
for(int i = 0; i< x . length(); i++)
{
System.out.println(x[i]);
}

for(int i = 0; i< x . length(); i++)
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
for(int i = 0; i< x . length(); i++)
{
System.out.println(x[i]);
}
}
}