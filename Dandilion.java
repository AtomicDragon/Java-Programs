public class Dandilion
{
	public static void main (String args []) throws InterruptedException
	{
		for(int i=0; i > -1; i++){
			if((i%2) == 0) {
				System.out.println("She loves me");
				Thread.sleep(1000);
			} else {
				System.out.println("She loves me not");
				Thread.sleep(1000);
			}
		}
	}
}